package br.gov.sp.saobernardo.webservice.classes.api;

import java.util.HashMap;
import java.util.Map;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class EntidadeTokenMapping {
    
    private static final Map<String, String> entidadeTokenMap = new HashMap<>();
    private static final String token = "ZmQ1MzlkY2UtYjUwNy00NTE0LWI2ZmYtNWU4NjMzM2JjMzFlOjgzNjNhZDE0LTQyYjAtNDRiNy04YzFlLTE5OGI2ZjUwYjc5OQ==";
    
    static {
        entidadeTokenMap.put("PREFEITURA", token);
        entidadeTokenMap.put("SBC_PREV", token);
        entidadeTokenMap.put("FACULDADE_DIREITO", token);
    }
    
    public static String getTokenForEntidade(ContextoImportacao contexto) {
        return entidadeTokenMap.get(contexto.getOrgao().getNome());
    }
}
