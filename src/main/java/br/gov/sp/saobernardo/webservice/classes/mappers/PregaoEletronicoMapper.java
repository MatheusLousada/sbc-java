package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.bodys.PregaoEletronicoBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.PregaoEletronicoItemSituacaoBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.PregaoEletronicoPrazoDeEntregaBody;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.PregaoEletronicoDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.PregaoEletronicoItemLanceDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.PregaoEletronicoItemSituacaoDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.PregaoEletronicoPrazoDeEntregaDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.ProdutoDAORest;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoComissaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.PregaoEletronicoResponse;
import br.gov.sp.saobernardo.webservice.classes.responses.PregaoEletronicoResponse.PregaoHomologado;
import br.gov.sp.saobernardo.webservice.classes.responses.PregaoEletronicoResponse.PregaoPorProcessoComEdital;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.PregaoEletronicoEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.PregaoEletronicoItemSituacaoEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.PregaoEletronicoPrazoDeEntregaEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;

public class PregaoEletronicoMapper extends AbstractMapper<PregaoEletronicoModel, PregaoEletronicoMapperParametro> {

    PregaoEletronicoMapperParametro pregaoEletronicoMapperParametro;

    public PregaoEletronicoMapper(PregaoEletronicoMapperParametro p) throws Exception {
        super(p);
    }

    @Override
    public void setDados() throws Exception {

        switch (this.pregaoEletronicoMapperParametro.getTipoPregao()) {

            case POR_PROCESSO_COM_EDITAL:
                setDadosPregoesPorProcessoComEdital();
                break;

            case HOMOLOGADO:
                setDadosPregoesHomologados();
                break;

            case PREGAO_STRING:
                setDadosPregoesString();
                break;

            case COMISSAO:
                setDadosPregoesString();
                break;

            default: 
                throw new IllegalArgumentException("Ação não existente em: PregaoEletronicoMapper");
        }
    }

    private void setDadosPregoesPorProcessoComEdital() throws Exception {

        List<PregaoEletronicoModel> pregoes = new ArrayList<>();
        List<PregaoEletronicoResponse> pregoesResponse = this.pregaoEletronicoMapperParametro.getResponse();

        for (PregaoEletronicoResponse pregaoResponse : pregoesResponse) {

            if (pregaoResponse instanceof PregaoPorProcessoComEdital) {

                PregaoPorProcessoComEdital pregaoEdital = (PregaoPorProcessoComEdital) pregaoResponse;

                final int nCdCondicaoPagamento = pregaoEdital.getnCdCondicaoPagamento();
                final Long nCdPregaoEletronico = pregaoEdital.getnCdPregaoEletronico();
                final String nCdPrazoEntrega = pregaoEdital.getnCdPrazoEntrega();

                PregaoEletronicoPrazoDeEntregaModel prazoDeEntrega = this.buscarPrazoEntrega(nCdPrazoEntrega);
                PregaoEletronicoModel pregao = new PregaoEletronicoModel();

                setDadosGerais(pregao, pregaoEdital);
                setDadosPagamento(pregao, nCdCondicaoPagamento);
                setDadosEntrega(pregao, prazoDeEntrega, nCdPrazoEntrega);
                setComissao(pregao, nCdPregaoEletronico);
                setItens(pregao, nCdPregaoEletronico);
        
                pregoes.add(pregao);
            }
        }

        this.pregaoEletronicoMapperParametro.setPregoes(pregoes);
    }

    private void setDadosPagamento(PregaoEletronicoModel pregao, int nCdCondicaoPagamento) {

        pregao.setCodigoCondicaoPagamento(nCdCondicaoPagamento);
    }

    private void setDadosEntrega(PregaoEletronicoModel pregao, PregaoEletronicoPrazoDeEntregaModel prazoDeEntrega, String nCdPrazoEntrega) {

        pregao.setPrazoDeEntrega(prazoDeEntrega);
        pregao.setCodigoPrazoEntrega(nCdPrazoEntrega);
    }

