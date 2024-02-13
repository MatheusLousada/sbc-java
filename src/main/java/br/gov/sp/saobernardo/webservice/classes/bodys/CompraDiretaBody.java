package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class CompraDiretaBody extends AbstractBody {

    public CompraDiretaBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarTodasComprasHomologadas":
                super.setFields("organizationId", "action");
                break;

            case "listarTodasComprasPorProcessoComEdital":
                super.setFields("organizationId", "action");
                break;
                
            case "listarTodasComprasDiretasPorAno":
                super.setFields("organizationId", "action", "year");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
