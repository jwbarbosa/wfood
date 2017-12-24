package br.com.barbosa.wfood.web.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.barbosa.wfood.web.mapper.PromocaoMapper;
import br.com.barbosa.wfood.web.model.Promocao;

/**
 * classe controller promo��o
 * 
 * @author Jos� Wilian 23/12/2017
 * 
 */
@ManagedBean
@SessionScoped
public class PromocaoBean {

	private PromocaoMapper mapper = new PromocaoMapper();
	
	public List<Promocao> getPromocao(){
		return mapper.getPromocoes();
	}
	
}
