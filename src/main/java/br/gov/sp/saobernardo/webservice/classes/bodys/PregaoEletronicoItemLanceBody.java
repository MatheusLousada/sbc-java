package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class PregaoEletronicoItemLanceBody extends AbstractBody {

    public PregaoEletronicoItemLanceBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarPregaoEletronicoItemLance":
                super.setFields("organizationId", "action", "processId", "itemId");
                break;

            case "listarTodosPregaoEletronicoItemLance":
            super.setFields("organizationId", "action");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
