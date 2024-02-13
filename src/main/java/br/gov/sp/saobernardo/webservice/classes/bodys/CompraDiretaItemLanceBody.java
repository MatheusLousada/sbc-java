package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class CompraDiretaItemLanceBody extends AbstractBody {

    public CompraDiretaItemLanceBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarTodos":
                super.setFields("organizationId", "action", "processId", "itemId");    
                break;
                
            default:
                break;
        }
        
        return super.dataStructure;
    }
}
