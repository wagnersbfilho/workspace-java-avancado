package br.com.wagner.java.funcional.interfacefuncional;

import java.util.function.Function;

public class Funcoes {

	public static void main(String[] args) {
		
		Function<String, String> retornaNomeAoContrario = texto -> 
			new StringBuilder(texto).reverse().toString();
		Function<String, Integer> converterStringInteiro = texto ->
			Integer.valueOf(texto);
		Function<String, Integer> converterStringInteiroReferencia = 
			Integer::valueOf;
//			Integer::valueOf * 2; --> não  funciona metodo de referencia 

		Function<String, Integer> calcularDobro = texto ->
			converterStringInteiro.apply(texto) * 2;
		Function<String, Integer> calcularDobroComRetorno = texto -> {
			return converterStringInteiro.apply(texto) * 2;
		};
		
		System.out.println(retornaNomeAoContrario.apply("wagner"));
		System.out.println(converterStringInteiro.apply("10"));
		System.out.println(calcularDobro.apply("20"));
		System.out.println(calcularDobroComRetorno.apply("30"));
	}
}
