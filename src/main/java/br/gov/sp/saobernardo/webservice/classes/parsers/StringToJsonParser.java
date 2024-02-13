package br.gov.sp.saobernardo.webservice.classes.parsers;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonParseException;

/**
 * Classe StringToJsonParser responsável por converter strings JSON em elementos JsonElement.
 * Utiliza a biblioteca Gson para análise e conversão de strings JSON.
 */
public class StringToJsonParser {

    /**
     * Converte uma string JSON em um elemento JsonElement.
     * Verifica se o elemento JSON é um objeto ou array e retorna o tipo correspondente.
     *
     * @param jsonString A string JSON a ser convertida.
     * @return Um objeto JsonElement representando o JSON fornecido.
     * @throws JsonParseException Se a string fornecida não formar um objeto ou array JSON válido.
     */
    public static JsonElement parse(String jsonString) throws JsonParseException {
        JsonElement jsonElement = JsonParser.parseString(jsonString);
        
        if (jsonElement.isJsonObject()) {
            return jsonElement.getAsJsonObject();
        } else if (jsonElement.isJsonArray()) {
            return jsonElement.getAsJsonArray();
        } else {
            throw new JsonParseException("O JSON fornecido não é um Objeto nem um Array válido.");
        }
    }
}
