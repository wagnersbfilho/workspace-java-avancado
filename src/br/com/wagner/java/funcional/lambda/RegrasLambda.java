package br.com.wagner.java.funcional.lambda;

public class RegrasLambda {

	public static void main(String[] args) {
	
		// Sintaxe chamada funcao lambda
		Funcao gerarSaida = valor -> valor;
	}
}

/**
 * Interface funcional: possui apenas 1 método
 *
 */
@FunctionalInterface
interface Funcao {
	String gerar (String valor);

	//	String gerar2 (String valor); -- não é possível criar mais de um método em iterface funcional 

	default String gerar2 (String valor) {return null;} // mas é possível criar um método default
}
