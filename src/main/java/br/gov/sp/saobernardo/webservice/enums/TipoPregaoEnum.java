package br.gov.sp.saobernardo.webservice.enums;

public enum TipoPregaoEnum {
    
    POR_PROCESSO_COM_EDITAL("porProcessoComEdital"),
    HOMOLOGADO("homologado"),
    PREGAO_STRING("pregapString"),
    COMISSAO("comissao");

    private final String valor;

    TipoPregaoEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public static TipoPregaoEnum fromValor(String valor) {
        for (TipoPregaoEnum tipo : TipoPregaoEnum.values()) {
            if (tipo.valor.equals(valor)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo de pregão desconhecido: " + valor);
    }
}

