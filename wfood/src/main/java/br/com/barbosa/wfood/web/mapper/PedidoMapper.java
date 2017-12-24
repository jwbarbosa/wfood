package br.com.barbosa.wfood.web.mapper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import br.com.barbosa.wfood.web.model.Ingrediente;
import br.com.barbosa.wfood.web.model.Lanche;
import br.com.barbosa.wfood.web.model.Pedido;

/**
 * classe que representa o pedido
 * 
 * @author José Wilian 19/12/2016
 * 
 */
public class PedidoMapper {

	private Pedido pedido = new Pedido();

	CardapioMapper cardapioMapper = new CardapioMapper();

	public PedidoMapper() {

		try {
			List<Lanche> lanches = new ArrayList<Lanche>();
			pedido.setLanches(lanches);
			CalcularTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void CalcularTotal() {

		try {

			BigDecimal total = BigDecimal.ZERO;
			BigDecimal totalDesc = BigDecimal.ZERO;
			for (Lanche lanche : pedido.getLanches()) {
				calcularValorLanche(lanche);
				total = total.add(lanche.getValor());
				totalDesc =totalDesc.add(lanche.getDesconto());
			}
			pedido.setValorTotal(total);
			pedido.setValorDesconto(totalDesc);
			pedido.setValorPagamento(total.subtract(totalDesc).setScale(2, RoundingMode.HALF_UP));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void calcularValorLanche(Lanche lanche) {

		BigDecimal valor = BigDecimal.ZERO;
		BigDecimal desconto = BigDecimal.ZERO;

		Long contAlface = 0L;
		Long contBacon = 0L;
		Long contHamburger = 0L;
		Long contQueijo = 0L;

		if (lanche != null) {
			try {
				for (Ingrediente ing : lanche.getIngredientes()) {
					valor = valor.add(ing.getValor());
					if (ing.getId() == 1) {
						contAlface++;
					} else if (ing.getId() == 2) {
						contBacon++;
					} else if (ing.getId() == 3) {
						contHamburger++;
					} else if (ing.getId() == 5) {
						contQueijo++;
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		if(contAlface>0 && contBacon ==0){
			desconto = valor.multiply(new BigDecimal(0.1));//10% do valor de desconto
		}
		
		IngredienteMapper mapperIngredriente = new IngredienteMapper();
		Ingrediente hamburger =  mapperIngredriente.buscar(3);
		
		while(contHamburger>=3){
			desconto = desconto.add(hamburger.getValor());
			contHamburger = contHamburger -3;
		}
		
		Ingrediente queijo =  mapperIngredriente.buscar(5);
		while(contQueijo>=3){
			desconto = desconto.add(queijo.getValor());
			contQueijo = contQueijo -3;
		}
		
		lanche.setDesconto(desconto);
		lanche.setValor(valor);
	}

}
