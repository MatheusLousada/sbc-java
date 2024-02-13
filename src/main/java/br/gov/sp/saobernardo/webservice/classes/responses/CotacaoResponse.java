package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;

public class CotacaoResponse implements InterfaceResponse {

    public static Type getStructure(String action) {

        switch (action) {

            case "listarCotacoesEncerradasDescricao":
                return CotacoesEncerradasDescricao.class;

            case "listarCotacoesEncerradas":
                return CotacoesEncerradas.class;

            case "listarAnosCotacoesEncerradas":
                return AnosCotacoesEncerradas.class;

            case "isProcessoComCotacoesEncerradas":
                return ProcessoComCotacoesEncerradas.class;

            default:
                throw new IllegalArgumentException("Ação não existente.");
        }
    }

    public CotacaoResponse getClass(String action) {

        switch (action) {

            case "listarCotacoesEncerradasDescricao":
                return new CotacoesEncerradasDescricao();

            case "listarCotacoesEncerradas":
                return new CotacoesEncerradas();

            case "listarAnosCotacoesEncerradas":
                return new AnosCotacoesEncerradas();

            case "isProcessoComCotacoesEncerradas":
                return new ProcessoComCotacoesEncerradas();

            default:
                throw new IllegalArgumentException("Ação não existente em: CotacaoResponse");
        }
    }

    @Override
    public InterfaceResponse getInterface() {
        return this;
    }

    public class CotacoesEncerradasDescricao extends CotacaoResponse {

        private String scdprocesso;

        public String getScdprocesso() {
            return scdprocesso;
        }

        public void setScdprocesso(String scdprocesso) {
            this.scdprocesso = scdprocesso;
        }
    }

    public class CotacoesEncerradas extends CotacaoResponse {

        private String sCdProcesso;
        private String sDsCotacao;
        private String tDtInicial;
        private String tDtFinal;

        public String getSCdProcesso() {
            return sCdProcesso;
        }

        public void setSCdProcesso(String sCdProcesso) {
            this.sCdProcesso = sCdProcesso;
        }

        public String getSDsCotacao() {
            return sDsCotacao;
        }

        public void setSDsCotacao(String sDsCotacao) {
            this.sDsCotacao = sDsCotacao;
        }

        public String getTDtInicial() {
            return tDtInicial;
        }

        public void setTDtInicial(String tDtInicial) {
            this.tDtInicial = tDtInicial;
        }

        public String getTDtFinal() {
            return tDtFinal;
        }

        public void setTDtFinal(String tDtFinal) {
            this.tDtFinal = tDtFinal;
        }
    }

    public class AnosCotacoesEncerradas extends CotacaoResponse {

        private int ano;

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }
    }

    public class ProcessoComCotacoesEncerradas extends CotacaoResponse {

        private int situacao;

        public int getSituacao() {
            return situacao;
        }

        public void setSituacao(int situacao) {
            this.situacao = situacao;
        }
    }
}
