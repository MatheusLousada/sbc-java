package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class PregaoEletronicoItemPropostaBody extends AbstractBody {

    public PregaoEletronicoItemPropostaBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarPregaoEletronicoItemProposta":
                super.setFields("organizationId", "action", "itemId");
                break;

            default:
                break;
        }

        return super.dataStructure;
    }
}
