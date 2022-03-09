package br.com.wagner.java.funcional.interfacefuncional;

import java.util.function.Predicate;

public class Predicados {

	public static void main(String[] args) {
		Predicate<String> estaVazio = valor -> valor.isEmpty();
		Predicate<String> estaVazioReferencia = String::isEmpty;
		
		System.out.println(estaVazio.test(""));
		System.out.println(estaVazioReferencia.test("Vazio"));
	}
}
