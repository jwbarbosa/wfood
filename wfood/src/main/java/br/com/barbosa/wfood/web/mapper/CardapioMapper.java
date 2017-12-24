package br.com.barbosa.wfood.web.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.barbosa.wfood.web.model.Ingrediente;
import br.com.barbosa.wfood.web.model.Lanche;

/**
 * classe que representa os lanches na memoria
 * 
 * @author José Wilian 19/12/2017
 * 
 */
public class CardapioMapper {

	private List<Lanche> lanches = new ArrayList<Lanche>();

	IngredienteMapper mapperIngrediente = new IngredienteMapper();

	public CardapioMapper() {

		try {

			Lanche l1 = new Lanche();
			l1.setId(1L);
			l1.setNome("X-Bacon");
			l1.setDescricao("");
			l1.setValor(BigDecimal.ZERO);
			ArrayList<Ingrediente> ingredientesLanche1 = new ArrayList<Ingrediente>();
			ingredientesLanche1.add(mapperIngrediente.buscar(2));
			ingredientesLanche1.add(mapperIngrediente.buscar(3));
			ingredientesLanche1.add(mapperIngrediente.buscar(5));
			l1.setIngredientes(ingredientesLanche1);
			adicionarLancheLista(l1);

			Lanche l2 = new Lanche();
			l2.setId(2L);
			l2.setNome("X-Burger");
			l2.setDescricao("");
			l2.setValor(BigDecimal.ZERO);
			ArrayList<Ingrediente> ingredientesLanche2 = new ArrayList<Ingrediente>();
			ingredientesLanche2.add(mapperIngrediente.buscar(3));
			ingredientesLanche2.add(mapperIngrediente.buscar(5));
			l2.setIngredientes(ingredientesLanche2);
			adicionarLancheLista(l2);

			Lanche l3 = new Lanche();
			l3.setId(3L);
			l3.setNome("X-Egg");
			l3.setDescricao("");
			l3.setValor(BigDecimal.ZERO);
			ArrayList<Ingrediente> ingredientesLanche3 = new ArrayList<Ingrediente>();
			ingredientesLanche3.add(mapperIngrediente.buscar(4));
			ingredientesLanche3.add(mapperIngrediente.buscar(3));
			ingredientesLanche3.add(mapperIngrediente.buscar(5));
			l3.setIngredientes(ingredientesLanche3);
			adicionarLancheLista(l3);

			Lanche l4 = new Lanche();
			l4.setId(4L);
			l4.setDescricao("");
			l4.setValor(BigDecimal.ZERO);
			l4.setNome("X-Egg Bacon");
			ArrayList<Ingrediente> ingredientesLanche4 = new ArrayList<Ingrediente>();
			ingredientesLanche4.add(mapperIngrediente.buscar(2));
			ingredientesLanche4.add(mapperIngrediente.buscar(3));
			ingredientesLanche4.add(mapperIngrediente.buscar(4));
			ingredientesLanche4.add(mapperIngrediente.buscar(5));
			l4.setIngredientes(ingredientesLanche4);
			adicionarLancheLista(l4);

			Lanche l5 = new Lanche();
			l5.setId(5L);
			l5.setDescricao("Selecione nossas opções de Ingredientes");
			l5.setValor(BigDecimal.ZERO);
			l5.setNome("Personalizado");
			ArrayList<Ingrediente> ingredientesLanche5 = new ArrayList<Ingrediente>();
			l5.setIngredientes(ingredientesLanche5);
			adicionarLancheLista(l5);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Lanche> getLanches() {
		return lanches;
	}

	public void adicionarLancheLista(Lanche lanche) {

		try {

			for (Ingrediente ing : lanche.getIngredientes()) {
				if ("".equals(lanche.getDescricao())) {
					lanche.setDescricao(ing.getNome());
				} else {
					lanche.setDescricao(lanche.getDescricao() + ", "
							+ ing.getNome());
				}
				lanche.setValor(lanche.getValor().add(ing.getValor()));
			}

			lanches.add(lanche);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public Lanche buscarLanche(long id) {
		Lanche lanche = null;
		try {
			for (Lanche it : lanches) {
				if (it.getId() == id) {
					lanche = it;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lanche;
	}
	
}
