package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.EmpresaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.FaxFactory;
import br.gov.sp.saobernardo.webservice.classes.modelos.MaterialModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.MicroOuPequenoPorte;
import br.gov.sp.saobernardo.webservice.classes.modelos.NumeroTelefonico;
import br.gov.sp.saobernardo.webservice.classes.modelos.SituacaoEmpresa;
import br.gov.sp.saobernardo.webservice.classes.modelos.SocioModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.TelefoneFactory;
import br.gov.sp.saobernardo.webservice.classes.modelos.TipoPessoa;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class EmpresaDAOParadigma implements EmpresaDAOInterface {

	private DAOExecutor daoEx;

	public EmpresaDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	private String queryBase() {
		
		StringBuilder query = new StringBuilder();
		query.append(" SELECT ");
		query.append("concat( sDsContatoDDD, '.',  sDsContatoFone ) sDsContatoFone,");
		query.append("concat( sDsContatoFaxDDD, '.', sDsContatoFax ) sDsContatoFax, ");
		query.append("bFlAceitaRegulamento, bFlAposentado, bFlAreaInfluencia, bFlAssinaturaDigital, ");
		query.append("bFlAssinaturaEletronica, bFlAtividadeComercial, bFlAtividadeIndustrial, ");
		query.append("bFlAtividadeServico, bFlAtuacaoCredenciado, bFlAtuacaoFornecedor, bFlCprb, ");
		query.append("bFlFilial, bFlGrupoEDP, bFlInssPatronal, bFlIntegracaoSEGMC, bFlIntegrado,");
		query.append("bFlNaoInformarDadosComplementares, bFlRecadastroClasse, bFlRepresentante, ");
		query.append("dVlCapitalIntegralizado, dVlCapitalSocial, dVlPatrimonioLiquido");
		query.append(", dVlPatrionioLiquido, dVlReputacaoMercado, nCdAgenteCCEE, nCdANEEL, nCdAnexo, ");
		query.append("nCdCarteira, nCdCnae, nCdDistribuidora, nCdEmpresa, nCdEmpresaMatriz");
		query.append(", nCdEntidade, nCdFaixaFaturamento, nCdFusoHorario, nCdHomologacaoTipo, nCdIdioma,");
		query.append(" nCdMercadoAtuacao, nCdMoeda, nCdNaturezaJuridica, nCdPorte");
		query.append(", nCdProfissao, nCdSAMP, nCdSAP, nCdSegmento, nCdSetor, nCdTipoAgente, ");
		query.append("nCdTipoCadastro, nCdTipoCadastroMap, nIdLido, nIdNetting, nIdPerfilTributario");
		query.append(", nIdSituacaoDocumento, nIdSuperSimples, nIdTipoAdministracao, nIdTipoPessoa, ");
		query.append("nNrAutoAvaliacao, nNrFuncionarios, nNrNis, nNrNivelTensao, nNrNotaAvaliacao");
		query.append(", nNrPIS, nNrRG, nPcIncentivada, nQtDemandaContratadaForaPonta, nQtDemandaContratadaPonta, ");
		query.append("nQtUsuariosOpinaram, nStEmpresa, nStIntegracao, nVlAjusteMaximo");
		query.append(", nVlValorGlobal, sCdAtividadeMap, sCdCND, sCdEmpresaCliente, sCdEstadoIE, sCdPais, ");
		query.append("sCdPaisIE, sCdUsuarioCriador, sCdUsuarioGestor, sCdUsuarioHomologador");
		query.append(", sCdUsuarioLiberacao, sDsChecksum, sDsConhecimentoCliente, sDsContatoCaixaPostal, ");
		query.append("sDsContatoCargo,  sDsContatoEmail");
		query.append(", sDsContatoRamal, sDsEntidadeRegistradora, sDsEscopoTrabalho, sDsGrupoTarifario, ");
		query.append("sDsLocalNascimento, sDsLogo");
		query.append(", sDsPastaIntegracao, sDsProfissao, sDsProtocoloCadastro, sDsRegProfRespTecnico, ");
		query.append("sDsScoreCreditoEnertrade, sDsUrl, sNmApelido, sNmContato, sNmEmpresa");
		query.append(", sNmFantasia, sNmSocial, sNrAlvaraSanitario, sNrCelular, sNrCnpj, sNrCnpjMatriz, ");
		query.append("sNrFax, sNrInscricaoEstadual, sNrInscricaoMunicial, sNrInscricaoMunicipal");
		query.append(", sNrJuntaComercial, sNrPisNit, sNrPisPasep, sNrRegistroJuntaComercial, sNrRG, ");
		query.append("sSgGrupoConta, tDdDataReajuste, tDtAceitaRegulamento, tDtAlteracao");
		query.append(", tDtAlteracaoCapitalSocial, tDtAlvaraSanitario, tDtCadastro, tDtCapitalIntegralizado, ");
		query.append("tDtFinalInativo, tDtInicioAtividade, tDtIntegralizacao");
		query.append(", tDtJuntaComercial, tDtLiberacao, tDtNascimento, tDtRegistroJuntaComercial, ");
		query.append("tDtReputacaoMercado, tDtValidadeCadastro");
		query.append("\n FROM EMPRESA ");

		// query.append(String.format(WHERE sNrCnpj = '%s'",cnpj));
		return query.toString();
	}

	public EmpresaModel buscaPeloCodigoDaParadigma(Long codigoWBC) throws SQLException {

		String query = queryBase() + "\n WHERE nCdEmpresa = ? ";

		EmpresaModel empresa = new EmpresaModel();
		daoEx.addParameter(codigoWBC);
		ResultSet rs = daoEx.executeQuery(query);
		while (rs.next()) {
			String cnpj = rs.getString("sNrCnpj");
			String emailContato = rs.getString("sDsContatoEmail");
			String nomeEmpresa = rs.getString("sNmEmpresa");
			String nomeFantasia = rs.getString("sNmFantasia");
			long situacao = rs.getLong("nStEmpresa");
			int beneficiarioLei123 = rs.getInt("nIdSuperSimples");
			// long tipoEmpresa = rs.getLong("");

			EnderecoDAOParadigma enderecoDAO = new EnderecoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			EnderecoModel endereco = enderecoDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC, 0L);

			empresa.setCnpj(cnpj);
			empresa.setCodigoEmpresa(cnpj);
			empresa.setEmailContato(emailContato);
			// empresa.setLogDaGravacao(logDaGravacao);
			empresa.setNomeEmpresa(nomeEmpresa);
			empresa.setNomeFantasia(nomeFantasia);
			empresa.setSituacao(new SituacaoEmpresa(situacao));
			// empresa.setTipoEmpresa(new TipoEmpresa(tipoEmpresa));
			empresa.setBeneficiarioLei123(beneficiarioLei123);
			empresa.setEndereco(endereco);

		}
		rs.close();
		daoEx.close();

		return empresa;

	}

	public List<EmpresaModel> buscaTodasEmpresasAlteradasRecentemente() throws SQLException {

		Calendar ontem = Calendar.getInstance();
		ontem.add(Calendar.DATE, -1);
		ontem.set(Calendar.HOUR_OF_DAY, 0);
		ontem.set(Calendar.MINUTE, 0);
		ontem.set(Calendar.SECOND, 0);

		StringBuilder query = new StringBuilder();
		query.append(queryBase()).append("\n WHERE tDtAlteracao >= ?");

		List<EmpresaModel> empresas = new ArrayList<EmpresaModel>();
		daoEx.addParameter(new java.sql.Date(ontem.getTimeInMillis()));
		daoEx.setSql(query);
		ResultSet rs = daoEx.executeQuery();

		while (rs.next()) {

			EmpresaModel empresa = new EmpresaModel();
			String cnpj = rs.getString("sNrCnpj");
			String emailContato = rs.getString("sDsContatoEmail");
			String nomeEmpresa = rs.getString("sNmEmpresa");
			String nomeFantasia = rs.getString("sNmFantasia");
			long situacao = rs.getLong("nStEmpresa");
			int beneficiarioLei123 = rs.getInt("nIdSuperSimples");
			long codigoWBC = rs.getLong("nCdEmpresa");
			// long tipoEmpresa = rs.getLong("");
			String inscricaoMunicipal = rs.getString("sNrInscricaoMunicipal");
			String inscricaoEstadual = rs.getString("sNrInscricaoEstadual");

			TelefoneFactory telefoneFactory = new TelefoneFactory(rs.getString("sDsContatoFone"));

			NumeroTelefonico telefone1 = telefoneFactory.getTelefone1();
			if (null != telefone1) {
				empresa.setDdd(telefone1.getDdd());
				empresa.setTelefone1(telefone1.getNumero());
			}

			NumeroTelefonico telefone2 = telefoneFactory.getTelefone2();

			if (null != telefone2)
				empresa.setTelefone2(telefone2.getNumero());

			FaxFactory faxFactory = new FaxFactory(rs.getString("sDsContatoFax"));
			NumeroTelefonico fax = faxFactory.getFax();
			if (null != fax) {
				empresa.setFax(fax.getNumero());
				if (null == empresa.getDdd() && null != fax.getDdd()) {
					empresa.setDdd(fax.getDdd());
				}
			}

			empresa.setCodigoEmpresa(String.valueOf(codigoWBC));
			empresa.setCnpj(cnpj);
			empresa.setCodigoEmpresa(cnpj);
			empresa.setEmailContato(emailContato);
			// empresa.setLogDaGravacao(logDaGravacao);
			empresa.setNomeEmpresa(nomeEmpresa);
			empresa.setNomeFantasia(nomeFantasia);
			empresa.setSituacao(new SituacaoEmpresa(situacao));
			// empresa.setTipoEmpresa(new TipoEmpresa(tipoEmpresa));
			empresa.setBeneficiarioLei123(beneficiarioLei123);
			empresa.setInscricaoMunicipal(inscricaoMunicipal);
			empresa.setInscricaoEstadual(inscricaoEstadual);
			empresa.setMicroOuPequenoPorte(new MicroOuPequenoPorte(beneficiarioLei123));

			EnderecoDAOParadigma enderecoDAO = new EnderecoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			EnderecoModel endereco = enderecoDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC, 0L);
			EnderecoModel enderecoCorrespondencia = enderecoDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC, 3L);

			BancoDAOParadigma bancoDAO = new BancoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			BancoModel banco = bancoDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC);

			empresa.setEndereco(endereco);
			empresa.setEnderecoCorrespondencia(enderecoCorrespondencia);

			empresa.setBanco(banco);

			MaterialDAOParadigma materialDAO = new MaterialDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			List<MaterialModel> materiais = materialDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC);
			empresa.setMateriais(materiais);

			DocumentoDAOParadigma documentoDAO = new DocumentoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			empresa.setCertidaoNegTributosMunicipaisMobi(documentoDAO.buscaCertidaoNegTributosMunicipaisMobi(codigoWBC));

			empresa.setCertidaoNegTributosEstaduais(documentoDAO.buscaCertidaoNegTributosEstaduais(codigoWBC));
			empresa.setCertidaoNegTributosFederais(documentoDAO.buscaCertidaoNegTributosFederais(codigoWBC));
			empresa.setCertidaoNegDebitosTrabalhistas(documentoDAO.buscaCertidaoNegDebitosTrabalhistas(codigoWBC));
			empresa.setCertidaoNegFalenciaEConcordata(documentoDAO.buscaCertidaoNegFalenciaEConcordata(codigoWBC));

			SocioDAOParadigma socioDAO = new SocioDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			List<SocioModel> socios = socioDAO.buscaSocios(codigoWBC);
			empresa.setSocios(socios);

			empresas.add(empresa);
		}

		rs.close();
		daoEx.close();

		return empresas;
	}

	public List<EmpresaModel> buscaTodasEmpresas() throws SQLException {

		StringBuilder query = new StringBuilder();

		query.append(queryBase());

		List<EmpresaModel> empresas = new ArrayList<EmpresaModel>();
		ResultSet rs = daoEx.executeQuery(query.toString());
		while (rs.next()) {
			EmpresaModel empresa = new EmpresaModel();
			String cnpj = rs.getString("sNrCnpj");
			String emailContato = rs.getString("sDsContatoEmail");
			String nomeEmpresa = rs.getString("sNmEmpresa");
			String nomeFantasia = rs.getString("sNmFantasia");
			long situacao = rs.getLong("nStEmpresa");
			int beneficiarioLei123 = rs.getInt("nIdSuperSimples");
			long codigoWBC = rs.getLong("nCdEmpresa");
			// long tipoEmpresa = rs.getLong("");
			String inscricaoMunicipal = rs.getString("sNrInscricaoMunicipal");
			String inscricaoEstadual = rs.getString("sNrInscricaoEstadual");

			TelefoneFactory telefoneFactory = new TelefoneFactory(rs.getString("sDsContatoFone"));

			NumeroTelefonico telefone1 = telefoneFactory.getTelefone1();
			if (null != telefone1) {
				empresa.setDdd(telefone1.getDdd());
				empresa.setTelefone1(telefone1.getNumero());
			}

			NumeroTelefonico telefone2 = telefoneFactory.getTelefone2();

			if (null != telefone2)
				empresa.setTelefone2(telefone2.getNumero());

			FaxFactory faxFactory = new FaxFactory(rs.getString("sDsContatoFax"));
			NumeroTelefonico fax = faxFactory.getFax();
			if (null != fax) {
				empresa.setFax(fax.getNumero());
				if (null == empresa.getDdd() && null != fax.getDdd()) {
					empresa.setDdd(fax.getDdd());
				}
			}

			empresa.setCodigoEmpresa(String.valueOf(codigoWBC));
			empresa.setCnpj(cnpj);
			empresa.setCodigoEmpresa(cnpj);
			empresa.setEmailContato(emailContato);
			// empresa.setLogDaGravacao(logDaGravacao);
			empresa.setNomeEmpresa(nomeEmpresa);
			empresa.setNomeFantasia(nomeFantasia);
			empresa.setSituacao(new SituacaoEmpresa(situacao));
			// empresa.setTipoEmpresa(new TipoEmpresa(tipoEmpresa));
			empresa.setBeneficiarioLei123(beneficiarioLei123);
			empresa.setInscricaoMunicipal(inscricaoMunicipal);
			empresa.setInscricaoEstadual(inscricaoEstadual);
			empresa.setMicroOuPequenoPorte(new MicroOuPequenoPorte(beneficiarioLei123));

			EnderecoDAOParadigma enderecoDAO = new EnderecoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			EnderecoModel endereco = enderecoDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC, 0L);
			EnderecoModel enderecoCorrespondencia = enderecoDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC, 3L);

			BancoDAOParadigma bancoDAO = new BancoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			BancoModel banco = bancoDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC);

			empresa.setEndereco(endereco);
			empresa.setEnderecoCorrespondencia(enderecoCorrespondencia);

			empresa.setBanco(banco);

			MaterialDAOParadigma materialDAO = new MaterialDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			List<MaterialModel> materiais = materialDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC);
			empresa.setMateriais(materiais);

			DocumentoDAOParadigma documentoDAO = new DocumentoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			empresa.setCertidaoNegTributosMunicipaisMobi(
					documentoDAO.buscaCertidaoNegTributosMunicipaisMobi(codigoWBC));

			empresa.setCertidaoNegTributosEstaduais(documentoDAO.buscaCertidaoNegTributosEstaduais(codigoWBC));
			empresa.setCertidaoNegTributosFederais(documentoDAO.buscaCertidaoNegTributosFederais(codigoWBC));
			empresa.setCertidaoNegDebitosTrabalhistas(documentoDAO.buscaCertidaoNegDebitosTrabalhistas(codigoWBC));
			empresa.setCertidaoNegFalenciaEConcordata(documentoDAO.buscaCertidaoNegFalenciaEConcordata(codigoWBC));

			SocioDAOParadigma socioDAO = new SocioDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			List<SocioModel> socios = socioDAO.buscaSocios(codigoWBC);
			empresa.setSocios(socios);

			empresas.add(empresa);
		}

		rs.close();
		daoEx.close();

		return empresas;
	}

	public List<EmpresaModel> buscaDadosCadastraisDeEmpresas() throws SQLException {

		StringBuilder query = new StringBuilder();
		query.append(queryBase()).append(
				"\n WHERE sNrCnpj != '04175146000129' and sNrCnpj != '11111111111111' and nStEmpresa >= 0 and nStEmpresa < 6 or nStEmpresa = 32 \n");

		ResultSet rs = daoEx.executeQuery(query);
		List<EmpresaModel> empresas = new ArrayList<EmpresaModel>();
		while (rs.next()) {
			EmpresaModel empresa = new EmpresaModel();
			String cnpj = rs.getString("sNrCnpj");
			String emailContato = rs.getString("sDsContatoEmail");
			String codigoFornecedor = rs.getString("sNmApelido");
			String nomeEmpresa = rs.getString("sNmEmpresa");
			String nomeFantasia = rs.getString("sNmFantasia");
			long situacao = rs.getLong("nStEmpresa");
			int beneficiarioLei123 = rs.getInt("nIdSuperSimples");
			long codigoWBC = rs.getLong("nCdEmpresa");
			// long tipoEmpresa = rs.getLong("");
			// String inscricaoMunicipal =
			// rs.getString("sNrInscricaoMunicipal");
			String inscricaoEstadual = rs.getString("sNrInscricaoEstadual");

			TelefoneFactory telefoneFactory = new TelefoneFactory(rs.getString("sDsContatoFone"));

			NumeroTelefonico telefone1 = telefoneFactory.getTelefone1();
			if (null != telefone1) {
				empresa.setDdd(telefone1.getDdd());
				empresa.setTelefone1(telefone1.getNumero());
			}

			NumeroTelefonico telefone2 = telefoneFactory.getTelefone2();

			if (null != telefone2)
				empresa.setTelefone2(telefone2.getNumero());

			FaxFactory faxFactory = new FaxFactory(rs.getString("sDsContatoFax"));
			NumeroTelefonico fax = faxFactory.getFax();
			if (null != fax) {
				empresa.setFax(fax.getNumero());
				if (null == empresa.getDdd() && null != fax.getDdd()) {
					empresa.setDdd(fax.getDdd());
				}
			}

			empresa.setCnpj(cnpj);
			empresa.setCodigoFornecedor(codigoFornecedor);
			empresa.setEmailContato(emailContato);
			empresa.setCodigo(String.valueOf(codigoWBC));
			// empresa.setLogDaGravacao(logDaGravacao);
			empresa.setNomeEmpresa(nomeEmpresa);
			empresa.setNomeFantasia(nomeFantasia);
			empresa.setSituacao(new SituacaoEmpresa(situacao));
			// empresa.setTipoEmpresa(new TipoEmpresa(tipoEmpresa));
			empresa.setBeneficiarioLei123(beneficiarioLei123);
			// empresa.setInscricaoMunicipal(inscricaoMunicipal);
			empresa.setInscricaoEstadual(inscricaoEstadual);
			empresa.setMicroOuPequenoPorte(new MicroOuPequenoPorte(beneficiarioLei123));

			BancoDAOParadigma bancoDAO = new BancoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			BancoModel banco = bancoDAO.buscaPeloCodigoDeEmpresaParadigma(codigoWBC);

			empresa.setBanco(banco);

			empresas.add(empresa);
		}

		rs.close();
		daoEx.close();

		return empresas;
	}

	public List<EmpresaModel> buscaDadosCadastraisDeNovasEmpresas() throws SQLException {

		Calendar dezDiasAtras = Calendar.getInstance();
		dezDiasAtras.add(Calendar.DATE, -10);
		dezDiasAtras.set(Calendar.HOUR_OF_DAY, 0);
		dezDiasAtras.set(Calendar.MINUTE, 0);
		dezDiasAtras.set(Calendar.SECOND, 0);

		StringBuilder query = new StringBuilder();
		// query.append("SELECT * FROM EMPRESA ");
		query.append(queryBase());
		query.append(
				"WHERE TDTLIBERACAO IS NOT NULL AND TDTLIBERACAO >= ? AND NCDEMPRESA IN(SELECT NCDEMPRESA FROM EMPRESA WHERE NSTEMPRESA BETWEEN 0 AND 6 OR NSTEMPRESA = 32)");
		// ps = con.prepareStatement(query.toString());
		// ps.setDate(1, new java.sql.Date(dezDiasAtras.getTimeInMillis()));

		// if (imprimirSQL) { ImprimeQuery.imprimeQuery(query.toString()); }

		daoEx.addParameter(new java.sql.Date(dezDiasAtras.getTimeInMillis()));
		ResultSet rs = daoEx.executeQuery(query);

		List<EmpresaModel> empresas = new ArrayList<EmpresaModel>();
		while (rs.next()) {
			EmpresaModel empresa = new EmpresaModel();
			String cnpj = rs.getString("sNrCnpj");
			long codigoWBC = rs.getLong("nCdEmpresa");
			String codigoFornecedor = rs.getString("sNmApelido");
			String emailContato = rs.getString("sDsContatoEmail");
			String nomeEmpresa = rs.getString("sNmEmpresa");
			String nomeFantasia = rs.getString("sNmFantasia");
			long situacao = rs.getLong("nStEmpresa");
			int beneficiarioLei123 = rs.getInt("nIdSuperSimples");
			String inscricaoEstadual = rs.getString("sNrInscricaoEstadual");

			empresa.setCnpj(cnpj);
			empresa.setCodigo(String.valueOf(codigoWBC));
			empresa.setCodigoFornecedor(codigoFornecedor);
			empresa.setEmailContato(emailContato);
			// empresa.setLogDaGravacao(logDaGravacao);
			empresa.setNomeEmpresa(nomeEmpresa);
			empresa.setNomeFantasia(nomeFantasia);
			empresa.setSituacao(new SituacaoEmpresa(situacao));
			empresa.setBeneficiarioLei123(beneficiarioLei123);
			empresa.setInscricaoEstadual(inscricaoEstadual);
			empresa.setMicroOuPequenoPorte(new MicroOuPequenoPorte(beneficiarioLei123));

			if (empresa.getCnpj().length() > 11) {
				empresa.setTipoIdentificacao("1");
			} else {
				empresa.setTipoIdentificacao("2");
			}

			TelefoneFactory telefoneFactory = new TelefoneFactory(rs.getString("sDsContatoFone"));

			NumeroTelefonico telefone1 = telefoneFactory.getTelefone1();
			if (null != telefone1) {
				empresa.setDdd(telefone1.getDdd());
				empresa.setTelefone1(telefone1.getNumero());
			}

			NumeroTelefonico telefone2 = telefoneFactory.getTelefone2();

			if (null != telefone2)
				empresa.setTelefone2(telefone2.getNumero());

			FaxFactory faxFactory = new FaxFactory(rs.getString("sDsContatoFax"));
			NumeroTelefonico fax = faxFactory.getFax();
			if (null != fax) {
				empresa.setFax(fax.getNumero());
				if (null == empresa.getDdd() && null != fax.getDdd()) {
					empresa.setDdd(fax.getDdd());
				}
			}

			empresas.add(empresa);
		}

		rs.close();
		daoEx.close();

		return empresas;
	}

	public EmpresaModel buscaPeloCnpj(String cnpj) throws SQLException {

		StringBuilder query = new StringBuilder();
		query.append(queryBase()).append("WHERE sNrCnpj = ?");

		daoEx.clearResetParameters().addParameter(cnpj);
		ResultSet rs = daoEx.executeQuery(query);
		EmpresaModel empresa = new EmpresaModel();

		while (rs.next()) {

			long codigoWBC = rs.getLong("nCdEmpresa");
			String codigoFornecedor = rs.getString("sNmApelido");
			String emailContato = rs.getString("sDsContatoEmail");
			String nomeEmpresa = rs.getString("sNmEmpresa");
			String nomeFantasia = rs.getString("sNmFantasia");
			long situacao = rs.getLong("nStEmpresa");
			int beneficiarioLei123 = rs.getInt("nIdSuperSimples");
			String inscricaoEstadual = rs.getString("sNrInscricaoEstadual");

			empresa.setCnpj(cnpj);
			empresa.setCodigo(String.valueOf(codigoWBC));
			empresa.setCodigoFornecedor(codigoFornecedor);
			empresa.setEmailContato(emailContato);
			// empresa.setLogDaGravacao(logDaGravacao);
			empresa.setNomeEmpresa(nomeEmpresa);
			empresa.setNomeFantasia(nomeFantasia);
			empresa.setSituacao(new SituacaoEmpresa(situacao));
			// empresa.setTipoEmpresa(new TipoEmpresa(tipoEmpresa));
			empresa.setBeneficiarioLei123(beneficiarioLei123);
			empresa.setInscricaoEstadual(inscricaoEstadual);
			empresa.setMicroOuPequenoPorte(new MicroOuPequenoPorte(beneficiarioLei123));
			// empresa.setTipoIdentificacao( (empresa.getCnpj().length() > 11) ?
			// "1":"2");
			empresa.setTipoIdentificacao((empresa.getCnpj().length() > 11) ? TipoPessoa.PESSOA_JURIDICA.getTipo(): TipoPessoa.PESSOA_FISICA.getTipo());

			TelefoneFactory telefoneFactory = new TelefoneFactory(rs.getString("sDsContatoFone"));

			NumeroTelefonico telefone1 = telefoneFactory.getTelefone1();

			if (null != telefone1) {
				empresa.setDdd(telefone1.getDdd());
				empresa.setTelefone1(telefone1.getNumero());
			}

			NumeroTelefonico telefone2 = telefoneFactory.getTelefone2();

			if (null != telefone2){
				empresa.setTelefone2(telefone2.getNumero());
			}

			FaxFactory faxFactory = new FaxFactory(rs.getString("sDsContatoFax"));
			NumeroTelefonico fax = faxFactory.getFax();

			if (null != fax) {

				empresa.setFax(fax.getNumero());

				if (null == empresa.getDdd() && null != fax.getDdd()) {
					empresa.setDdd(fax.getDdd());
				}
			}

			break;
		}

		rs.close();
		daoEx.close();

		return empresa;
	}

	public EmpresaModel buscaNovoPeloCnpj(String cnpj) throws SQLException {
		StringBuilder query = new StringBuilder();

		query.append(queryBase()).append("WHERE sNrCnpj = ?");

		// if (imprimirSQL) { ImprimeQuery.imprimeQuery(query.toString(), cnpj); }

		EmpresaModel empresa = new EmpresaModel();

		// Valores default , caso seja uma nova empresa
		empresa.setCnpj(cnpj);
		empresa.setTipoIdentificacao(
				(empresa.getCnpj().length() > 11 ? TipoPessoa.PESSOA_JURIDICA : TipoPessoa.PESSOA_FISICA).getTipo());
		empresa.setSituacao(new SituacaoEmpresa(SituacaoEmpresa.ATIVA));
		daoEx.clearResetParameters().addParameter(cnpj);
		ResultSet rs = daoEx.executeQuery(query);

		while (rs.next()) {

			long codigoWBC = rs.getLong("nCdEmpresa");
			String codigoFornecedor = rs.getString("sNmApelido");
			String emailContato = rs.getString("sDsContatoEmail");
			String nomeEmpresa = rs.getString("sNmEmpresa");
			String nomeFantasia = rs.getString("sNmFantasia");
			long situacao = rs.getLong("nStEmpresa");
			int beneficiarioLei123 = rs.getInt("nIdSuperSimples");
			String inscricaoEstadual = rs.getString("sNrInscricaoEstadual");

			empresa.setCnpj(cnpj);
			empresa.setCodigo(String.valueOf(codigoWBC));
			empresa.setCodigoFornecedor(codigoFornecedor);
			empresa.setEmailContato(emailContato);
			// empresa.setLogDaGravacao(logDaGravacao);
			empresa.setNomeEmpresa(nomeEmpresa);
			empresa.setNomeFantasia(nomeFantasia);
			empresa.setSituacao(new SituacaoEmpresa(situacao));
			// empresa.setTipoEmpresa(new TipoEmpresa(tipoEmpresa));
			empresa.setBeneficiarioLei123(beneficiarioLei123);
			empresa.setInscricaoEstadual(inscricaoEstadual);
			empresa.setMicroOuPequenoPorte(new MicroOuPequenoPorte(beneficiarioLei123));

			empresa.setTipoIdentificacao(
					(empresa.getCnpj().length() > 11 ? TipoPessoa.PESSOA_JURIDICA : TipoPessoa.PESSOA_FISICA)
							.getTipo());

			TelefoneFactory telefoneFactory = new TelefoneFactory(rs.getString("sDsContatoFone"));

			NumeroTelefonico telefone1 = telefoneFactory.getTelefone1();
			if (null != telefone1) {
				empresa.setDdd(telefone1.getDdd());
				empresa.setTelefone1(telefone1.getNumero());
			}

			NumeroTelefonico telefone2 = telefoneFactory.getTelefone2();

			if (null != telefone2)
				empresa.setTelefone2(telefone2.getNumero());

			FaxFactory faxFactory = new FaxFactory(rs.getString("sDsContatoFax"));
			NumeroTelefonico fax = faxFactory.getFax();
			if (null != fax) {
				empresa.setFax(fax.getNumero());
				if (null == empresa.getDdd() && null != fax.getDdd()) {
					empresa.setDdd(fax.getDdd());
				}
			}

			break;
		}
		rs.close();
		daoEx.close();

		return empresa;

	}

	public List<String> listaCnpj() throws SQLException {
		final String query = "SELECT distinct sNrCnpj FROM EMPRESA";
		List<String> cnpjs = new ArrayList<String>();

		try {

			ResultSet rs = daoEx.executeQuery(query);
			while (rs.next()) {
				cnpjs.add(rs.getString("sNrCnpj"));
			}
			rs.close();

		} finally {
			daoEx.close();

		}
		return cnpjs;
	}
}
