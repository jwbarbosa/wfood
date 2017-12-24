package br.com.barbosa.wfood.web.mapper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import br.com.barbosa.wfood.web.model.Ingrediente;

/**
 * classe que irá representar a lista de ingredientes em memória
 * 
 * @author José Wilian 19/12/2017
 * 
 */
public class IngredienteMapper {

	private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	public IngredienteMapper() {
		
		try {
			ingredientes.add(new Ingrediente(1L, "Alface", new BigDecimal(0.40)
					.setScale(2, RoundingMode.HALF_UP)));
			ingredientes.add(new Ingrediente(2L, "Bacon", new BigDecimal(2)
					.setScale(2, RoundingMode.HALF_UP)));
			ingredientes.add(new Ingrediente(3L, "Hambúrger de carne",
					new BigDecimal(3).setScale(2, RoundingMode.HALF_UP)));
			ingredientes.add(new Ingrediente(4L, "Ovo", new BigDecimal(0.80)
					.setScale(2, RoundingMode.HALF_UP)));
			ingredientes.add(new Ingrediente(5L, "Queijo", new BigDecimal(1.50)
					.setScale(2, RoundingMode.HALF_UP)));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public Ingrediente buscar(long id) {
		Ingrediente ingrediente = null;

		try {
			for (Ingrediente it : ingredientes) {
				if (it.getId() == id) {
					ingrediente = it;

					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ingrediente;
	}

}
