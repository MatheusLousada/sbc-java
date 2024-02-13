package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CategoriaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.CategoriaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CategoriaResponse;

public class CategoriaMapper extends AbstractMapper<CategoriaModel, CategoriaMapperParametro, CategoriaResponse> {

    private CategoriaMapperParametro categoriaMapperParametro;

    public CategoriaMapper(CategoriaMapperParametro p) throws Exception {

        super(p);
        this.categoriaMapperParametro = super.getParametro();
        this.setDados();
    }

    @Override
    public CategoriaResponse getCasted() throws Exception {

        List<CategoriaResponse> categoriasResponse = this.mapperParametro.getResponse();

        for (CategoriaResponse categoriaResponse : categoriasResponse) {
            if (categoriaResponse instanceof CategoriaResponse) {
                CategoriaResponse categoriaCasted = (CategoriaResponse) categoriaResponse;
                return categoriaCasted;
            }
        }

        return null;
    }

    @Override
    public void setDados() throws Exception {

        ResultSet resultSet = this.categoriaMapperParametro.getResultSet();
        CategoriaModel categoria = this.categoriaMapperParametro.getCategoria();

        while (resultSet.next()) {

            final String nCdClasse = resultSet.getString("nCdClasse");
            final String nCdClassePai = resultSet.getString("nCdClassePai");
            final String sDsCaminho = resultSet.getString("sDsCaminho");

            categoria.setCodigo(nCdClasse);
            categoria.setDescricao(sDsCaminho);
            categoria.setCodigoPai(nCdClassePai);
        }

        resultSet.close();
        categoriaMapperParametro.setCategoria(categoria);
    }

    @Override
    public CategoriaModel listar() throws Exception {
        return this.categoriaMapperParametro.getCategoria();
    }
}
