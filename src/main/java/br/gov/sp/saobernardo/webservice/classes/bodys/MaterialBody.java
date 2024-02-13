package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class MaterialBody extends AbstractBody {

    public MaterialBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarMateriaisEmpresa":
                super.setFields("organizationId", "action", "cnpj");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
