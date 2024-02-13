package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;

public class DocumentoResponse implements InterfaceResponse {

    public static Type getStructure(String action) {

        return Documento.class;
    }

    public DocumentoResponse getClass(String action) {

        return new Documento();
    }
    
    @Override
    public InterfaceResponse getInterface() {
        return this;
    }

    public class Documento extends DocumentoResponse {}
}
