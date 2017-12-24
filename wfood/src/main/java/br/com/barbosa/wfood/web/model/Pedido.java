package br.com.barbosa.wfood.web.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * classe medolo pedido
 * 
 * @author José Wilian 21/12/2017
 * 
 */
public class Pedido {
	private long id;
	private BigDecimal valorTotal;
	private BigDecimal valorDesconto;
	private BigDecimal valorPagamento;
	private List<Lanche> lanches;

	public Pedido() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(BigDecimal valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public List<Lanche> getLanches() {
		return lanches;
	}

	public void setLanches(List<Lanche> lanches) {
		this.lanches = lanches;
	}

}
