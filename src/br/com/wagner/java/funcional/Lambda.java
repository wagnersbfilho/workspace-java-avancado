package br.com.wagner.java.funcional;

import java.util.function.UnaryOperator;

public class Lambda {

	public static void main(String[] args) {
		UnaryOperator<Integer> calcularValorVezes3 = valor -> valor*3;
		Integer valor = 10;
		System.out.println("O resultado é: " + calcularValorVezes3.apply(valor));
	}
}
