package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class EnderecoBody extends AbstractBody {

    public EnderecoBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarEnderecoEmpresa":
                super.setFields("organizationId", "action", "cnpj");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }
}
