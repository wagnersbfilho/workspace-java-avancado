package br.com.wagner.java.funcional;

import java.util.function.UnaryOperator;

public class Imutabilidade {

	public static void main(String[] args) {
		int valor = 20;
		UnaryOperator<Integer> retornarDobro = v -> v * 2;
		System.out.println(retornarDobro.apply(valor)); // retornar o dobro
		System.out.println(valor); // valor nao sera alterado

		/* 
		 * Erro: Para modificar uma vari�vel utilizada em fun��o lambda, ela precisa ser final
		 * (garante e imutabilidade)
		 * 
		UnaryOperator<Integer> retornarDobroTeste = v -> {
			valor = 30;
			return v* 2;
		};
		*/
	}
}
