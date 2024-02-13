package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.util.StreamUtils;

import br.gov.sp.saobernardo.webservice.classes.modelos.UsuarioModel;

public class UsuarioDAOTest {

	private Connection connection;

	private static SingleConnectionDataSource ds;
	private static UsuarioDAO dao;

	@BeforeClass
	public static void setUp() throws SQLException, IOException {
		// Configuração do banco de dados H2 em memória
		ds = new SingleConnectionDataSource(
				"jdbc:h2:mem:test;MODE=MySQL;DATABASE_TO_LOWER=TRUE;INIT=CREATE SCHEMA IF NOT EXISTS usuario", "sa", "",
				true);

		// Leitura do arquivo de script SQL
		Resource resource = new ClassPathResource("db/usuario.sql");
		String sql = StreamUtils.copyToString(resource.getInputStream(), Charset.defaultCharset());

		// Execução do script SQL
		JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
		ScriptUtils.executeSqlScript(jdbcTemplate.getDataSource().getConnection(),
				new EncodedResource(resource, "UTF-8"));

		// Criação do DAO
		dao = new UsuarioDAO(ds.getConnection(), false);
	}

	@After
	public void tearDown() throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}

	@Test
	public void testBuscaPorCodigo() throws SQLException {
		String codigoWBC = "123";
		UsuarioModel usuario = dao.buscaPorCodigo(codigoWBC);
		Assert.assertEquals("João", usuario.getNomeUsuario());
		Assert.assertEquals(codigoWBC, usuario.getCodigoUsuario());
	}

	// Classe utilitária para ler o arquivo de texto
	@SuppressWarnings("unused")
	private String readFile(String fileName) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuilder.append(line);
			// stringBuilder.append(System.lineSeparator());
			stringBuilder.append(System.getProperty("line.separator"));
		}
		bufferedReader.close();
		return stringBuilder.toString();
	}

}