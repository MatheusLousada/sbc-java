package br.gov.sp.saobernardo.webservice.classes.bodys;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import br.gov.sp.saobernardo.webservice.classes.parsers.StringToJsonParser;

public abstract class AbstractBody {

    protected String action;
    protected ArrayList<String> dataStructure = new ArrayList<>();
    protected ArrayList<String> fields;
    protected JsonElement jsonData;

    public AbstractBody(String action) {
        setAction(action);
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }

    public abstract ArrayList<String> getDataStructure() throws Exception;

    protected void addDataStructure(String... fields) {
        dataStructure.addAll(Arrays.asList(fields));
    }

    protected ArrayList<String> getFields() {
        return this.fields;
    }

    protected void setFields(String... fields) {
        this.fields = new ArrayList<>(Arrays.asList(fields));
        this.addDataStructure(this.getFields().toArray(new String[0]));
    }

    public JsonElement getJson() {
        return this.jsonData;
    }

    public void setJson(String jsonStr) throws Exception {
        JsonElement jsonElement = StringToJsonParser.parse(jsonStr);

        if (validateJson(jsonElement)) {
            this.jsonData = jsonElement;
        } else {
            throw new IllegalArgumentException("JSON não possui a estrutura esperada.");
        }
    }

    private boolean validateJson(JsonElement jsonElement) throws Exception {
        ArrayList<String> structure = getDataStructure();

        for (String key : structure) {
            if (!jsonElement.getAsJsonObject().has(key)) {
                return false;
            }
        }

        return true;
    }
    
    public void updateJson(String jsonStr) throws Exception {
        
        JsonElement newJsonElement = StringToJsonParser.parse(jsonStr);
        JsonObject newJsonObject = newJsonElement.getAsJsonObject();

        if (this.jsonData == null) {
            this.jsonData = newJsonObject;
        } else {
            JsonObject existingJsonObject = this.jsonData.getAsJsonObject();
            mergeJsonObjects(existingJsonObject, newJsonObject);
            this.jsonData = existingJsonObject;
        }
    }

    private void mergeJsonObjects(JsonObject existingJsonObject, JsonObject newJsonObject) {
        for (String key : newJsonObject.keySet()) {
            existingJsonObject.add(key, newJsonObject.get(key));
        }
    }
}
