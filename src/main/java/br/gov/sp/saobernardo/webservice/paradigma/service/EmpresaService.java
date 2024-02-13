package br.gov.sp.saobernardo.webservice.paradigma.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import br.gov.sp.saobernardo.paradigma.ws.empresa.ArrayOfEmpresaDTO;
import br.gov.sp.saobernardo.paradigma.ws.empresa.Empresa;
import br.gov.sp.saobernardo.paradigma.ws.empresa.EmpresaDTO;
import br.gov.sp.saobernardo.paradigma.ws.empresa.IEmpresa;
import br.gov.sp.saobernardo.paradigma.ws.empresa.RetornoDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.paradigma.service.conversores.EmpresaConversor;

public class EmpresaService implements ServiceGrava<EmpresaModel> {

	private IEmpresa servico;
	private EmpresaConversor conversor;

	public EmpresaService(WSDLs wsdls) {
		conversor = new EmpresaConversor();
		try {
			URL wsdlURL = new URL(wsdls.getValue());
			QName serviceName = new QName(ServicesName.EMPRESA.getUrl(), ServicesName.EMPRESA.getServico());
			Empresa ss = new Empresa(wsdlURL, serviceName);
			servico = ss.getBasicHttpBindingIEmpresa();
		} catch (Exception e) {
			System.console().writer().println(e);
		}
	}

	@Override
	public List<EmpresaModel> grava(List<EmpresaModel> empresas) {

		List<EmpresaModel> processadas = new ArrayList<EmpresaModel>();
		for (EmpresaModel empresa : empresas) {
			EmpresaModel grava = this.grava(empresa);
			processadas.add(grava);
		}
		return processadas;
	}

	@Override
	public EmpresaModel grava(EmpresaModel empresa) {
		//EmpresaDTO e = converteparaEmpresaDTO(empresa);
		EmpresaDTO e = conversor.converteParaDTO(empresa);
		ArrayOfEmpresaDTO lstEmpresa = new ArrayOfEmpresaDTO();
		lstEmpresa.getEmpresaDTO().add(e);
		RetornoDTO processarEmpresa = servico.processarEmpresa(lstEmpresa);

		return conversor.converteLogParaModel(processarEmpresa.getLstWbtLogDTO().getWbtLogDTO().get(0));
		// WbtLogDTO wbtLogDTO =
		// processarEmpresa.getLstWbtLogDTO().getWbtLogDTO().get(0);
		// return converteDeParadigmaParaNossoModelo(wbtLogDTO);
	}

	/**
	 * Este web service foi construido par retornar uma empresa consultada pelo
	 * codigo do e-procurement Wbc.
	 * 
	 * Schema XML (xsd): {@link}http://[URLdoCliente]/Services/Empresa.svc?wsdl
	 * 
	 * Tipo do processo: Sincrono
	 * 
	 * Metodo de consulta de empresa
	 * 
	 * Assinatura: RetornarEmpresaPorCodigoWbc
	 * 
	 * @param int
	 *            nCdEmpresa
	 * 
	 * @return EmpresaDTO Objeto contendo os dados da empresa Estrutura do
	 *         objeto EmpresaDTO: Esta estrutura eh a mesma que estah descrita
	 *         no item Web Service de Envio de Empresa.
	 */
	public EmpresaModel retornarEmpresaPorCodigoWbc(Long codigoEmpresaParadigma) {
		EmpresaDTO empresaDto = servico.retornarEmpresaPorCodigoWBC(codigoEmpresaParadigma);
		//return converteParaEmpresaModel(empresaDto);
		return conversor.converteParaModel(empresaDto);
	}

