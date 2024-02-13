package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class CompraDiretaResponse implements InterfaceResponse {

    String action;

    public static Type getStructure(String action) {

        switch (action) {

            case "listarComprasHomologadas":
                return ComprasHomologadas.class;

            case "listarCompraPorProcessoComEdital":
                return CompraPorProcessoComEdital.class;

            case "listarCompraDiretaPorAno":
                return CompraDiretaPorAno.class;

            case "listarCompraDiretaItens":
                return CompraDiretaItens.class;

            case "listarComissao":
                return CompraDiretaComissaoResponse.class;

            default:
                throw new IllegalArgumentException("Ação não existente.");
        }
    }

    public Type getStructure() {

        switch (this.action) {

            case "listarComprasHomologadas":
                return ComprasHomologadas.class;

            case "listarCompraPorProcessoComEdital":
                return CompraPorProcessoComEdital.class;

            case "listarCompraDiretaPorAno":
                return CompraDiretaPorAno.class;

            case "listarCompraDiretaItens":
                return CompraDiretaItens.class;

            case "listarComissao":
                return CompraDiretaComissaoResponse.class;

            default:
                throw new IllegalArgumentException("Ação não existente.");
        }
    }

    public CompraDiretaResponse getClass(String action) {

        switch (action) {

            case "listarComprasHomologadas":
                return new ComprasHomologadas();

            case "listarCompraPorProcessoComEdital":
                return new CompraPorProcessoComEdital();

            case "listarCompraDiretaPorAno":
                return new CompraDiretaPorAno();

            case "listarCompraDiretaItens":
                return new CompraDiretaItens();

            case "listarComissao":
                return new CompraDiretaComissaoResponse();

            default:
                throw new IllegalArgumentException("Ação não existente em: CompraDiretaResponse");
        }
    }

    @Override
    public InterfaceResponse getInterface() {
        return this;
    }

    public class ComprasHomologadas extends CompraDiretaResponse {

        private String sNrProcessoDisplay;
        private String sNrEdital;
        private String nCdSituacao;
        private String tDtInicialProposta;
        private String tDtFinalProposta;
        private String nCdPrazoEntrega;
        private String sDsObjeto;

        public String getsNrProcessoDisplay() {
            return sNrProcessoDisplay;
        }

        public String getsNrEdital() {
            return sNrEdital;
        }

        public String getnCdSituacao() {
            return nCdSituacao;
        }

        public String gettDtInicialProposta() {
            return tDtInicialProposta;
        }

        public String gettDtFinalProposta() {
            return tDtFinalProposta;
        }

        public String getnCdPrazoEntrega() {
            return nCdPrazoEntrega;
        }

        public String getsDsObjeto() {
            return sDsObjeto;
        }

        public void setsNrProcessoDisplay(String sNrProcessoDisplay) {
            this.sNrProcessoDisplay = sNrProcessoDisplay;
        }

        public void setsNrEdital(String sNrEdital) {
            this.sNrEdital = sNrEdital;
        }

        public void setnCdSituacao(String nCdSituacao) {
            this.nCdSituacao = nCdSituacao;
        }

        public void settDtInicialProposta(String tDtInicialProposta) {
            this.tDtInicialProposta = tDtInicialProposta;
        }

        public void settDtFinalProposta(String tDtFinalProposta) {
            this.tDtFinalProposta = tDtFinalProposta;
        }

        public void setnCdPrazoEntrega(String nCdPrazoEntrega) {
            this.nCdPrazoEntrega = nCdPrazoEntrega;
        }

        public void setsDsObjeto(String sDsObjeto) {
            this.sDsObjeto = sDsObjeto;
        }
    }

    public class CompraPorProcessoComEdital extends CompraDiretaResponse {

        private String sNrProcessoDisplay;
        private String tDtInicialProposta;
        private int nCdCondicaoPagamento;
        private String tDtFinalProposta;
        private String nCdPrazoEntrega;
        private Long nCdCompraDireta;
        private String nCdSituacao;
        private String sNrEdital;

        public String getsNrProcessoDisplay() {
            return sNrProcessoDisplay;
        }

        public String gettDtInicialProposta() {
            return tDtInicialProposta;
        }

        public int getnCdCondicaoPagamento() {
            return nCdCondicaoPagamento;
        }

        public String gettDtFinalProposta() {
            return tDtFinalProposta;
        }

        public String getnCdPrazoEntrega() {
            return nCdPrazoEntrega;
        }

        public Long getnCdCompraDireta() {
            return nCdCompraDireta;
        }

        public String getnCdSituacao() {
            return nCdSituacao;
        }

        public String getsNrEdital() {
            return sNrEdital;
        }

        public void setsNrProcessoDisplay(String sNrProcessoDisplay) {
            this.sNrProcessoDisplay = sNrProcessoDisplay;
        }

        public void settDtInicialProposta(String tDtInicialProposta) {
            this.tDtInicialProposta = tDtInicialProposta;
        }

        public void setnCdCondicaoPagamento(int nCdCondicaoPagamento) {
            this.nCdCondicaoPagamento = nCdCondicaoPagamento;
        }

        public void settDtFinalProposta(String tDtFinalProposta) {
            this.tDtFinalProposta = tDtFinalProposta;
        }

        public void setnCdPrazoEntrega(String nCdPrazoEntrega) {
            this.nCdPrazoEntrega = nCdPrazoEntrega;
        }

        public void setnCdCompraDireta(Long nCdCompraDireta) {
            this.nCdCompraDireta = nCdCompraDireta;
        }

        public void setnCdSituacao(String nCdSituacao) {
            this.nCdSituacao = nCdSituacao;
        }

        public void setsNrEdital(String sNrEdital) {
            this.sNrEdital = sNrEdital;
        }
    }

    public class CompraDiretaPorAno extends CompraDiretaResponse {

        private String sNrEdital;
        private String sNrProcessoDisplay;
        private String sDsSituacao;

        public String getsNrEdital() {
            return sNrEdital;
        }

        public String getsNrProcessoDisplay() {
            return sNrProcessoDisplay;
        }

        public String getsDsSituacao() {
            return sDsSituacao;
        }

        public void setsNrEdital(String sNrEdital) {
            this.sNrEdital = sNrEdital;
        }

        public void setsNrProcessoDisplay(String sNrProcessoDisplay) {
            this.sNrProcessoDisplay = sNrProcessoDisplay;
        }

        public void setsDsSituacao(String sDsSituacao) {
            this.sDsSituacao = sDsSituacao;
        }
    }

    public class CompraDiretaItens extends CompraDiretaResponse {
    
        private Long numItem;
        private String sCdItemLegado;
        private int nCdItemSequencial;
        private String nCdLote;
        private Long nCdProduto;
        private String sDsItem;
        private BigDecimal dQtItem;
        private BigDecimal dVlReferencia;
    
        public Long getNumItem() {
            return numItem;
        }
    
        public String getSCdItemLegado() {
            return sCdItemLegado;
        }
    
        public int getNCdItemSequencial() {
            return nCdItemSequencial;
        }
    
        public String getNCdLote() {
            return nCdLote;
        }
    
        public Long getNCdProduto() {
            return nCdProduto;
        }
    
        public String getSDsItem() {
            return sDsItem;
        }
    
        public BigDecimal getDQtItem() {
            return dQtItem;
        }
    
        public BigDecimal getDVlReferencia() {
            return dVlReferencia;
        }

        public void setNumItem(Long numItem) {
            this.numItem = numItem;
        }
    
        public void setSCdItemLegado(String sCdItemLegado) {
            this.sCdItemLegado = sCdItemLegado;
        }
    
        public void setNCdItemSequencial(int nCdItemSequencial) {
            this.nCdItemSequencial = nCdItemSequencial;
        }
    
        public void setNCdLote(String nCdLote) {
            this.nCdLote = nCdLote;
        }
    
        public void setNCdProduto(Long nCdProduto) {
            this.nCdProduto = nCdProduto;
        }
    
        public void setSDsItem(String sDsItem) {
            this.sDsItem = sDsItem;
        }
    
        public void setDQtItem(BigDecimal dQtItem) {
            this.dQtItem = dQtItem;
        }
    
        public void setDVlReferencia(BigDecimal dVlReferencia) {
            this.dVlReferencia = dVlReferencia;
        }
    }
    
    public class CompraDiretaComissaoResponse extends CompraDiretaResponse {

        private String sCdUsuario;
        private int nIdPerfil;
    
        public String getSCdUsuario() {
            return sCdUsuario;
        }
    
        public int getNIdPerfil() {
            return nIdPerfil;
        }
    
        public void setSCdUsuario(String sCdUsuario) {
            this.sCdUsuario = sCdUsuario;
        }
    
        public void setNIdPerfil(int nIdPerfil) {
            this.nIdPerfil = nIdPerfil;
        }
    
        @Override
        public InterfaceResponse getInterface() {
            return this;
        }
    }
}
