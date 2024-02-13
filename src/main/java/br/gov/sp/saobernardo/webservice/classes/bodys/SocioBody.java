package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class SocioBody extends AbstractBody {

    public SocioBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarSociosEmpresa":
                super.setFields("organizationId", "action", "cnpj");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
