package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaComissaoModel;

public class PregaoEletronicoResponse implements InterfaceResponse {

    private String sNrProcessoDisplay;
    private String sNrEdital;
    private String nCdSituacao;
    private String tDtInicialProposta;
    private String tDtFinalProposta;
    private String tDtInicialDisputa;
    private List<CompraDiretaComissaoModel> comissao;

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

    public String gettDtInicialDisputa() {
        return tDtInicialDisputa;
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

    public void settDtInicialDisputa(String tDtInicialDisputa) {
        this.tDtInicialDisputa = tDtInicialDisputa;
    }

    public List<CompraDiretaComissaoModel> getComissao() {
        return this.comissao;
    }

    public static Type getStructure(String action) {

        switch (action) {

            case "listarPregoesComEdital":
                return PregaoPorProcessoComEdital.class;

            case "listarPregoesHomologados":
                return PregaoHomologado.class;

            case "listarPorAno":
                return PregaoPorAno.class;

            default:
                throw new IllegalArgumentException("Ação não existente.");
        }
    }

    public PregaoEletronicoResponse getClass(String action) {

        switch (action) {

            case "listarPregoesComEdital":
                return new PregaoPorProcessoComEdital();

            case "listarPregoesHomologados":
                return new PregaoHomologado();

            case "listarPorAno":
                return new PregaoPorAno();

            default:
                throw new IllegalArgumentException("Ação não existente em: PregaoEletronicoResponse");
        }
    }

    public static class PregaoPorProcessoComEdital extends PregaoEletronicoResponse {

        private String nCdPrazoEntrega;
        private int nCdCondicaoPagamento;
        private Long nCdPregaoEletronico;

        public String getnCdPrazoEntrega() {
            return nCdPrazoEntrega;
        }

        public int getnCdCondicaoPagamento() {
            return nCdCondicaoPagamento;
        }

        public Long getnCdPregaoEletronico() {
            return nCdPregaoEletronico;
        }

        public void setnCdPrazoEntrega(String nCdPrazoEntrega) {
            this.nCdPrazoEntrega = nCdPrazoEntrega;
        }

        public void setnCdCondicaoPagamento(int nCdCondicaoPagamento) {
            this.nCdCondicaoPagamento = nCdCondicaoPagamento;
        }

        public void setnCdPregaoEletronico(Long nCdPregaoEletronico) {
            this.nCdPregaoEletronico = nCdPregaoEletronico;
        }
    }

    public static class PregaoHomologado extends PregaoEletronicoResponse {

        private String sDsObjeto;

        public String getsDsObjeto() {
            return sDsObjeto;
        }

        public void setsDsObjeto(String sDsObjeto) {
            this.sDsObjeto = sDsObjeto;
        }
    }

    @Override
    public InterfaceResponse getInterface() {
        return this;
    }

    public static class PregaoPorAno extends PregaoEletronicoResponse {

        private int ano;

        @Override
        public InterfaceResponse getInterface() {
            return this;
        }
    
        public int getAno() {
            return ano;
        }
    
        public void setAno(int ano) {
            this.ano = ano;
        }
    }
}
