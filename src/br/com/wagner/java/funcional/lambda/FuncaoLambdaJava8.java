package br.com.wagner.java.funcional.lambda;

/**
 * Antes do java 8, para implementar uma interface, era preciso
 * utlizar uma classe anônima, ou então criar um segundo arquivo
 * para implementar a interface e criar seu comportamento.
 *
 */
public class FuncaoLambdaJava8 {

	public static void main(String[] args) {
		Funcao2 funcao = valor ->  System.out.println(valor);
		funcao.gerar("Wagner");
		
		// Precisa usar chaves para mais de 1 instrução
		Funcao2 funcao2 = valor -> {
			System.out.println(valor);
			System.out.println(valor);
		};
		funcao2.gerar("Wagner");
		
		// Exemplo de interface funcional com metodo que possui retorno
		Funcao3 funcao3 = valor -> {
			return valor;
		};
		System.out.println(funcao3.gerar("Wagner"));

		/*
		 * Erro pois o metodo gerar é void
		 * 
		Funcao2 funcao = valor -> valor;
		System.out.println(funcao.gerar("Wagner"));
		 *
		 */
		
	}
}

interface Funcao2 {
	void gerar(String valor);
}

interface Funcao3 {
	String gerar(String valor);
}
