package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.bodys.CompraDiretaBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.CompraDiretaItemLanceBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.PregaoEletronicoBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.PregaoEletronicoPrazoDeEntregaBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.ProdutoBody;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.CompraDiretaDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.CompraDiretaItemLanceDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.PregaoEletronicoDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.PregaoEletronicoPrazoDeEntregaDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.ProdutoDAORest;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CompraDiretaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.ProdutoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaComissaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaResponse;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaResponse.CompraDiretaComissaoResponse;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaResponse.CompraDiretaItens;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaResponse.CompraDiretaPorAno;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaResponse.CompraPorProcessoComEdital;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaResponse.ComprasHomologadas;
import br.gov.sp.saobernardo.webservice.classes.responses.PregaoEletronicoResponse;
import br.gov.sp.saobernardo.webservice.classes.responses.PregaoEletronicoResponse.PregaoPorProcessoComEdital;
import br.gov.sp.saobernardo.webservice.classes.utils.Constantes;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.enums.TipoCompraEnum;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.CompraDiretaEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.CompraDiretaItemLanceEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.PregaoEletronicoEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.PregaoEletronicoPrazoDeEntregaEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.ProdutoEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;

public class CompraDiretaMapper extends AbstractMapper<CompraDiretaModel, CompraDiretaMapperParametro, CompraDiretaResponse> {

    private CompraDiretaMapperParametro compraDiretaMapperParametro;
    private List<CompraDiretaModel> comprasHomologadas;
    private List<CompraDiretaModel> comprasPorProcessoComEdital;
    private List<String> comprasDiretas;

    public CompraDiretaMapper(CompraDiretaMapperParametro p) throws Exception {
        
        super(p);
        this.compraDiretaMapperParametro = super.getParametro();
        this.setDados();
    }

    @Override
    public void setDados() throws Exception {

        TipoCompraEnum tipoCompra = this.compraDiretaMapperParametro.getTipoCompra();

        switch (tipoCompra) {

            case POR_PROCESSO_COM_EDITAL:
                this.setDadosCompraPorProcessoComEdital();
                break;

            case HOMOLOGADA:
                this.setDadosCompraHomologada();
                break;

            case DIRETA_POR_ANO:
                this.setDadosCompraDiretaPorAno();
                break;
        }
    }

    public List<CompraDiretaModel> listarComprasPorProcessoComEdital() {
        return this.comprasPorProcessoComEdital;
    }

    public List<CompraDiretaModel> listarComprasHomologadas() {
        return this.comprasHomologadas;
    }

    public List<String> listarComprasDiretasPorAno() {
        return this.comprasDiretas;
    }

    private void setDadosCompraPorProcessoComEdital() throws Exception {

        Conversores conversores = new Conversores(null);
        List<CompraDiretaResponse> comprasDiretasResponse = this.compraDiretaMapperParametro.getResponse();

        for (CompraDiretaResponse compraResponse : comprasDiretasResponse) {

            if (compraResponse instanceof CompraPorProcessoComEdital) {

                CompraPorProcessoComEdital compraEdital = (CompraPorProcessoComEdital) compraResponse;

                final String sNrProcessoDisplay = compraEdital.getsNrProcessoDisplay();
                final String tDtInicialProposta = compraEdital.gettDtInicialProposta();
                final int nCdCondicaoPagamento = compraEdital.getnCdCondicaoPagamento();
                final String tDtFinalProposta = compraEdital.gettDtFinalProposta();
                final String nCdPrazoEntrega = compraEdital.getnCdPrazoEntrega();
                final Long nCdCompraDireta = compraEdital.getnCdCompraDireta();
                final String nCdSituacao = compraEdital.getnCdSituacao();
                final String sNrEdital = compraEdital.getsNrEdital();

                PregaoEletronicoPrazoDeEntregaModel prazoDeEntrega = buscaPrazoEntrega(nCdPrazoEntrega);

                CompraDiretaModel novaCompra = new CompraDiretaModel();

                novaCompra.setCodigoCondicaoPagamento(String.valueOf(nCdCondicaoPagamento));
                novaCompra.setNumeroProcessoDisplay(sNrProcessoDisplay);
                novaCompra.setCodigoSituacao(Long.valueOf(nCdSituacao));
                novaCompra.setNumeroEdital(sNrEdital);
                novaCompra.setDataInicial(conversores.stringParaXMLGregorianCalendar(tDtInicialProposta));
                novaCompra.setDataFinal(conversores.stringParaXMLGregorianCalendar(tDtFinalProposta));
                novaCompra.setPrazoDeEntrega(prazoDeEntrega);
                novaCompra.setCodigoPrazoEntrega(nCdPrazoEntrega);

                this.adicionarComissaoNoPregao(novaCompra, nCdCompraDireta);
                this.adicionarItensNaCompra(novaCompra, nCdCompraDireta);

                this.comprasPorProcessoComEdital.add(novaCompra);
            }
        }
    }

