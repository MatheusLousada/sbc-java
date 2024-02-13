package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.util.ArrayList;
import java.util.List;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.ProdutoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.ProdutoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.classes.bodys.CategoriaBody;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.CategoriaDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.UnidadeDeMedidaDAORest;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.CategoriaEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.UnidadeDeMedidaEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;

public class ProdutoMapper extends AbstractMapper<ProdutoModel, ProdutoMapperParametro, ProdutoResponse> {

    public ProdutoMapper(ProdutoMapperParametro p) throws Exception {
        super(p);
    }

    @Override
    public void setDados() throws Exception {

        ContextoImportacao contexto = this.mapperParametro.getContexto();
        ProdutoModel produto = this.mapperParametro.getProduto();
        ProdutoResponse produtoCasted = getCasted();

        mapearDadosProduto(produto, produtoCasted, contexto);
        
        this.mapperParametro.setProduto(produto);
    }

    public ProdutoResponse getCasted() throws Exception {

        List<ProdutoResponse> produtosResponse = this.mapperParametro.getResponse();

        for (ProdutoResponse produtoResponse : produtosResponse) {
            if (produtoResponse instanceof ProdutoResponse) {
                ProdutoResponse produtoCasted = (ProdutoResponse) produtoResponse;
                return produtoCasted;
            }
        }

        return null;
    }

    private void mapearDadosProduto(ProdutoModel produto, ProdutoResponse produtoCasted, ContextoImportacao contexto) throws Exception {

        CategoriaEndpoint categoriaEndpoint = new CategoriaEndpoint(contexto);
        
        String action = "listarPregaoEletronicoPrazoDeEntrega";
        int organizationId = getOrganizationId(contexto.getOrgao());

        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"%s\"}", organizationId, action);
        CategoriaBody body = new CategoriaBody(action);
        body.setJson(bodyString);

        RequestData categoriaRequestData = createRequestData(categoriaEndpoint.getEnum(),
                categoriaEndpoint.getEndpoint("product"), body);

        CategoriaDAORest categoriaDAO = new CategoriaDAORest(contexto, categoriaRequestData);
        produto.setCategoria(categoriaDAO.listar());

        // ------------------------------------------

        UnidadeDeMedidaEndpoint unidadeDeMedidaEndpoint = new UnidadeDeMedidaEndpoint(contexto);

        String actionUnidadeMedida = "listarPregaoEletronicoPrazoDeEntrega";
        int organizationIdUnidadeMedida = getOrganizationId(contexto.getOrgao());

        String bodyStringUnidadeMedida = String.format("{\"organizationId\":%d, \"action\":\"%s\"}", organizationIdUnidadeMedida, actionUnidadeMedida);
        CategoriaBody bodyUnidadeMedida = new CategoriaBody(actionUnidadeMedida);
        bodyUnidadeMedida.setJson(bodyStringUnidadeMedida);

        RequestData unidadeDeMedidaRequestData = createRequestData(unidadeDeMedidaEndpoint.getEnum(), unidadeDeMedidaEndpoint.getEndpoint("listarUnidadeDeMedida"), bodyUnidadeMedida);

        UnidadeDeMedidaDAORest unidadeDeMedidaDAO = new UnidadeDeMedidaDAORest(contexto, unidadeDeMedidaRequestData);
        UnidadeDeMedidaModel unidadeMedida = unidadeDeMedidaDAO.listar();

        ArrayList<UnidadeDeMedidaModel> unidadesDeMedida = new ArrayList<>();
        unidadesDeMedida.add(unidadeMedida);

        produto.setUnidadesDeMedida(unidadesDeMedida);
    }

    @Override
    public ProdutoModel listar() {
        return this.mapperParametro.getProduto();
    }

    private int getOrganizationId(Orgaos orgao) {
        return Buscador.getOrganizationId(orgao);
    }
}
