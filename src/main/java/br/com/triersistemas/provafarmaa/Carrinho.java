package br.com.triersistemas.provafarmaa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Carrinho {
	private Long id;
	private List<ItemCarrinho> itens;
	private EnumStatusCarrinho status;
	
	public Carrinho () {
		this.itens = new ArrayList<ItemCarrinho>();
		this.id = new SplittableRandom().nextLong(100, 1000);
		this.status = EnumStatusCarrinho.ABERTO;
	}
	
	public void addPerfume(Perfume perfume, Integer qtd) {
		if (EnumStatusCarrinho.FINALIZADO.equals(this.status)) {
			throw new RuntimeException("Carrinho Finalizado");
		}
		this.itens.add(new ItemCarrinho(perfume, qtd));
	}
	
	public void finalizar () {
		this.status = EnumStatusCarrinho.FINALIZADO;
	}

	public Long getId() {
		return id;
	}
	
	public BigDecimal getValorTotal () {
		BigDecimal soma = BigDecimal.ZERO;
		for (ItemCarrinho i : itens) {
			soma = soma.add(i.getValorTotal());
		}
		return soma;
	}
	

	
}
