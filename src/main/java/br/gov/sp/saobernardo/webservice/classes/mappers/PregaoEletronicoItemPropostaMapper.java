package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemProposta;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoItemPropostaMapperParametro;

public class PregaoEletronicoItemPropostaMapper extends AbstractMapper implements InterfaceMapper<PregaoEletronicoItemProposta, PregaoEletronicoItemPropostaMapperParametro> {

    private PregaoEletronicoItemPropostaMapperParametro itemProposta;

    public PregaoEletronicoItemPropostaMapper(PregaoEletronicoItemPropostaMapperParametro p) throws Exception {
        this.itemProposta = p;
        setDados();
    }

	@Override
    public void setDados() throws Exception {

		ResultSet resultSet = this.itemProposta.getResultSet();
		PregaoEletronicoItemProposta proposta = this.itemProposta.getProposta();

		while (resultSet.next()) {
			
			final String sDsMarca = resultSet.getString("sDsMarca");
			final String sNrRegistro = resultSet.getString("sNrRegistro");
			final String sDsEmbalagem = resultSet.getString("sDsEmbalagem");
			final String sDsModelo = resultSet.getString("sDsModelo");
			final String sDsFabricante = resultSet.getString("sDsFabricante");
			proposta.setMarca(sDsMarca);
			proposta.setNumeroDoRegistro(sNrRegistro);
			proposta.setEmbalagem(sDsEmbalagem);
			proposta.setModelo(sDsModelo);
			proposta.setFabricante(sDsFabricante);

		}

		resultSet.close();
		this.itemProposta.setProposta(proposta);
    }

	@Override
    public PregaoEletronicoItemProposta listar() throws Exception {
        return this.itemProposta.getProposta();
    }
}
