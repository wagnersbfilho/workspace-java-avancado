package br.com.wagner.java.funcional.interfacefuncional;

import java.util.function.Supplier;

public class Suprimidores {

	public static void main(String[] args) {
		Supplier<Pessoa> instancia = () -> new Pessoa();
		Supplier<Pessoa> instanciaReferencia = Pessoa::new;

		System.out.println(instancia.get());
		System.out.println(instanciaReferencia.get());
	}
}

class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		nome = "Wagner";
		idade = 41;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
}
	
