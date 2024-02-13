package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;

public class EmpresaResponse implements InterfaceResponse {

    private String sNrCnpj;

    public String getsNrCnpj() {
        return sNrCnpj;
    }

    public void setsNrCnpj(String sNrCnpj) {
        this.sNrCnpj = sNrCnpj;
    }

    public static Type getStructure(String action) {

        switch (action) {

            case "listarTodasEmpresas":
            case "listarTodasEmpresasAlteradasRecentemente":
            case "listarDadosCadastraisDeEmpresas":
            case "listarDadosCadastraisDeNovasEmpresas":
            case "listarPeloCnpj":
            case "listarNovoPeloCnpj":
                return Empresa.class;

            case "listarCnpjs":
                return EmpresaString.class;

            default:
                throw new IllegalArgumentException("EmpresaResponse: Ação não existente.");
        }
    }

    public EmpresaResponse getClass(String action) {

        switch (action) {

            case "listarTodasEmpresas":
            case "listarTodasEmpresasAlteradasRecentemente":
            case "listarDadosCadastraisDeEmpresas":
            case "listarDadosCadastraisDeNovasEmpresas":
            case "listarPeloCnpj":
            case "listarNovoPeloCnpj":
                return new Empresa();

            case "listarCnpjs":
                return new EmpresaString();

            default:
                throw new IllegalArgumentException("Ação não existente em: EmpresaResponse");
        }
    }

    @Override
    public InterfaceResponse getInterface() {
        return this;
    }

    public static class Empresa extends EmpresaResponse {

        private String sDsContatoEmail;
        private String sNmEmpresa;
        private String sNmFantasia;
        private Long nStEmpresa;
        private int nIdSuperSimples;
        private Long nCdEmpresa;
        private String sNrInscricaoMunicipal;
        private String sNrInscricaoEstadual;
        private String sDsContatoFone;
        private String sDsContatoFax;
    
        public String getsDsContatoEmail() {
            return sDsContatoEmail;
        }
    
        public String getsNmEmpresa() {
            return sNmEmpresa;
        }
    
        public String getsNmFantasia() {
            return sNmFantasia;
        }
    
        public Long getnStEmpresa() {
            return nStEmpresa;
        }
    
        public int getnIdSuperSimples() {
            return nIdSuperSimples;
        }
    
        public Long getnCdEmpresa() {
            return nCdEmpresa;
        }
    
        public String getsNrInscricaoMunicipal() {
            return sNrInscricaoMunicipal;
        }
    
        public String getsNrInscricaoEstadual() {
            return sNrInscricaoEstadual;
        }
    
        public String getsDsContatoFone() {
            return sDsContatoFone;
        }
    
        public String getsDsContatoFax() {
            return sDsContatoFax;
        }
    
        public void setsDsContatoEmail(String sDsContatoEmail) {
            this.sDsContatoEmail = sDsContatoEmail;
        }
    
        public void setsNmEmpresa(String sNmEmpresa) {
            this.sNmEmpresa = sNmEmpresa;
        }
    
        public void setsNmFantasia(String sNmFantasia) {
            this.sNmFantasia = sNmFantasia;
        }
    
        public void setnStEmpresa(Long nStEmpresa) {
            this.nStEmpresa = nStEmpresa;
        }
    
        public void setnIdSuperSimples(int nIdSuperSimples) {
            this.nIdSuperSimples = nIdSuperSimples;
        }
    
        public void setnCdEmpresa(Long nCdEmpresa) {
            this.nCdEmpresa = nCdEmpresa;
        }
    
        public void setsNrInscricaoMunicipal(String sNrInscricaoMunicipal) {
            this.sNrInscricaoMunicipal = sNrInscricaoMunicipal;
        }
    
        public void setsNrInscricaoEstadual(String sNrInscricaoEstadual) {
            this.sNrInscricaoEstadual = sNrInscricaoEstadual;
        }
    
        public void setsDsContatoFone(String sDsContatoFone) {
            this.sDsContatoFone = sDsContatoFone;
        }
    
        public void setsDsContatoFax(String sDsContatoFax) {
            this.sDsContatoFax = sDsContatoFax;
        }
    }    

    public static class EmpresaString extends EmpresaResponse {}
}