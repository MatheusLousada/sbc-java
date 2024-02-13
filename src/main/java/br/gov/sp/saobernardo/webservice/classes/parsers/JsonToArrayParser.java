package br.gov.sp.saobernardo.webservice.classes.parsers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Classe JsonToArrayParser responsável por converter strings JSON em listas de objetos Java.
 * Utiliza Gson para deserialização e reflexão para determinação dinâmica do tipo de objeto.
 */
public class JsonToArrayParser {

    /**
     * Converte uma string JSON em uma lista de objetos de um tipo especificado.
     * Utiliza reflexão para determinar a estrutura de tipo com base no nome da classe e ação.
     *
     * @param json A string JSON a ser convertida.
     * @param className O nome da classe que define o tipo de objeto para conversão.
     * @param action A ação que determina a estrutura específica de tipo dentro da classe.
     * @return Uma lista de objetos do tipo especificado.
     * @throws Exception Se ocorrer um erro na reflexão ou na deserialização do JSON.
     */
    public static <T> List<T> parse(String json, String className, String action) throws Exception {

        Gson gson = new Gson();
        String responseTypeClassName = "br.gov.sp.saobernardo.webservice.classes.responsesTypes." + className + "ResponseType";
        Class<?> responseTypeClass = Class.forName(responseTypeClassName);
        Method getStructureMethod = responseTypeClass.getDeclaredMethod("getStructure", String.class);
        Type type = (Type) getStructureMethod.invoke(null, action);
        Type listType = TypeToken.getParameterized(List.class, type).getType();
        List<T> list = gson.fromJson(json, listType);
        
        return list;
    }
}