	/**
	 * Web service de consulta de Empresa por Cnpj
	 * 
	 * Metodo de consulta de empresa Este web service foi construido retornar
	 * uma empresa consultada por CNPJ.
	 * 
	 * Schema XML (xsd): {@link} http://[URLdoCliente]/Services/Empresa.svc?wsdl
	 * 
	 * Tipo do processo: Sincrono
	 * 
	 * Assinatura: RetornarEmpresaPorCnpj
	 *
	 * @param String
	 *            Cnpj
	 *
	 * @return EmpresaDTO Objeto contendo os dados da empresa Esta estrutura eh
	 *         a mesma que estah descrita no item Web Service de Envio de
	 *         Empresa.
	 *
	 */
	public EmpresaModel retornarEmpresaPorCnpj(String cnpj) {
		EmpresaDTO empresaDto = servico.retornarEmpresaPorCnpj(cnpj);
		//return converteParaEmpresaModel(empresaDto);
		return conversor.converteParaModel(empresaDto);
	}

	/**
	 * Metodo de consulta de empresa
	 * 
	 * @param sCdEmpresaErp
	 *            Codigo string ERP
	 * 
	 * @return EmpresaDTO Objeto contendo os dados da empresa Esta estrutura eh
	 *         a mesma que estah descrita no item Web Service de Envio de
	 *         Empresa.
	 * 
	 */
	public EmpresaModel retornarEmpresa(String codigoERP) {
		EmpresaDTO empresaDto = servico.retornarEmpresa(codigoERP);
		//return converteParaEmpresaModel(empresaDto);
		return conversor.converteParaModel(empresaDto);
	}

	public List<EmpresaModel> retornaEmpresasSemDePara() {
		List<EmpresaModel> empresas = new ArrayList<EmpresaModel>();
		for (EmpresaDTO dtoSemDePara : servico.retornarEmpresaSemDePara().getEmpresaDTO()) {
			//empresas.add(converteParaEmpresaModel(dtoSemDePara));
			empresas.add(conversor.converteParaModel(dtoSemDePara));
		}
		return empresas;
	}

	/**
	 * 4.5. Web service de retorno de empresa compradora por nome
	 * 
	 * Metodo de retorno de empresas
	 * 
	 * Este web service foi constru�do para devolver um lote de empresas
	 * compradoras cadastradas no sistema WBC E-procurement e enviados ao
	 * sistema externo.
	 * 
	 * Atrav�s deste Metodo, ser� poss�vel retornar, as informa��es relacionadas
	 * as empresas compradoras cadastrados no WBC.
	 * 
	 * Tipo do processo: S�ncrono
	 * 
	 * 
	 * Schema XML (xsd): {@link}http://[URLdoCliente]/Servicos/Empresa.svc?wsdl
	 * 
	 * 
	 * 
	 * @param numeroPagina
	 *            Int @N�o obrigat�rio. N�mero da p�gina. O preenchimento deste
	 *            par�metro faz com que o retorno desse webservice seja paginado
	 *            de 100 em 100 registros, isto �, se preenchido, o webservice
	 *            retornar� apenas 100 registros de acordo com o n�mero da
	 *            p�gina informada. A pagina��o a cada 100 registros � o
	 *            comportamento padr�o, o mesmo pode ser parametrizado. O n�o
	 *            preenchimento deste par�metro, far� com que todos os registros
	 *            sejam retornados em uma estrutura �nica.
	 * 
	 * @param nomeEmpresa
	 *            String Filtro pela Raz�o Social da empresa. O preenchimento
	 *            deste par�metro faz com que sejam retornadas apenas as
	 *            empresas com que o nome contenham o valor informado no filtro.
	 * 
	 * @param codigoSituacao
	 *            Int N�o obrigat�rio. Filtro pela situa��o da empresa. O
	 *            preenchimento deste par�metro faz com que sejam retornados
	 *            apenas empresas que estejam na situa��o informada no filtro.
	 *            Poss�veis valores: {@value 0} - Inativa {@value 1} - Ativa
	 *            {@value 2} - Em processo externo {@value 3} - Aguardando
	 *            homologa��o {@value 4} - N�o aprovada {@value 5} - Em processo
	 *            de exporta��o {@value 32} - Em processo de credenciamento do
	 *            ClicBusiness
	 * 
	 * @return RetornoListaDTO Objeto padr�o de retorno onde na propriedade
	 *         lstObjetoRetorno s�o retornados os registros na estrutura do
	 *         objeto EmpresaDTO.
	 * 
	 *         Estrutura do objeto EmpresaDTO: Esta estrutura � a mesma que est�
	 *         descrita no item Web Service de Envio de Empresa.
	 */

