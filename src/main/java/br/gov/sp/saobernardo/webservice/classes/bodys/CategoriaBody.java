package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class CategoriaBody extends AbstractBody {

    public CategoriaBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {
            
            case "listarCategoria":
                super.setFields("organizationId", "action", "productId");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
