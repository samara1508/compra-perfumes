package br.com.triersistemas.provafarmaa;

import java.util.SplittableRandom;

public class Blocos {
	
	public Long[][] criarMatrizLong () {
		Long[][] matriz = new Long[16][16];
		SplittableRandom drSplittable = new SplittableRandom();
		
		for (Integer i = 0; i < matriz.length; i ++) {
			
			for (Integer j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = drSplittable.nextLong(0, 10);
			}
		}
		
		return matriz;
	}
	
	public char[][] criarMatrizChar () {
		char[][] matriz = new char[16][16];
		SplittableRandom drSplittable = new SplittableRandom();
		
		char[] letras = "QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
		
		for (Integer i = 0; i < matriz.length; i ++) {			
			for (Integer j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = letras[drSplittable.nextInt(0, letras.length)];
			}
		}	
		return matriz;
	}
}