    private void setDadosCompraHomologada() throws Exception {

        List<CompraDiretaResponse> comprasDiretasResponse = this.compraDiretaMapperParametro.getResponse();

        for (CompraDiretaResponse compraResponse : comprasDiretasResponse) {

            if (compraResponse instanceof ComprasHomologadas) {

                ComprasHomologadas compraHomologada = (ComprasHomologadas) compraResponse;

                Conversores conversores = new Conversores(null);
                CompraDiretaModel novaCompra = new CompraDiretaModel();
                final String sNrProcessoDisplay = compraHomologada.getsNrProcessoDisplay();
                final String sNrEdital = compraHomologada.getsNrEdital();
                final String nCdSituacao = compraHomologada.getnCdSituacao();
                final String tDtInicialProposta = compraHomologada.gettDtInicialProposta();
                final String tDtFinalProposta = compraHomologada.gettDtFinalProposta();
                final String nCdPrazoEntrega = compraHomologada.getnCdPrazoEntrega();
                final String sDsObjeto = compraHomologada.getsDsObjeto();

                novaCompra.setNumeroProcessoDisplay(sNrProcessoDisplay);
                novaCompra.setNumeroEdital(sNrEdital);
                novaCompra.setCodigoSituacao(Long.valueOf(nCdSituacao));
                novaCompra.setCodigoPrazoEntrega(nCdPrazoEntrega);
                novaCompra.setDescricaoObjeto(sDsObjeto);
                novaCompra.setDataInicial(conversores.stringParaXMLGregorianCalendar(tDtInicialProposta));
                novaCompra.setDataFinal(conversores.stringParaXMLGregorianCalendar(tDtFinalProposta));

                this.comprasHomologadas.add(novaCompra);
            }

        }
    }

    private void setDadosCompraDiretaPorAno() throws Exception {

        List<CompraDiretaResponse> comprasDiretasResponse = this.compraDiretaMapperParametro.getResponse();

        for (CompraDiretaResponse compraResponse : comprasDiretasResponse) {

            if (compraResponse instanceof CompraDiretaPorAno) {

                CompraDiretaPorAno compraPorAno = (CompraDiretaPorAno) compraResponse;
                StringBuilder s = new StringBuilder();

                s.append(compraPorAno.getsNrEdital());
                s.append(Constantes.SEPARADOR_STRING_BUILDER);
                s.append(compraPorAno.getsNrProcessoDisplay());
                s.append(Constantes.SEPARADOR_STRING_BUILDER);
                s.append(compraPorAno.getsDsSituacao());

                this.comprasDiretas.add(s.toString());
            }
        }
    }

    private PregaoEletronicoPrazoDeEntregaModel buscaPrazoEntrega(String prazoEntrega) throws Exception {

        ContextoImportacao contexto = this.compraDiretaMapperParametro.getContexto();
        PregaoEletronicoPrazoDeEntregaEndpoint pregaoEndpoint = new PregaoEletronicoPrazoDeEntregaEndpoint(contexto);
        
        PregaoEletronicoPrazoDeEntregaBody body = new PregaoEletronicoPrazoDeEntregaBody("listarPrazoEntrega");
        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarPrazoEntrega\"}", getOrganizationId());
        body.setJson(bodyString);

        RequestData pregaoRequestData = new RequestData(pregaoEndpoint.getEnum(), pregaoEndpoint.getEndpoint("listarPrazoEntrega"), body);
        PregaoEletronicoPrazoDeEntregaDAORest dao = new PregaoEletronicoPrazoDeEntregaDAORest(contexto, pregaoRequestData);

