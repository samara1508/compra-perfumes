package br.com.triersistemas.provafarmaa;

public class App {

    public static void main(String[] args) {
    	
    	Blocos a = new Blocos();
    	
    	char[][] matriz = a.criarMatrizChar();
    	
    	for (int i = 0; i < matriz.length; i++) {
    		for (int j = 0; j < matriz[i].length; j++) {
    			System.out.println(matriz[i][j]);
    		}
		}
    }
}
