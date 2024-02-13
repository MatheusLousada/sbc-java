package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class ProdutoPropostaBody extends AbstractBody {

    public ProdutoPropostaBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarProdutoProposta":
                super.setFields("organizationId", "action");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
