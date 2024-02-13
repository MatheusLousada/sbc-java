package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class UnidadeDeMedidaBody extends AbstractBody {

    public UnidadeDeMedidaBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "":
                super.setFields("organizationId", "action");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