    private void setDadosPregoesHomologados() throws Exception {

        List<PregaoEletronicoModel> pregoes = new ArrayList<>();
        List<PregaoEletronicoResponse> pregoesResponse = this.pregaoEletronicoMapperParametro.getResponse();

        for (PregaoEletronicoResponse pregaoResponse : pregoesResponse) {

            if (pregaoResponse instanceof PregaoHomologado) {

                PregaoHomologado pregaoHomologado = (PregaoHomologado) pregaoResponse;
                String sDsObjeto = pregaoHomologado.getsDsObjeto();

                PregaoEletronicoModel pregao = new PregaoEletronicoModel();
                setDadosGerais(pregao, pregaoResponse);
                pregao.setDescricaoObjeto(sDsObjeto);
                pregoes.add(pregao);
            }
        }

        this.pregaoEletronicoMapperParametro.setPregoes(pregoes);
    }

    private void setDadosPregoesString() throws Exception {
    }

    private void setDadosGerais(PregaoEletronicoModel pregao, PregaoEletronicoResponse pregaoResponse) throws Exception {

        Conversores conversores = new Conversores(null);
        String segundos = ".000";
        
        pregao.setNumeroProcessoDisplay(pregaoResponse.getsNrProcessoDisplay());
        pregao.setNumeroEdital(pregaoResponse.getsNrEdital());
        pregao.setCodigoSituacao(Integer.parseInt(pregaoResponse.getnCdSituacao()));
        pregao.setDataInicialProposta(conversores.stringParaXMLGregorianCalendar(pregaoResponse.gettDtInicialProposta() + segundos));
        pregao.setDataFinalProposta(conversores.stringParaXMLGregorianCalendar(pregaoResponse.gettDtFinalProposta() + segundos));
        pregao.setDataInicialDisputa(conversores.stringParaXMLGregorianCalendar(pregaoResponse.gettDtInicialDisputa() + segundos));
    }    

    private PregaoEletronicoPrazoDeEntregaModel buscarPrazoEntrega(String numProcesso) throws Exception {

        ContextoImportacao contexto = this.pregaoEletronicoMapperParametro.getContexto();
        PregaoEletronicoPrazoDeEntregaEndpoint pregaoEndpoint = new PregaoEletronicoPrazoDeEntregaEndpoint(contexto);

        Orgaos orgao = this.pregaoEletronicoMapperParametro.getContexto().getOrgao();
        int organizationId = Buscador.getOrganizationId(orgao);
        String action = "listarPregaoEletronicoPrazoDeEntrega";

        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"%s\"}", organizationId, action);
        PregaoEletronicoPrazoDeEntregaBody body = new PregaoEletronicoPrazoDeEntregaBody(action);
        body.setJson(bodyString);
        
        RequestData pregaoRequestData = new RequestData(pregaoEndpoint.getEnum(), pregaoEndpoint.getEndpoint("process"), body);

        PregaoEletronicoPrazoDeEntregaDAORest prazoDeEntregaDAO = new PregaoEletronicoPrazoDeEntregaDAORest(contexto, pregaoRequestData);

