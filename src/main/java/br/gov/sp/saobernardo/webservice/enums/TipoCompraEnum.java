package br.gov.sp.saobernardo.webservice.enums;

public enum TipoCompraEnum {
    
    POR_PROCESSO_COM_EDITAL("porProcessoComEdital"),
    HOMOLOGADA("homologada"),
    DIRETA_POR_ANO("diretaPorAno");

    private final String valor;

    TipoCompraEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public static TipoCompraEnum fromValor(String valor) {
        for (TipoCompraEnum tipo : TipoCompraEnum.values()) {
            if (tipo.valor.equals(valor)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo de pregão desconhecido: " + valor);
    }
}

