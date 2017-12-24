package br.com.barbosa.wfood.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Classe modelo Lanche
 * 
 * @author José Wilian 19/12/2017
 * 
 */
public class Lanche implements Cloneable {

	private long id;
	private String nome;
	private String descricao;
	private ArrayList<Ingrediente> ingredientes;
	private BigDecimal valor;
	private BigDecimal desconto;

	public Lanche() {
		super();
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public Lanche clone() {
		Lanche clone = null;
		try {
			clone = (Lanche) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone;
	}

	
}
