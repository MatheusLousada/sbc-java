package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class DocumentoBody extends AbstractBody {

    public DocumentoBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarDocumentosEmpresa":
                super.setFields("organizationId", "action", "cnpj");
                break;
                
            case "listarDocumentoEmpresa":
                super.setFields("organizationId", "action", "cnpj", "documentType");
                break;
                
            case "listarCertidaoEmpresa":
                super.setFields("organizationId", "action", "cnpj", "certificateType");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
