package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemProposta;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.EmpresaEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.PregaoEletronicoItemPropostaEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;
import br.gov.sp.saobernardo.webservice.classes.bodys.EmpresaBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.PregaoEletronicoItemPropostaBody;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.EmpresaDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.PregaoEletronicoItemPropostaDAORest;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoItemLanceMapperParametro;

public class PregaoEletronicoItemLanceMapper extends AbstractMapper
		implements InterfaceMapper<PregaoEletronicoItemLanceModel, PregaoEletronicoItemLanceMapperParametro> {

	private PregaoEletronicoItemLanceMapperParametro pregaoEletronicoItemLanceMapperParametro;

	public PregaoEletronicoItemLanceMapper(PregaoEletronicoItemLanceMapperParametro p) throws Exception {
		this.pregaoEletronicoItemLanceMapperParametro = p;
		setDados();
	}

	@Override
	public void setDados() throws Exception {

		List<PregaoEletronicoItemLanceModel> lances = this.pregaoEletronicoItemLanceMapperParametro.getPregoes();
		// Long nroPregaoEletronico = getNroPregaoEletronico();
		ResultSet resultSet = this.pregaoEletronicoItemLanceMapperParametro.getResultSet();

		while (resultSet.next()) {

			Conversores conversores = new Conversores(null);
			PregaoEletronicoItemLanceModel lance = new PregaoEletronicoItemLanceModel();

			String nCdEmpresa = resultSet.getString("nCdEmpresa");
			String tDtLance = resultSet.getString("dataLance");
			int nNrRanking = resultSet.getInt("nNrRanking");
			BigDecimal dVlLance = resultSet.getBigDecimal("vlUnitario");
			int nStLance = resultSet.getInt("stLoteLance");
			String sDsJustificativa = resultSet.getString("descJustificativa");
			int bFlVencedor = resultSet.getInt("bFlVencedor");

			EmpresaEndpoint empresaEndpoint = new EmpresaEndpoint(this.pregaoEletronicoItemLanceMapperParametro.getContexto());
			EmpresaBody body = new EmpresaBody("listarPeloCNPJ");
			Orgaos orgao = this.pregaoEletronicoItemLanceMapperParametro.getContexto().getOrgao();
			int organizationId = this.getOrganizationId(orgao);
			String cnpj = getCNPJ(nCdEmpresa);
			String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarPeloCNPJ\", \"cnpj\":\":%s\"}", organizationId, cnpj);
			body.setJson(bodyString);

			RequestData empresaRequestData = new RequestData(empresaEndpoint.getEnum(), empresaEndpoint.getEndpoint("process"), body);
			EmpresaDAORest empresaDAO = new EmpresaDAORest(this.pregaoEletronicoItemLanceMapperParametro.getContexto(), empresaRequestData);
			EmpresaModel empresa = empresaDAO.buscaPeloCnpj(cnpj);

			lance.setCodigoEmpresa(empresa.getCodigoEmpresa());
			lance.setDataLance(conversores.stringParaXMLGregorianCalendar(tDtLance));
			lance.setNumeroRanking(nNrRanking);
			lance.setValorLance(dVlLance);
			lance.setVencedor(bFlVencedor);
			lance.setJustificativa(sDsJustificativa);
			lance.setLanceValido(nStLance == PregaoEletronicoItemLanceModel.LANCE_VALIDO);
			lance.setBeneficiarioLei123(empresa.getBeneficiarioLei123());

			ContextoImportacao contexto = this.pregaoEletronicoItemLanceMapperParametro.getContexto();
			PregaoEletronicoItemPropostaEndpoint itemPropostaEndpoint = new PregaoEletronicoItemPropostaEndpoint(contexto);
			String bodyStringPregao = String.format("{\"organizationId\":%d, \"action\":\"listarPregaoEletronicoItemProposta\", \"cnpj\":\":%s\"}", organizationId, nCdEmpresa);
			PregaoEletronicoItemPropostaBody bodyPregao = new PregaoEletronicoItemPropostaBody(bodyStringPregao);
			RequestData itemPropostaRequestData = new RequestData(itemPropostaEndpoint.getEnum(), itemPropostaEndpoint.getEndpoint("process"), bodyPregao);
			PregaoEletronicoItemPropostaDAORest itemPropostaDAO = new PregaoEletronicoItemPropostaDAORest(contexto, itemPropostaRequestData);
			PregaoEletronicoItemProposta proposta = itemPropostaDAO.listar();

			lance.setProposta(proposta);
			lances.add(lance);
		}

		resultSet.close();
	}

	@Override
	public List<PregaoEletronicoItemLanceModel> listarTodos() throws Exception {
		return this.pregaoEletronicoItemLanceMapperParametro.getPregoes();
	}
}