        return dao.listar();
    }

    private void adicionarComissaoNoPregao(CompraDiretaModel compra, Long numProcesso) throws Exception {

        ContextoImportacao contexto = this.compraDiretaMapperParametro.getContexto();

        PregaoEletronicoEndpoint pregaoEletronicoEndpoint = new PregaoEletronicoEndpoint(contexto);

        Orgaos orgao = this.compraDiretaMapperParametro.getContexto().getOrgao();
        int organizationId = Buscador.getOrganizationId(orgao);
        String action = "listarComissao";

        PregaoEletronicoBody body = new PregaoEletronicoBody(action);
        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"%s\"}", organizationId, action);
        body.setJson(bodyString);

        RequestData pregaoEletronicoRequestData = new RequestData(pregaoEletronicoEndpoint.getEnum(),pregaoEletronicoEndpoint.getEndpoint(action), body);

        PregaoEletronicoDAORest pregaoEletronicoDAO = new PregaoEletronicoDAORest(contexto, pregaoEletronicoRequestData);

        List<CompraDiretaComissaoModel> comissao = pregaoEletronicoDAO.listarComissao();
        compra.setLstCompraDiretaComissao(comissao);
    }

    private void adicionarItensNaCompra(CompraDiretaModel compra, Long numProcesso) throws Exception {

        ContextoImportacao contexto = this.compraDiretaMapperParametro.getContexto();

        List<CompraDiretaItemModel> itens = new ArrayList<CompraDiretaItemModel>();

        CompraDiretaEndpoint compraEndpoint = new CompraDiretaEndpoint(contexto);

        CompraDiretaBody body = new CompraDiretaBody("listarItens");

        Orgaos orgao = this.compraDiretaMapperParametro.getContexto().getOrgao();
        int organizationId = Buscador.getOrganizationId(orgao);

        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarItens\", \"processNumber\":\":%d\"}", organizationId, numProcesso);
        body.setJson(bodyString);

        RequestData compraRequestData = new RequestData(compraEndpoint.getEnum(), compraEndpoint.getEndpoint("listarItens"), body);
        CompraDiretaDAORest compraDiretaDAO = new CompraDiretaDAORest(contexto, compraRequestData);

        compraDiretaDAO.setResponse(compraDiretaDAO.get);

        List<CompraDiretaResponse> comprasDiretasResponse = this.compraDiretaMapperParametro.getResponse();

        for (CompraDiretaResponse compraResponse : comprasDiretasResponse) {

            if (compraResponse instanceof CompraDiretaItens) {

                CompraDiretaItens compraItens = (CompraDiretaItens) compraResponse;

                CompraDiretaItemModel compraDiretaItem = new CompraDiretaItemModel();

                Long numItem = compraItens.getNumItem();
                String sCdItemLegado = compraItens.getSCdItemLegado();
                int nCdItemSequencial = compraItens.getNCdItemSequencial();
                String nCdLote = compraItens.getNCdLote();
                Long nCdProduto = compraItens.getNCdProduto();
                String sDsItem = compraItens.getSDsItem();
                BigDecimal dQtItem = compraItens.getDQtItem();
                BigDecimal dVlReferencia = compraItens.getDVlReferencia();

                ProdutoEndpoint produtoEndpoint = new ProdutoEndpoint(contexto);

                ProdutoBody bodyProduto = new ProdutoBody("listarProduto");
                String bodyStringProduto = String.format(
                        "{\"organizationId\":%d, \"action\":\"listarProduto\", \"productId\":\":%d\"}", organizationId,
                        nCdProduto);
                bodyProduto.setJson(bodyStringProduto);

                RequestData produtoRequestData = new RequestData(produtoEndpoint.getEnum(),
                        produtoEndpoint.getEndpoint("listarProduto"), bodyProduto);

                ProdutoDAORest produtoDAO = new ProdutoDAORest(contexto, produtoRequestData);
                ProdutoModel produto = produtoDAO.listar();

                compraDiretaItem.setCodigoClasse(produto.getCategoria().getCodigo());
                compraDiretaItem.setCodigoItemLegado(sCdItemLegado);
                compraDiretaItem.setCodigoItemSequencial(nCdItemSequencial);
                compraDiretaItem.setCodigoLoteLegado(nCdLote);
                compraDiretaItem.setCodigoProduto(produto.getCodigo());
                compraDiretaItem.setCodigoUnidadeMedida(produto.getUnidadesDeMedida().get(0).getCodigo());
                compraDiretaItem.setDescricaoItem(sDsItem);
                compraDiretaItem.setQuantidadeItem(dQtItem);
                compraDiretaItem.setValorReferencia(dVlReferencia);

                CompraDiretaItemLanceEndpoint compraDiretaItemLanceEndpoint = new CompraDiretaItemLanceEndpoint(
                        contexto);
                CompraDiretaItemLanceBody bodyCompraDiretaItemLance = new CompraDiretaItemLanceBody("listarProduto");
                String bodyStringCompraDiretaItemLance = String.format(
                        "{\"organizationId\":%d, \"action\":\"listarProduto\", \"itemId\":\":%d\"}", organizationId,
                        numItem);
                bodyCompraDiretaItemLance.setJson(bodyStringCompraDiretaItemLance);
                RequestData compraDiretaItemLanceRequestData = new RequestData(compraDiretaItemLanceEndpoint.getEnum(), compraDiretaItemLanceEndpoint.getEndpoint("process"), bodyCompraDiretaItemLance);
                CompraDiretaItemLanceDAORest itemLanceDao = new CompraDiretaItemLanceDAORest(contexto, compraDiretaItemLanceRequestData);

                compraDiretaItem.setLances(itemLanceDao.listarTodos());
                itens.add(compraDiretaItem);
            }

            compra.setLstCompraDiretaItem(itens);
        }
    }
}
