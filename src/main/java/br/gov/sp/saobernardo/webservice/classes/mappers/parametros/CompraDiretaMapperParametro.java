package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.enums.TipoCompraEnum;

public class CompraDiretaMapperParametro implements InterfaceMapperParametro<CompraDiretaResponse> {

    private ContextoImportacao contexto;
    private TipoCompraEnum tipoCompra;
    private List<CompraDiretaResponse> response;

    public CompraDiretaMapperParametro(ContextoImportacao contexto, TipoCompraEnum tipoCompra) {
        this.contexto = contexto;
        this.tipoCompra = tipoCompra;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<CompraDiretaResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<CompraDiretaResponse> response) {
        this.response = response;
    }

    public TipoCompraEnum getTipoCompra() {
        return this.tipoCompra;
    }
}
