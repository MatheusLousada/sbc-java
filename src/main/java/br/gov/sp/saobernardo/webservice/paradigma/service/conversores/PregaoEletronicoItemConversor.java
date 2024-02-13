package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.ArrayOfPregaoEletronicoItemEnderecoDTO;
import br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.ArrayOfPregaoEletronicoItemLanceDTO;
import br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.PregaoEletronicoItemDTO;
import br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.PregaoEletronicoItemEnderecoDTO;
import br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.PregaoEletronicoItemLanceDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemEnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemModel;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.paradigma.service.ServicesName;

public class PregaoEletronicoItemConversor implements DePara<PregaoEletronicoItemModel, PregaoEletronicoItemDTO> {
	private Conversores conversor;
	private PregaoEletronicoItemEnderecoConversor convEnd;
	private PregaoEletronicoItemLanceConversor convLance;

	public PregaoEletronicoItemConversor() {
		super();
		conversor = new Conversores(
				new QName(ServicesName.PREGAO_ELETRONICO.getUrl(), ServicesName.PREGAO_ELETRONICO.getServico()));
		convEnd = new PregaoEletronicoItemEnderecoConversor();
		convLance = new PregaoEletronicoItemLanceConversor();

	}

	@Override
	public PregaoEletronicoItemModel converteParaModel(PregaoEletronicoItemDTO dto) {
		PregaoEletronicoItemModel item = new PregaoEletronicoItemModel();

		item.setQuantidadeItem(dto.getDQtItem());
		item.setValorReferencia(dto.getDVlReferencia());
		item.setCodigoItemSequencial(dto.getNCdItemSequencial());
		item.setCodigoClasse(dto.getSCdClasse());
		item.setCodigoItemLegado(dto.getSCdItemLegado());
		item.setCodigoProduto(dto.getSCdProduto());
		item.setCodigoUnidadeMedida(dto.getSCdUnidadeMedida());
		item.setDescricaoItem(dto.getSDsItem());

		List<PregaoEletronicoItemEnderecoModel> itensEnderecos = new ArrayList<PregaoEletronicoItemEnderecoModel>();
		List<PregaoEletronicoItemEnderecoDTO> itensEnderecosDTO = dto.getLstPregaoEletronicoItemEnderecoDTO()
				.getPregaoEletronicoItemEnderecoDTO();

		for (PregaoEletronicoItemEnderecoDTO endereco : itensEnderecosDTO) {
			itensEnderecos.add(convEnd.converteParaModel(endereco));
		}
		item.setPregaoEletronicoItensEnderecos(itensEnderecos);

		List<PregaoEletronicoItemLanceModel> lances = new ArrayList<PregaoEletronicoItemLanceModel>();
		List<PregaoEletronicoItemLanceDTO> lancesDto = dto.getLstPregaoEletronicoItemLanceDTO().getValue()
				.getPregaoEletronicoItemLanceDTO();
		for (PregaoEletronicoItemLanceDTO lance : lancesDto) {
			lances.add(convLance.converteParaModel(lance));
		}

		item.setLances(lances);
		// dto.setNStItem(item.set);
		item.setCodigoLoteLegado(dto.getSCdLoteLegado().getValue());

		return item;
	}

	@Override
	public PregaoEletronicoItemDTO converteParaDTO(PregaoEletronicoItemModel item) {
		PregaoEletronicoItemDTO dto = new PregaoEletronicoItemDTO();
		dto.setDQtItem(item.getQuantidadeItem());
		dto.setDVlReferencia(item.getValorReferencia());
		dto.setNCdItemSequencial(item.getCodigoItemSequencial());
		dto.setSCdClasse(item.getCodigoClasse());
		dto.setSCdItemLegado(item.getCodigoItemLegado());
		dto.setSCdProduto(item.getCodigoProduto());
		dto.setSCdUnidadeMedida(item.getCodigoUnidadeMedida());
		dto.setSDsItem(item.getDescricaoItem());

		List<PregaoEletronicoItemEnderecoModel> itensEnderecos = item.getPregaoEletronicoItensEnderecos();
		ArrayOfPregaoEletronicoItemEnderecoDTO itensEnderecosDTO = new ArrayOfPregaoEletronicoItemEnderecoDTO();

		for (PregaoEletronicoItemEnderecoModel endereco : itensEnderecos) {
			itensEnderecosDTO.getPregaoEletronicoItemEnderecoDTO().add(convEnd.converteParaDTO(endereco));
		}
		dto.setLstPregaoEletronicoItemEnderecoDTO(itensEnderecosDTO);

		List<PregaoEletronicoItemLanceModel> lances = item.getLances();
		ArrayOfPregaoEletronicoItemLanceDTO arrayLances = new ArrayOfPregaoEletronicoItemLanceDTO();
		for (PregaoEletronicoItemLanceModel lance : lances) {
			arrayLances.getPregaoEletronicoItemLanceDTO().add(convLance.converteParaDTO(lance));
		}

		dto.setLstPregaoEletronicoItemLanceDTO(conversor.converteParaJAXBElement(arrayLances));
		/** dto.setNStItem(item.get);
		 dto.setSCdLoteLegado(item.getCodigoLoteLegado());
		 * 
		 */
		return dto;
	}

}
