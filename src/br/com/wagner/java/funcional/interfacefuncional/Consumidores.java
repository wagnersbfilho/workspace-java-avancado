package br.com.wagner.java.funcional.interfacefuncional;

import java.util.function.Consumer;

public class Consumidores {

	public static void main(String[] args) {

		Consumer<String> imprimirFraseLambda = frase -> System.out.println(frase);
		imprimirFraseLambda.accept("Hello Lambda!");
		
		Consumer<String> imprimirFrase = System.out::println;
		imprimirFrase.accept("Hello Método de Referencia!");

	}
	
	
	
}
