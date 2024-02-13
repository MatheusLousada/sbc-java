package br.gov.sp.saobernardo.webservice.classes.api.enums;

public enum ContentTypeEnum {
    
    APPLICATION_JSON("application/json");

    private final String type;

    ContentTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
