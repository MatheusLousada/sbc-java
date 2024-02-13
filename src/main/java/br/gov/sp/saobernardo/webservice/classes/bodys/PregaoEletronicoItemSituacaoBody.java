package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

public class PregaoEletronicoItemSituacaoBody extends AbstractBody {

    public PregaoEletronicoItemSituacaoBody(String action) {
        super(action);
    }

    @Override
    public ArrayList<String> getDataStructure() {
        switch (this.action) {

            case "listarPregaoEletronicoItemSituacao":
                super.setFields("organizationId", "action", "itemId");
                break;

            default:
                break;
        }

        return super.dataStructure;
    }
}
