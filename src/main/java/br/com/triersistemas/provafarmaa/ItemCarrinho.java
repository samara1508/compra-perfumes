package br.com.triersistemas.provafarmaa;

import java.math.BigDecimal;
import java.util.SplittableRandom;

	public class ItemCarrinho {
	private Long id;
	private Perfume perfume;
	private Integer qtd;
	private BigDecimal valorTotal;
		
	public ItemCarrinho (Perfume perfume, Integer qtd) {
		this.perfume = perfume;
		this.qtd = qtd;
		this.id = new SplittableRandom().nextLong(100, 1000);
		this.valorTotal = perfume.getValor().multiply(valorTotal);
	}

	public Long getId() {
		return id;
	}

	public Perfume getPerfume() {
		return perfume;
	}

	public Integer getQtd() {
		return qtd;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	
	
}
