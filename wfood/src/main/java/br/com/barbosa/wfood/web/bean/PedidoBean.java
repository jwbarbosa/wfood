package br.com.barbosa.wfood.web.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.barbosa.wfood.web.mapper.PedidoMapper;
import br.com.barbosa.wfood.web.model.Ingrediente;
import br.com.barbosa.wfood.web.model.Lanche;
import br.com.barbosa.wfood.web.model.Pedido;

/**
 * classe de controller pedido
 * 
 * @author José Wilian 21/12/2017
 * 
 */
@ManagedBean
@SessionScoped
public class PedidoBean {

	private PedidoMapper mapper = new PedidoMapper();

	private Lanche lancheAtual;
	private Lanche lancheAtualPedido;
	
	public Date dataAtual;
	 
	public Pedido getPedido() {
		mapper.CalcularTotal();
		return mapper.getPedido();
	}

	public void addLanchePedido() {
		
		Lanche l = lancheAtual.clone();
		l.setId(mapper.getPedido().getLanches().size()+1);
		
		mapper.getPedido().getLanches().add(l.clone());
		mapper.CalcularTotal();
		getPedido();
	}

	public void removerLanchePedido() {
		
		mapper.getPedido().getLanches().remove(lancheAtualPedido);
		getPedido();
	}

	public void removerIngredientePedido(Ingrediente ing){
		lancheAtualPedido.getIngredientes().remove(ing);
		getPedido();
	}
	
	public void addIngLanche(Ingrediente ing) {
		lancheAtualPedido.getIngredientes().add(ing);
		mapper.CalcularTotal();
		getPedido();
	}

	public Lanche getLancheAtual() {
		return lancheAtual;
	}

	public void setLancheAtual(Lanche lancheAtual) {
		this.lancheAtual = lancheAtual;
	}

	public Lanche getLancheAtualPedido() {
		return lancheAtualPedido;
	}

	public void setLancheAtualPedido(Lanche lancheAtualPedido) {
		this.lancheAtualPedido = lancheAtualPedido;
	}

	public Date getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}

	
}
