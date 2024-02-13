package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.bodys.EmpresaBody;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.EmpresaDAORest;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CompraDiretaItemLanceMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaItemLanceResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.EmpresaEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;

public class CompraDiretaItemLanceMapper extends AbstractMapper<CompraDiretaItemLanceModel, CompraDiretaItemLanceMapperParametro, CompraDiretaItemLanceResponse> {

    CompraDiretaItemLanceMapperParametro compraDiretaItemLanceMapperParametro;

    public CompraDiretaItemLanceMapper(CompraDiretaItemLanceMapperParametro p) throws Exception {

        super(p);
        this.compraDiretaItemLanceMapperParametro = super.getParametro();
        this.setDados();
    }

    public CompraDiretaItemLanceResponse getCasted() throws Exception {

        List<CompraDiretaItemLanceResponse> compraItemLancesResponse = this.mapperParametro.getResponse();

        for (CompraDiretaItemLanceResponse compraItemLanceResponse : compraItemLancesResponse) {
            if (compraItemLanceResponse instanceof CompraDiretaItemLanceResponse) {
                CompraDiretaItemLanceResponse compraItemLanceCasted = (CompraDiretaItemLanceResponse) compraItemLanceResponse;
                return compraItemLanceCasted;
            }
        }

        return null;
    }

    @Override
    public void setDados() throws Exception {

        ContextoImportacao contexto = this.compraDiretaItemLanceMapperParametro.getContexto();
        List<CompraDiretaItemLanceModel> lances = this.compraDiretaItemLanceMapperParametro.getLances();

        while (resultSet.next()) {

            CompraDiretaItemLanceModel novoLance = new CompraDiretaItemLanceModel();

            final String nCdEmpresa = resultSet.getString("nCdEmpresa");
            final String tDtLance = resultSet.getString("tDtLance");
            final int nNrRanking = resultSet.getInt("nNrRanking");
            final BigDecimal dVlLance = resultSet.getBigDecimal("dVlLance");
            final int nStLance = resultSet.getInt("nStLance");
            final String sDsJustificativa = resultSet.getString("sDsJustificativa");
            final int bFlVencedor = resultSet.getInt("bFlVencedor");
            final String sDsMarca = resultSet.getString("sDsMarca");
            final String sDsModelo = resultSet.getString("sDsModelo");
            final String sNrRegistro = resultSet.getString("sNrRegistro");
            final String sDsFabricante = resultSet.getString("sDsFabricante");
            final String sDsEmbalagem = resultSet.getString("sDsEmbalagem");

            EmpresaEndpoint empresaEndpoint = new EmpresaEndpoint(contexto);

            EmpresaBody body = new EmpresaBody("listarPeloCnpj");
            String cnpj = Buscador.getCNPJ(nCdEmpresa);
            Orgaos orgao = this.compraDiretaItemLanceMapperParametro.getContexto().getOrgao();
            int organizationId = Buscador.getOrganizationId(orgao);
            String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarPeloCnpj\", \"cnpj\":\"%s\"}", organizationId, cnpj);
            body.setJson(bodyString);

            RequestData fornecedoresRequestData = new RequestData(empresaEndpoint.getEnum(), empresaEndpoint.getEndpoint("process"), body);
            EmpresaDAORest empresaDAO = new EmpresaDAORest(contexto, fornecedoresRequestData);
            EmpresaModel empresa = empresaDAO.buscaPeloCnpj(cnpj);

            novoLance.setCodigoEmpresa(empresa.getCodigoEmpresa());
            Conversores conversores = new Conversores(null);
            novoLance.setDataLance(conversores.stringParaXMLGregorianCalendar(tDtLance));
            novoLance.setNumeroRanking(nNrRanking);
            novoLance.setValorLance(dVlLance);
            novoLance.setVencedor(bFlVencedor);
            novoLance.setJustificativa(sDsJustificativa);
            novoLance.setMarca(sDsMarca);
            novoLance.setModelo(sDsModelo);
            novoLance.setNumeroDoRegistro(sNrRegistro);
            novoLance.setFabricante(sDsFabricante);
            novoLance.setsDsEmbalagem(sDsEmbalagem);
            novoLance.setLanceValido(nStLance == PregaoEletronicoItemLanceModel.LANCE_VALIDO);
            novoLance.setBeneficiarioLei123(empresa.getBeneficiarioLei123());

            lances.add(novoLance);
        }

        this.compraDiretaItemLanceMapperParametro.setLances(lances);
        resultSet.close();
    }

    @Override
    public List<CompraDiretaItemLanceModel> listarTodos() throws Exception {
        return this.compraDiretaItemLanceMapperParametro.getLances();
    }
}
