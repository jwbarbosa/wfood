package br.com.barbosa.wfood.web.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.barbosa.wfood.web.model.Promocao;

/**
 * classe que representa as promoções em memoria
 * 
 * @author José Wilian 23/12/2017
 * 
 */
public class PromocaoMapper {

	private List<Promocao> promocoes = new ArrayList<Promocao>();

	public PromocaoMapper() {
		try {

			promocoes.add(new Promocao("Light", "Se o lanche tem alface e não tem bacon, ganha 10% de desconto."));
			promocoes.add(new Promocao("Muita carne", "A cada 3 porções de carne o cliente só paga 2. Se o lanche tiver 6 porções, o cliente pagará 4. Assim por diante..."));
			promocoes.add(new Promocao("Muito queijo", "A cada 3 porções de queijo o cliente só paga 2. Se o lanche tiver 6 porções, o cliente pagará 4. Assim por diante..."));
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Promocao> getPromocoes() {
		return promocoes;
	}

}
