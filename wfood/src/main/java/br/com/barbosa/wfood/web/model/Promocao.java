package br.com.barbosa.wfood.web.model;

/**
 * classe modelo promoção
 * 
 * @author José Wilian 23/12/2017
 * 
 */
public class Promocao {
	private String nome;
	private String descricao;

	public Promocao() {
		super();
	}

	
	
	public Promocao(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
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

}
