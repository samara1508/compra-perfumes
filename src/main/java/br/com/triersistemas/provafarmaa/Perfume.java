package br.com.triersistemas.provafarmaa;

import java.math.BigDecimal;
import java.util.SplittableRandom;

public class Perfume {
	
	private Long id;
	private String nome;
	private BigDecimal valor;
	private TipoPerfume tipo;
	
	public Perfume (String nome, BigDecimal valor, TipoPerfume tipo) {
		this.id = new SplittableRandom().nextLong(10, 100);
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public Long getId () {
		return id;
	}
	
	public String getNome () {
		return nome;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public TipoPerfume getTipo() {
		return tipo;
	}
	
}