	public List<EmpresaModel> retornarEmpresaCompradoraPorNome(String nomeEmpresa, int codigoSituacao,
			int numeroPagina) {
		List<EmpresaModel> empresas = new ArrayList<EmpresaModel>();
		for (EmpresaDTO empresaDto : servico.retornarEmpresaCompradoraPorNome(nomeEmpresa, codigoSituacao, numeroPagina)
				.getLstObjetoRetorno().getEmpresaDTO()) {
			//empresas.add(converteParaEmpresaModel(empresaDto));
			empresas.add(conversor.converteParaModel(empresaDto));
		}
		return empresas;
	}

	/**
	 * private EmpresaModel converteDeParadigmaParaNossoModelo(WbtLogDTO
	 * wbtLogDTO) { EmpresaModel empresa = new EmpresaModel();
	 * 
	 * empresa.setCodigoEmpresa(wbtLogDTO.getSCdOrigem().getValue());
	 * LogDeRetornoDaGravacao logDaGravacao = new LogDeRetornoDaGravacao();
	 * logDaGravacao.setData(wbtLogDTO.getTDtLog().toString());
	 * logDaGravacao.setToken(wbtLogDTO.getSNrToken().getValue());
	 * logDaGravacao.setDescricao(wbtLogDTO.getSDsLog().getValue());
	 * empresa.setLogDaGravacao(logDaGravacao); return empresa; }
	 */
	/**
	private EmpresaDTO converteparaEmpresaDTO(EmpresaModel empresa) {
		EmpresaDTO dto = new EmpresaDTO();
		dto.setSNmBairro(empresa.getBairro());
		dto.setSDsCep(empresa.getCep());
		dto.setSCdEmpresa(empresa.getCodigoEmpresa());
		dto.setSNrCnpj(empresa.getCnpj());
		dto.setSNmEmpresa(empresa.getNomeEmpresa());
		dto.setSNmFantasia(empresa.getNomeFantasia());
		dto.setSDsEndereco(empresa.getEndereco());
		dto.setSNmBairro(empresa.getBairro());
		dto.setSNmCidade(empresa.getCidade());
		dto.setSSgEstado(empresa.getUf());

		dto.setSSgPais(empresa.getSiglaPais());

		dto.setNCdSituacao(empresa.getSituacao().getSituacaoEmpresa());
		dto.setNCdTipo(empresa.getTipoEmpresa().getTipo());

		return dto;
	}
*/
	/**
	private EmpresaModel converteParaEmpresaModel(EmpresaDTO empresaDto) {
		EmpresaModel empresa = new EmpresaModel();

		empresa.setBairro(empresaDto.getSNmBairro());
		empresa.setCep(empresaDto.getSDsCep());
		empresa.setCodigoEmpresa(empresaDto.getSCdEmpresa());
		empresa.setCnpj(empresaDto.getSNrCnpj());
		empresa.setNomeEmpresa(empresaDto.getSNmEmpresa());
		empresa.setNomeFantasia(empresaDto.getSNmFantasia());
		empresa.setEndereco(empresaDto.getSDsEndereco());
		empresa.setBairro(empresaDto.getSNmBairro());
		empresa.setCidade(empresaDto.getSNmCidade());
		empresa.setUf(empresaDto.getSSgEstado());
		empresa.setSiglaPais(empresaDto.getSSgPais());
		empresa.setSituacao(new SituacaoEmpresa(empresaDto.getNCdSituacao()));
		empresa.setTipoEmpresa(new TipoEmpresa(empresaDto.getNCdTipo()));

		return empresa;
	}
	*/

}