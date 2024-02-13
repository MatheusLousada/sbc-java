package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class ProdutoBody extends AbstractBody {

    public ProdutoBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarProduto":
                super.setFields("organizationId", "action", "productId");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
