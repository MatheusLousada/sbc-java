package br.gov.sp.saobernardo.webservice.classes.api.enums;

public enum AuthenticationTypeEnum {
    
    BEARER("Bearer "),
    BASIC("Basic ");

    private final String type;

    AuthenticationTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