        return prazoDeEntregaDAO.buscaPeloCodigoDoParadigma(Long.parseLong(numProcesso));
    }

    private void setComissao(PregaoEletronicoModel pregao, Long numProcesso) throws Exception {

        List<PregaoEletronicoComissaoModel> comissoes = new ArrayList<PregaoEletronicoComissaoModel>();

        ContextoImportacao contexto = this.pregaoEletronicoMapperParametro.getContexto();
        PregaoEletronicoEndpoint pregaoEletronicoEndpoint = new PregaoEletronicoEndpoint(contexto);
        
        Orgaos orgao = this.pregaoEletronicoMapperParametro.getContexto().getOrgao();
        int organizationId = Buscador.getOrganizationId(orgao);
        String action = "listarComissaoPregao";
        
        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"%s\", \"numProcesso\"}", organizationId, action);
        PregaoEletronicoBody body = new PregaoEletronicoBody(action);
        body.setJson(bodyString);
        
        RequestData pregaoRequestData = new RequestData(pregaoEletronicoEndpoint.getEnum(), pregaoEletronicoEndpoint.getEndpoint("process"), body);
        PregaoEletronicoDAORest pregaoDAO = new PregaoEletronicoDAORest(contexto, pregaoRequestData);
        pregaoDAO.

        while (resultSet.next()) {

            PregaoEletronicoComissaoModel comissao = new PregaoEletronicoComissaoModel();
            String sCdUsuario = resultSet.getString("sCdUsuario");
            int nIdPerfil = resultSet.getInt("nIdPerfil");

            comissao.setCodigoUsuario(sCdUsuario);
            comissao.setCodigoPerfil(nIdPerfil);
            comissoes.add(comissao);
        }

        resultSet.close();
        pregao.setLstPregaoEletronicoComissao(comissoes);
    }

    private void setItens(PregaoEletronicoModel pregao, Long numProcesso) throws Exception {

        ContextoImportacao contexto = this.pregaoEletronicoMapperParametro.getContexto();
        List<PregaoEletronicoItemModel> itens = new ArrayList<PregaoEletronicoItemModel>();
        ResultSet resultSet = getItensResultSet(numProcesso);

        while (resultSet.next()) {

            final Long nCdItem = resultSet.getLong("nCdItem");
            final String sCdItemLegado = resultSet.getString("sCdItemLegado");
            final int nCdItemSequencial = resultSet.getInt("nCdItemSequencial");
            final String nCdLote = resultSet.getString("nCdLote");
            final Long nCdProduto = resultSet.getLong("nCdProduto");
            final String sDsItem = resultSet.getString("sDsItem");
            final BigDecimal dQtItem = resultSet.getBigDecimal("dQtItem");
            final BigDecimal dVlReferencia = resultSet.getBigDecimal("dVlReferencia");
            final long nStItem = resultSet.getLong("nStItem");

            PregaoEletronicoItemSituacaoEndpoint pregaoItemsEndpoint = new PregaoEletronicoItemSituacaoEndpoint(
                    contexto);
            Orgaos orgao = this.pregaoEletronicoMapperParametro.getContexto().getOrgao();
            int organizationId = this.getOrganizationId(orgao);
            String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarComissao\"}", organizationId);
            PregaoEletronicoItemSituacaoBody body = new PregaoEletronicoItemSituacaoBody("listarComissao");
            body.setJson(bodyString);
            RequestData pregaoItemsRequestData = new RequestData(pregaoItemsEndpoint.getEnum(),
                    pregaoItemsEndpoint.getEndpoint("process"), body);
            PregaoEletronicoItemSituacaoDAORest situacaoDAO = new PregaoEletronicoItemSituacaoDAORest(contexto,
                    pregaoItemsRequestData);
            PregaoEletronicoItemModel pregaoItem = new PregaoEletronicoItemModel();
            ProdutoDAORest produtoDAO = new ProdutoDAORest(contexto, pregaoItemsRequestData);
            ProdutoModel produto = produtoDAO.listar();
            PregaoEletronicoItemLanceDAORest lancesDao = new PregaoEletronicoItemLanceDAORest(contexto,
                    pregaoItemsRequestData);

            pregaoItem.setSituacaoPregao(situacaoDAO.listar());
            pregaoItem.setCodigoClasse(produto.getCategoria().getCodigo());
            pregaoItem.setCodigoItemLegado(sCdItemLegado);
            pregaoItem.setCodigoItemSequencial(nCdItemSequencial);
            pregaoItem.setCodigoLoteLegado(nCdLote);
            pregaoItem.setCodigoProduto(produto.getCodigo());
            pregaoItem.setCodigoUnidadeMedida(produto.getUnidadesDeMedida().get(0).getCodigo());
            pregaoItem.setDescricaoItem(sDsItem);
            pregaoItem.setQuantidadeItem(dQtItem);
            pregaoItem.setValorReferencia(dVlReferencia);
            pregaoItem.setLances(lancesDao.listarTodos());

            itens.add(pregaoItem);
        }

        resultSet.close();
        pregao.setLstPregaoEletronicoItem(itens);
    }

    @Override
    public List<PregaoEletronicoModel> listarTodos() throws Exception {
        return this.pregaoEletronicoMapperParametro.getPregoes();
    }
    
    public List<String> listarTodosString() throws Exception {
        return this.pregaoEletronicoMapperParametro.getPregoesString();
    }
}
