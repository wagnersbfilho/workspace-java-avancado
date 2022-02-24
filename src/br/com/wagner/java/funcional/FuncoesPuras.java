package br.com.wagner.java.funcional;

import java.util.function.BiPredicate;

public class FuncoesPuras {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> verificarMaior = 
				(parametro, valor) -> parametro > valor;
		
		System.out.println(verificarMaior.test(13, 12));
		System.out.println(verificarMaior.test(13, 12));
	}
}
