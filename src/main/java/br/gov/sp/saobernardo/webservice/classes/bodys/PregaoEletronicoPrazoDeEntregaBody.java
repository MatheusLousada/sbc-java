package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class PregaoEletronicoPrazoDeEntregaBody extends AbstractBody {

    public PregaoEletronicoPrazoDeEntregaBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarPregaoEletronicoPrazoDeEntrega":
                super.setFields("organizationId", "action", "processId");
                break;

            default:
                break;
        }

        return super.dataStructure;
    }
}
