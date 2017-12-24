package br.com.barbosa.wfood.web.bean;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.barbosa.wfood.web.mapper.IngredienteMapper;
import br.com.barbosa.wfood.web.model.Ingrediente;

/**
 * classe para controller
 * 
 * @author José Wilian 19/12/2017
 * 
 */
@ManagedBean
@SessionScoped
public class IngredienteBean {

	private Ingrediente ingrediente;
	private IngredienteMapper mapper = new IngredienteMapper();
	

	private String  inflacaoAtual;
	
	private BigDecimal fator;
	
	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public List<Ingrediente> getIngredientes() {
		return mapper.getIngredientes();
	}


	public String getInflacaoAtual() {
		return inflacaoAtual;
	}

	public void setInflacaoAtual(String inflacaoAtual) {
		this.inflacaoAtual = inflacaoAtual;
	}

	public void calcular(){
		
		BigDecimal perc = BigDecimal.ZERO;
		
		if(fator.compareTo(BigDecimal.ZERO)!=0){
			perc = fator.divide(new BigDecimal(100)).setScale(2,RoundingMode.HALF_UP);
		}
		
		for(Ingrediente ing : mapper.getIngredientes()){
			ing.setValor(ing.getValor().add((ing.getValor().multiply(perc))));
		}
		fator = BigDecimal.ZERO;

	}

	public BigDecimal getFator() {
		return fator;
	}

	public void setFator(BigDecimal fator) {
		this.fator = fator;
	}

	
	
}
