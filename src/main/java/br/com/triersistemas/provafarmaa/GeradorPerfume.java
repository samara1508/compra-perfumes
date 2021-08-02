package br.com.triersistemas.provafarmaa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class GeradorPerfume {
	
	public List<Perfume> gerar () {
		List<Perfume> perfumes = new ArrayList<>();
		SplittableRandom sr = new SplittableRandom();
		
		String[] nomePerfumes = {"Invictus", "Ferrari", "Entity Dulce Amor", 
				"Lady Million", "La vie est Belle", "Pure XS", "Oso Woman",
				"Boss Bottled Night", "Pino Silvestre", "Alien Perfume"
		};
		TipoPerfume[] tipos = {
			TipoPerfume.EAU_DE_PARFUM,
			TipoPerfume.EAU_DE_TOILETTE
		};
		
		for (int i = 0; i < 6; i++) {
			BigDecimal valor = gerarValorRandom(sr);
			String nome = nomePerfumes[sr.nextInt(0, nomePerfumes.length)];
			TipoPerfume tipo = tipos[sr.nextInt(0, tipos.length)];
			perfumes.add(new Perfume(nome, valor, tipo));
		}		
		return perfumes;
	}	
	
	private BigDecimal gerarValorRandom (SplittableRandom sr) {
		Long num = sr.nextLong(0, 10000);
		return BigDecimal.valueOf(num).divide(BigDecimal.valueOf(100));
	}
	
	/**
	 * private TipoPerfume gerarTipo () {
	 *		Long num = new SplittableRandom().nextLong(0, 1);
	 *		if (num == 0) {
	 *			return TipoPerfume.EAU_DE_PARFUM;
	 *		} else {
	 *			return TipoPerfume.EAU_DE_TOILETTE;
	 *		}
	 * }
	 *	//pode ser feito um método privado para cada exigência, basta chamar no o método criado dentro do loop
	 */
}
