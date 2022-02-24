package br.com.wagner.java.funcional;

import java.util.Arrays;

public class ComposicaoFuncao {

	public static void main(String[] args) {
		Integer[] valores = {1,2,3,4};
		
		/*
		 * Paradigma Funcional
		 * */
		Arrays.stream(valores)
			.filter(numero -> numero % 2 ==0)
			.map(numero -> numero *2)
			.forEach(numero -> System.out.println(numero));
	
		/*
		 * Paradigma Imperativo
		 * 
		for (int i = 0; i < valores.length; i++) {
			int valor = 0;
			if (valores[i] % 2 == 0) {
				valor = valores[i] * 2;
				
				if (valor != 0) {
					System.out.println(valor);
				}
			}
		}
		*/
	}
	
	
	/*
	 * Exemplo de como seria a composição de funções
	 
	  
	public void calcular(somar(x, y)) {
		
	}
	
	public Integer somar(Integer x, Integer y) {
		return x + y;
	}
	*/
}
