package br.com.barbosa.wfood.web.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.barbosa.wfood.web.model.Promocao;

/**
 * classe que representa as promo��es em memoria
 * 
 * @author Jos� Wilian 23/12/2017
 * 
 */
public class PromocaoMapper {

	private List<Promocao> promocoes = new ArrayList<Promocao>();

	public PromocaoMapper() {
		try {

			promocoes.add(new Promocao("Light", "Se o lanche tem alface e n�o tem bacon, ganha 10% de desconto."));
			promocoes.add(new Promocao("Muita carne", "A cada 3 por��es de carne o cliente s� paga 2. Se o lanche tiver 6 por��es, o cliente pagar� 4. Assim por diante..."));
			promocoes.add(new Promocao("Muito queijo", "A cada 3 por��es de queijo o cliente s� paga 2. Se o lanche tiver 6 por��es, o cliente pagar� 4. Assim por diante..."));
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Promocao> getPromocoes() {
		return promocoes;
	}

}
