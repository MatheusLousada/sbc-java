package br.gov.sp.saobernardo.webservice.paradigma.controller;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import org.junit.Ignore;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.MaterialModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.SocioModel;
import br.gov.sp.saobernardo.webservice.orcom.controller.ParadigmaFornecedorController;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class TestFornecedorNoParadigma {
	private boolean imprimirQuery = true;

	@Ignore
	@Test
	public void testaSelecaoDeTodosFornecedores() throws Exception {
		ParadigmaFornecedorController fornecedor = new ParadigmaFornecedorController(Ambientes.ORCOM_HOMOLOGACAO, imprimirQuery);
		List<EmpresaModel> fornecedores = fornecedor.buscaTodas();

		for (EmpresaModel empresa : fornecedores) {

			// EmpresaModel empresa = fornecedores.get(3500);

			StringBuilder empresaStr = new StringBuilder();
			empresaStr.append("Dados cadastrais: \n");
			empresaStr.append("Razão Social: " + empresa.getNomeEmpresa());
			empresaStr.append("\n");
			empresaStr.append("Nome Fantasia: " + empresa.getNomeFantasia());
			empresaStr.append("\n");
			empresaStr.append("CNPJ: " + empresa.getCnpj());
			empresaStr.append("\n");
			empresaStr.append("I. Est: " + empresa.getInscricaoEstadual());
			empresaStr.append("\n");
			empresaStr.append("I. Mun: " + empresa.getInscricaoMunicipal());
			empresaStr.append("\n");
			empresaStr.append("ME/EPP: " + empresa.getMicroOuPequenoPorte().getTipo());
			empresaStr.append("\n");
			empresaStr.append("Bco: " + empresa.getBanco().getCodigoDobanco());
			empresaStr.append("E-mail: " + empresa.getEmailContato());

			// if (empresa.getBanco().getAgencia()!=null){
			empresaStr.append("\n");
			empresaStr.append("Ag: " + empresa.getBanco().getAgencia().getNumero());
			empresaStr.append("\n");
			empresaStr.append("Ag dígito: " + empresa.getBanco().getAgencia().getDigito());
			empresaStr.append("\n");
			// }

			empresaStr.append("ct: " + empresa.getBanco().getContaCorrente().getNumero());
			empresaStr.append("\n");
			empresaStr.append("ct dígito: " + empresa.getBanco().getContaCorrente().getDigito());
			empresaStr.append("\n");
			empresaStr.append("\n");
			empresaStr.append("Endereço da matriz: \n");
			empresaStr.append("CEP: " + empresa.getEndereco().getCep());
			empresaStr.append("\n");
			empresaStr.append("Endereço: " + empresa.getEndereco().getDescricao());
			empresaStr.append("\n");
			empresaStr.append("Número: " + empresa.getEndereco().getNumero());
			empresaStr.append("\n");
			empresaStr.append("Bairro: " + empresa.getEndereco().getBairro());
			empresaStr.append("\n");
			empresaStr.append("\n");

			empresaStr.append("Endereço de correspondência: \n");
			empresaStr.append("CEP: " + empresa.getEnderecoCorrespondencia().getCep());
			empresaStr.append("\n");
			empresaStr.append("Endereço: " + empresa.getEnderecoCorrespondencia().getDescricao());
			empresaStr.append("\n");
			empresaStr.append("Número: " + empresa.getEnderecoCorrespondencia().getNumero());
			empresaStr.append("\n");
			empresaStr.append("Bairro: " + empresa.getEnderecoCorrespondencia().getBairro());
			empresaStr.append("\n");
			empresaStr.append("\n");

			empresaStr.append("DDD: " + empresa.getDdd());
			empresaStr.append("\n");
			empresaStr.append("Telefone 1: " + empresa.getTelefone1());
			empresaStr.append("\n");
			empresaStr.append("Telefone 2: " + empresa.getTelefone2());
			empresaStr.append("\n");
			empresaStr.append("Fax: " + empresa.getFax());
			empresaStr.append("\n");

			empresaStr.append("\n");
			empresaStr.append("\n");
			empresaStr.append("Materiais: \n");
			for (MaterialModel material : empresa.getMateriais()) {
				empresaStr.append(material.getGrupo());
				empresaStr.append(material.getSubGrupo());
				empresaStr.append(" ");
				empresaStr.append(material.getDescricao());
				empresaStr.append("\n");
			}

			empresaStr.append("\n");
			empresaStr.append("Certificado de registro cadastral: \n");
			empresaStr.append("Certidao Neg. Tributos Municipais Mobiliario: "
					+ empresa.getCertidaoNegTributosMunicipaisMobi().getDataDeValidade());
			empresaStr.append("\n");

			empresaStr.append("Certidao Neg. Tributos Estaduais: "
					+ empresa.getCertidaoNegTributosEstaduais().getDataDeValidade());
			empresaStr.append("\n");

			empresaStr.append(
					"Certidao Neg. Tributos Federais: " + empresa.getCertidaoNegTributosFederais().getDataDeValidade());
			empresaStr.append("\n");

			empresaStr.append("Certidao Neg. Debitos Trabalhistas: "
					+ empresa.getCertidaoNegDebitosTrabalhistas().getDataDeValidade());
			empresaStr.append("\n");

			empresaStr.append("Certidao Neg. Falencia e Concordata: "
					+ empresa.getCertidaoNegFalenciaEConcordata().getDataDeValidade());
			empresaStr.append("\n");

			empresaStr.append("\n");
			empresaStr.append("Sócios: \n");
			for (SocioModel socio : empresa.getSocios()) {
				empresaStr.append("Nome: " + socio.getNome());
				empresaStr.append(" ");
				empresaStr.append("Tipo de Documento: " + socio.getTipoDocumento());
				empresaStr.append(" ");
				empresaStr.append("Documento: " + socio.getDocumento());
				empresaStr.append(" ");
				empresaStr.append("Tipo: " + socio.getTipoUsuario());
				empresaStr.append(" ");
				empresaStr.append("E-mail: " + socio.getEmail());
				empresaStr.append("\n");
			}

			/*
			 * JFrame frame = new JFrame(); frame.setContentPane(new
			 * JOptionPane(empresaStr.toString())); frame.setVisible(true);
			 * frame.pack();
			 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 */

			JDialog jDialog = new JDialog();
			jDialog.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
			jDialog.setModal(true);

			JOptionPane contentPane = new JOptionPane(empresaStr.toString());
			jDialog.setContentPane(new JScrollPane(contentPane));
			jDialog.pack();
			jDialog.setVisible(true);

			/*
			 * try { Thread.sleep(2000); //sleep 5 seconds } catch
			 * (InterruptedException e) { e.printStackTrace(); }
			 * frame.setVisible(false);
			 */

		}

		assertTrue(fornecedores.size() > 1000);

	}

}
