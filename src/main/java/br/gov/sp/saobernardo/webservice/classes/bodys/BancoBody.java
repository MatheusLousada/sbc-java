package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;

/**
 * Classe BancoBody estende AbstractBody e é usada para criar corpos de requisição específicos para operações bancárias.
 */
public class BancoBody extends AbstractBody {

    /**
     * Construtor que recebe uma ação e a encaminha para a classe base AbstractBody.
     * 
     * @param action Ação que será realizada, usada para configurar a estrutura de dados.
     */
    public BancoBody(String action) {
        super(action);
    }

    /**
     * Sobrescreve o método getDataStructure da classe AbstractBody.
     * Configura a estrutura de dados com base na ação fornecida.
     * 
     * @return ArrayList<String> Retorna a estrutura de dados configurada.
     */
    @Override
    public ArrayList<String> getDataStructure() throws Exception {
        switch (this.action) {
            case "listarBancoEmpresa":
                super.setFields("organizationId", "action", "cnpj");
                break;


            default:
                throw new Exception("Body não existente para essa action");
        }
        
        return super.dataStructure;
    }
}
