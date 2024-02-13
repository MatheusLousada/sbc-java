package br.gov.sp.saobernardo.webservice.paradigma.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.DocumentoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoDeRegularidadeDoFGTS;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegDebitosTrabalhistas;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegFalenciaEConcordata;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegTributosEstaduais;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegTributosFederais;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegTributosMunicipaisMobi;
import br.gov.sp.saobernardo.webservice.classes.modelos.Certificado;
import br.gov.sp.saobernardo.webservice.paradigma.util.DateFormatter;

public class DocumentoDAO implements DocumentoDAOInterface {

	private static final String ID_CERTIDAO_NEGATIVA_TRIBUTOS_MUNICIPAIS_MOBILIARIO = "26";
	private static final String ID_CERTIDAO_NEGATIVA_TRIBUTOS_ESTADUAIS = "23";
	private static final String ID_CERTIDAO_NEGATIVA_TRIBUTOS_FEDERAIS = "21";
	private static final String ID_CERTIDAO_NEGATIVA_FALENCIA_E_CONCORDATA = "24";
	private static final String ID_CERTIDAO_REGULARIDADE_DO_FGTS = "16";
	private static final String ID_CERTIDAO_NEGATIVA_DEBITOS_TRABALHISTAS = "15";

	@SuppressWarnings("unused")
	private static final String ID_CERTIDAO_NEGATIVA_DEBITOS_CONTRIBUICOES_PREVIDENCIARIAS_E_DE_TERCEIROS_VIA__RECEITA_FEDERAL = "4";
	@SuppressWarnings("unused")
	private static final String ID_LICENÇA_DE_FUNCIONAMENTOA_DA_VIGILANCIA_ESTADUAL_OU_MUNICIPAL_DENTRO_DO_PRAZO_DE_VALIDADE = "8";
	@SuppressWarnings("unused")
	private static final String ID_AUTORIZACAO_DE_FUNCIONAMENTO_EXPEDIDA_PELA_ANVISA_OU_A_EQUIVALENTE_PUBLICACAO_NA_IMPRENSA_OFICIAL_DA_UNIAO = "9";
	@SuppressWarnings("unused")
	private static final String ID_REGISTRO_OU_INSCRICAO_DA_EMPRESA_NO_CONSELHO_REGIONAL_DE_FARMACIA_PARA_O_CASO_DE_FORNECEDOR_DE_MEDICAMENTOS = "10";
	private DAOExecutor daoEx;

	public DocumentoDAO(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con);
	}

	private StringBuilder queryCertificados(String idCertidao) {

		final String where = String.format(
				"\n WHERE E.nCdEmpresa = ? AND CD.nCdDocumento = %s AND CD.tDtValidade is not null \n", idCertidao);

		StringBuilder query = new StringBuilder();

		query.append("SELECT  D.sNmDocumento, max( CD.tDtValidade ) as [tDtValidade] \n");
		query.append("\n FROM EMPRESA E INNER JOIN CRC C ON E.nCdEmpresa = C.nCdEmpresa \n");
		query.append("\n INNER JOIN CRC_DOCUMENTO CD ON C.nCdCrc = CD.nCdCrc \n");
		query.append("\n INNER JOIN E_DOCUMENTO D ON D.nCdDocumento = CD.nCdDocumento \n");
		query.append(where);
		query.append("\n GROUP BY d.sNmDocumento \n");
		query.append("\n ORDER BY d.sNmDocumento");

		return query;
	}

	public CertidaoNegTributosMunicipaisMobi buscaCertidaoNegTributosMunicipaisMobi(Long codigoWBCEmpresa)
			throws SQLException {

		CertidaoNegTributosMunicipaisMobi certidao = (CertidaoNegTributosMunicipaisMobi) executaQuery(
				new CertidaoNegTributosMunicipaisMobi(), ID_CERTIDAO_NEGATIVA_TRIBUTOS_MUNICIPAIS_MOBILIARIO,
				codigoWBCEmpresa);

		return certidao;

	}

	public CertidaoNegTributosEstaduais buscaCertidaoNegTributosEstaduais(Long codigoWBCEmpresa) throws SQLException {

		CertidaoNegTributosEstaduais certidao = (CertidaoNegTributosEstaduais) executaQuery(
				new CertidaoNegTributosEstaduais(), ID_CERTIDAO_NEGATIVA_TRIBUTOS_ESTADUAIS, codigoWBCEmpresa);

		return certidao;

	}

	public CertidaoNegTributosFederais buscaCertidaoNegTributosFederais(Long codigoWBCEmpresa) throws SQLException {

		CertidaoNegTributosFederais certidao = (CertidaoNegTributosFederais) executaQuery(
				new CertidaoNegTributosFederais(), ID_CERTIDAO_NEGATIVA_TRIBUTOS_FEDERAIS, codigoWBCEmpresa);

		return certidao;

	}

	public CertidaoNegDebitosTrabalhistas buscaCertidaoNegDebitosTrabalhistas(Long codigoWBCEmpresa)
			throws SQLException {

		CertidaoNegDebitosTrabalhistas certidao = (CertidaoNegDebitosTrabalhistas) executaQuery(
				new CertidaoNegDebitosTrabalhistas(), ID_CERTIDAO_NEGATIVA_DEBITOS_TRABALHISTAS, codigoWBCEmpresa);

		return certidao;

	}

	public CertidaoNegFalenciaEConcordata buscaCertidaoNegFalenciaEConcordata(Long codigoWBCEmpresa)
			throws SQLException {

		CertidaoNegFalenciaEConcordata certidao = (CertidaoNegFalenciaEConcordata) executaQuery(
				new CertidaoNegFalenciaEConcordata(), ID_CERTIDAO_NEGATIVA_FALENCIA_E_CONCORDATA, codigoWBCEmpresa);

		return certidao;

	}

	public CertidaoDeRegularidadeDoFGTS buscaCertidaoRegularidadeDoGets(Long codigoWBCEmpresa) throws SQLException {

		CertidaoDeRegularidadeDoFGTS certidao = (CertidaoDeRegularidadeDoFGTS) executaQuery(
				new CertidaoDeRegularidadeDoFGTS(), ID_CERTIDAO_REGULARIDADE_DO_FGTS, codigoWBCEmpresa);

		return certidao;

	}

	private Certificado executaQuery(Certificado certidao, String idQuery, Long codigoEmpresa) throws SQLException {
		StringBuilder query = queryCertificados(idQuery);
		try {

			daoEx.clearResetParameters().addParameter(codigoEmpresa);
			certidao.setDataDeValidade(preencheData(daoEx.executeQuery(query)));

		} finally {
			daoEx.close();
		}

		return certidao;
	}

	private String preencheData(ResultSet rs) throws SQLException {

		String dia = "";
		while (rs.next()) {
			dia = DateFormatter.formataDiaMesAno(rs.getDate("tDtValidade"));
		}
		rs.close();
		return dia;
	}

}