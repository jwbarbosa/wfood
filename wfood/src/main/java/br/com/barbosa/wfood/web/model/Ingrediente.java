package br.com.barbosa.wfood.web.model;

import java.math.BigDecimal;

/**
 * classe modelo Ingrediente
 * 
 * @author José Wilian 19/12/2017
 * 
 */
public class Ingrediente {

	private long id;
	private String nome;
	private BigDecimal valor;

	public Ingrediente() {

	}
	
	

	public Ingrediente(long id, String nome, BigDecimal valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
