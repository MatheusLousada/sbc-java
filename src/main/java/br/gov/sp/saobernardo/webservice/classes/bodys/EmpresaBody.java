package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class EmpresaBody extends AbstractBody {

    public EmpresaBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {
            
            case "listarTodasEmpresas":
                super.setFields("organizationId", "action");
                break;

            case "listarPeloCnpj":
            case "listarNovoPeloCnpj":
                super.setFields("organizationId", "action", "cnpj");
                break;

            case "listarDadosCadastraisDeEmpresas":
            case "listarDadosCadastraisDeNovasEmpresas":
                super.setFields("organizationId", "action");
                break;

            case "listarTodasEmpresasAlteradasRecentemente":
                super.setFields("organizationId", "action");
                break;

            case "listarCnpjs":
                super.setFields("organizationId", "action");
                break;

            default:
                break;
        }
        
        return super.dataStructure;
    }

}
