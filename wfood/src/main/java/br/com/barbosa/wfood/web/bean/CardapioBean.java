package br.com.barbosa.wfood.web.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.barbosa.wfood.web.mapper.CardapioMapper;
import br.com.barbosa.wfood.web.model.Lanche;

/**
 * classe pra controle de cardápio
 * 
 * @author José Wilian 19/12/2017
 * 
 */
@ManagedBean
@SessionScoped
public class CardapioBean {

	private Lanche lanche;
	private CardapioMapper mapper = new CardapioMapper();
	
	private Lanche lancheAtual;

	public Lanche getCardapio() {
		return lanche;
	}

	public List<Lanche> getLanches() {
		return mapper.getLanches();
	}

	public Lanche getLancheAtual() {
		return lancheAtual;
	}

	public void setLancheAtual(Lanche lancheAtual) {
		this.lancheAtual = lancheAtual;
	}
	
}
