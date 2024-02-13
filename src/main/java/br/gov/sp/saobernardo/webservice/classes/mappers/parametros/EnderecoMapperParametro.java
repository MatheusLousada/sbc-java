package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class EnderecoMapperParametro implements InterfaceMapperParametro<EnderecoResponse> {
    
    private EnderecoModel endereco;
    private List<EnderecoResponse> response;

    public EnderecoMapperParametro(EnderecoModel endereco) throws Exception {
        this.endereco = endereco;
    }
    
    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<EnderecoResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<EnderecoResponse> response) {
        this.response = response;
    }

    public EnderecoModel getEndereco() {
        return this.endereco;
    }
}
