package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.MaterialModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class MaterialMapperParametro implements InterfaceMapperParametro<MaterialResponse> {
    
    private ContextoImportacao contexto;
    private List<MaterialModel> materiais;
    private List<MaterialResponse> response;

    public MaterialMapperParametro(ContextoImportacao contexto, List<MaterialModel> materiais) throws Exception {
        this.contexto = contexto;
        this.materiais = materiais;
    }
   
    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<MaterialResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<MaterialResponse> response) {
        this.response = response;
    }

    public List<MaterialModel> getMateriais() {
        return this.materiais;
    }

    public void setMateriais(List<MaterialModel> materiais) {
        this.materiais = materiais;
    }
}
