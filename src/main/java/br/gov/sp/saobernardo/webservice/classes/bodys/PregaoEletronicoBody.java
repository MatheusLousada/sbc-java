package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class PregaoEletronicoBody extends AbstractBody {

    public PregaoEletronicoBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarPregoesHomologados":
                super.setFields("organizationId", "action");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
