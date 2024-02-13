package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import br.gov.sp.saobernardo.paradigma.ws.compradireta.ArrayOfComissaoDTO;
import br.gov.sp.saobernardo.paradigma.ws.compradireta.ArrayOfCompraDiretaItemDTO;
import br.gov.sp.saobernardo.paradigma.ws.compradireta.ArrayOfCompraDiretaLoteDTO;
import br.gov.sp.saobernardo.paradigma.ws.compradireta.ComissaoDTO;
import br.gov.sp.saobernardo.paradigma.ws.compradireta.CompraDiretaDTO;
import br.gov.sp.saobernardo.paradigma.ws.compradireta.CompraDiretaItemDTO;
import br.gov.sp.saobernardo.paradigma.ws.compradireta.CompraDiretaLoteDTO;
import br.gov.sp.saobernardo.paradigma.ws.compradireta.WbtLogDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaComissaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaLoteModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.paradigma.service.ServicesName;
import br.gov.sp.saobernardo.webservice.paradigma.service.Servicos;

public class CompraDiretaConversor
		implements DePara<CompraDiretaModel, CompraDiretaDTO>, DeParaLog<CompraDiretaModel, WbtLogDTO> {

	private CompraDiretaLoteConversor convLote;
	private CompraDiretaComissaoConversor convComissao;
	private CompraDiretaItemConversor convItem;
	private Conversores conv;

	public CompraDiretaConversor() {
		convLote = new CompraDiretaLoteConversor();
		convComissao = new CompraDiretaComissaoConversor();
		convItem = new CompraDiretaItemConversor();
		conv = new Conversores(new QName(ServicesName.COMPRA_DIRETA.getUrl(), ServicesName.COMPRA_DIRETA.getServico()));

	}

	@Override
	public CompraDiretaModel converteLogParaModel(WbtLogDTO wbtLogDTO) {
		Servicos<WbtLogDTO> serv = new Servicos<WbtLogDTO>(WbtLogDTO.class);

		CompraDiretaModel compra = new CompraDiretaModel();
		LogDeRetornoDaGravacao listaLogs;
		try {
			listaLogs = serv.converteParaLogRetornoGravacaoModel(wbtLogDTO);
		} catch (Exception e) {
			e.printStackTrace();
			listaLogs = new LogDeRetornoDaGravacao();
			listaLogs.setDescricao("Erro na conversao " + e.getMessage());
		}
		compra.setLogDaGravacao(listaLogs);
		return compra;
	}

	@Override
	public CompraDiretaModel converteParaModel(CompraDiretaDTO dto) {

		CompraDiretaModel compra = new CompraDiretaModel();

		compra.setPermiteChatBilateral(dto.getBFlChatBilateral());
		compra.setRestringeChatBilateralFornecedores(dto.getBFlChatBilateralRestrito());
		compra.setDesativarAutoEncerramento(dto.getBFlDesativarAutoEncerramento());
		compra.setMostraReferencia(dto.getBFlMostraReferencia());
		compra.setPermiteFornecedorInvalidarLance(dto.getBFlPermiteInvalidar());
		compra.setProrrogacaoAutomatica(dto.getBFlProrroga());
		compra.setPublicarEdital(dto.getBFlPublicarEdital());
		compra.setParticipacaoRestrita(dto.getBFlRestrito());
		compra.setExigeTermo(dto.getBFlTermo());
		compra.setTemVariacaoNosLances(dto.getBFlVariacao());
		compra.setValorVariacaoMax(dto.getDVlVariacaoMax());
		compra.setValorVariacaoMin(dto.getDVlVariacaoMin());
		compra.setCodigoMoeda(dto.getNCdMoeda());
		compra.setCodigoSituacao(dto.getNCdSituacao());
		compra.setCodigoTemplate(dto.getNCdTemplate());
		compra.setTipoAvaliacao(dto.getNIdAvaliacao());
		compra.setEstiloCompra(dto.getNIdEstilo());
		compra.setUsuarioEscolheMarca(dto.getNIdLanceMarca());
		compra.setPermiteUsuarioEscolherProcedencia(dto.getNIdLanceProcedencia());
		compra.setTipoApuracao(dto.getNIdTipoApuracao());
		compra.setNumeroCasasDecimais(dto.getNNrCasasDecimais());
		compra.setQuantosItensPagina(dto.getNQtItensPagina());
		compra.setProrrogacaoAutomatica(dto.getNVlProrroga());
		compra.setMinutosProrrogaCondicao(dto.getNVlProrrogaCondicao());
		compra.setCodigoComprador(dto.getSCdComprador());
		compra.setCodigoCondicaoPagamento(dto.getSCdCondicaoPagamento());
		compra.setCodigoPrazoEntrega(dto.getSCdPrazoEntrega());
		compra.setCodigoUsuarioCriador(dto.getSCdUsuarioCriador());
		compra.setDescricaoObjeto(dto.getSDsObjeto());
		compra.setNumeroProcessoDisplay(dto.getSNrProcessoDisplay());
		if (null != dto.getNIdTipoLanceInicial().getValue()) {
			compra.setTipoLanceInicial(dto.getNIdTipoLanceInicial().getValue());
		}
		compra.setObservacoes(dto.getSDsObservacoes().getValue());
		compra.setDescricaoTermo(dto.getSDsTermo().getValue());
		compra.setNumeroEdital(dto.getSNrEdital().getValue());
		compra.setDataFinal(dto.getTDtFinal());
		compra.setDataInicial(dto.getTDtInicial());
		if (null != dto.getBFlObrigarDeclaracaoVendedor().getValue()) {
			compra.setObrigarDeclaracaoVendedor(dto.getBFlObrigarDeclaracaoVendedor().getValue());
		}

		if (null != dto.getBFlPermitirLance().getValue()) {
			compra.setPermitirLance(dto.getBFlPermitirLance().getValue());
		}
		List<CompraDiretaItemModel> itens = new ArrayList<CompraDiretaItemModel>();
		for (CompraDiretaItemDTO itemDto : dto.getLstCompraDiretaItem().getCompraDiretaItemDTO()) {
			itens.add(convItem.converteParaModel(itemDto));
		}
		compra.setLstCompraDiretaItem(itens);

		List<CompraDiretaComissaoModel> comissoes = new ArrayList<CompraDiretaComissaoModel>();
		CompraDiretaComissaoModel comissao;
		for (ComissaoDTO komissao : dto.getLstCompraDiretaComissao().getValue().getComissaoDTO()) {
			comissao = new CompraDiretaComissaoModel();
			comissao.setPerfil(komissao.getNIdPerfil());
			comissao.setCodigoUsuario(komissao.getSCdUsuario());
			comissoes.add(comissao);
		}
		compra.setLstCompraDiretaComissao(comissoes);

		List<CompraDiretaLoteModel> lotes = new ArrayList<CompraDiretaLoteModel>();
		for (CompraDiretaLoteDTO lote : dto.getLstCompraDiretaLote().getValue().getCompraDiretaLoteDTO()) {
			lotes.add(convLote.converteParaModel(lote));
		}
		compra.setLstCompraDiretaLote(lotes);

		// FIXME: descomentar quando estiver correto
		/**
		 * dto.getLstCompraDiretaComissao(conv.converteParaJAXBElement(cdto));
		 * dto.getLstCompraDiretaLote(conv.converteParaJAXBElement(lotes));
		 * dto.getTDtPublicacao(conv.converteParaJAXBElement(compra.set));
		 * 
		 * dto.getNCdTipoCompraDireta(conv.converteParaJAXBElement((long)
		 * compra.setCodigoTipoCompraDireta()));
		 */

		return compra;
	}

	@Override
	public CompraDiretaDTO converteParaDTO(CompraDiretaModel compra) {
		CompraDiretaDTO dto = new CompraDiretaDTO();

		dto.setBFlChatBilateral(compra.getPermiteChatBilateral());
		dto.setBFlChatBilateralRestrito(compra.getRestringeChatBilateralFornecedores());
		dto.setBFlDesativarAutoEncerramento(compra.getDesativarAutoEncerramento());
		dto.setBFlMostraReferencia(compra.getMostraReferencia());

		dto.setBFlPermiteInvalidar(compra.getPermiteFornecedorInvalidarLance());
		dto.setBFlProrroga(compra.getProrrogacaoAutomatica());
		dto.setBFlPublicarEdital(compra.getbFlPublicarEdital());
		dto.setBFlRestrito(compra.getParticipacaoRestrita());
		dto.setBFlTermo(compra.getExigeTermo());
		dto.setBFlVariacao(compra.getTemVariacaoNosLances());
		dto.setDVlVariacaoMax(compra.getValorVariacaoMax());
		dto.setDVlVariacaoMin(compra.getValorVariacaoMin());

		dto.setNCdMoeda(compra.getCodigoMoeda());
		dto.setNCdSituacao(compra.getCodigoSituacao());
		dto.setNCdTemplate(compra.getCodigoTemplate());
		dto.setNIdAvaliacao(compra.getTipoAvaliacao());
		dto.setNIdEstilo(compra.getEstiloCompra());
		dto.setNIdLanceMarca(compra.getUsuarioEscolheMarca());
		dto.setNIdLanceProcedencia(compra.getPermiteUsuarioEscolherProcedencia());
		dto.setNIdTipoApuracao(compra.getTipoApuracao());
		dto.setNNrCasasDecimais(compra.getNumeroCasasDecimais());
		dto.setNQtItensPagina(compra.getQuantosItensPagina());
		dto.setNVlProrroga(compra.getProrrogacaoAutomatica());
		dto.setNVlProrrogaCondicao(compra.getMinutosProrrogaCondicao());
		dto.setSCdComprador(compra.getCodigoComprador());
		dto.setSCdCondicaoPagamento(compra.getCodigoCondicaoPagamento());
		dto.setSCdPrazoEntrega(compra.getCodigoPrazoEntrega());
		dto.setSCdUsuarioCriador(compra.getCodigoUsuarioCriador());
		dto.setSDsObjeto(compra.getDescricaoObjeto());
		dto.setSNrProcessoDisplay(compra.getNumeroProcessoDisplay());

		ArrayOfCompraDiretaItemDTO itens = new ArrayOfCompraDiretaItemDTO();
		for (CompraDiretaItemModel lstCompraDiretaItem : compra.getLstCompraDiretaItem()) {
			itens.getCompraDiretaItemDTO().add(convItem.converteParaDTO(lstCompraDiretaItem));
		}
		dto.setLstCompraDiretaItem(itens);

		dto.setBFlObrigarDeclaracaoVendedor(conv.converteParaJAXBElement(compra.getObrigarDeclaracaoVendedor()));
		dto.setBFlPermitirLance(conv.converteParaJAXBElement(compra.getPermitirLance()));

		ArrayOfComissaoDTO cdto = new ArrayOfComissaoDTO();
		for (CompraDiretaComissaoModel comissao : compra.getLstCompraDiretaComissao()) {
			cdto.getComissaoDTO().add(convComissao.converteParaDTO(comissao));
		}
		dto.setLstCompraDiretaComissao(conv.converteParaJAXBElement(cdto));

		ArrayOfCompraDiretaLoteDTO lotes = new ArrayOfCompraDiretaLoteDTO();
		for (CompraDiretaLoteModel lotez : compra.getLstCompraDiretaLote()) {
			lotes.getCompraDiretaLoteDTO().add(convLote.converteParaDTO(lotez));
		}
		dto.setLstCompraDiretaLote(conv.converteParaJAXBElement(lotes));

		// FIXME: descomentar quando estiver correto
		/**
		 * dto.setTDtPublicacao(conv.converteParaJAXBElement(compra.get));
		 * 
		 * dto.setNCdTipoCompraDireta(conv.converteParaJAXBElement((long)
		 * compra.getCodigoTipoCompraDireta()));
		 */

		dto.setNIdTipoLanceInicial(conv.converteParaJAXBElement(compra.getTipoLanceInicial()));
		dto.setSDsObservacoes(conv.converteParaJAXBElement(compra.getObservacoes()));
		dto.setSDsTermo(conv.converteParaJAXBElement(compra.getDescricaoTermo()));
		dto.setSNrEdital(conv.converteParaJAXBElement(compra.getNumeroEdital()));

		dto.setTDtFinal(compra.getDataFinal());
		dto.setTDtInicial(compra.getDataInicial());
		return dto;

	}

}
