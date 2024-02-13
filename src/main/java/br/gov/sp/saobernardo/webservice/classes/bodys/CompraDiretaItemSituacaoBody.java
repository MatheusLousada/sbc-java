package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class CompraDiretaItemSituacaoBody extends AbstractBody {

    public CompraDiretaItemSituacaoBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listar":
                super.setFields("organizationId", "action", "processId", "itemId");    
                break;
                
            default:
                break;
        }
        
        return super.dataStructure;
    }
}
