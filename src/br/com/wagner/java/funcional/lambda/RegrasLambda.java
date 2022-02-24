package br.com.wagner.java.funcional.lambda;

public class RegrasLambda {

	public static void main(String[] args) {
	
		// Sintaxe chamada funcao lambda
		Funcao gerarSaida = valor -> valor;
	}
}

/**
 * Interface funcional: possui apenas 1 m�todo
 *
 */
@FunctionalInterface
interface Funcao {
	String gerar (String valor);

	//	String gerar2 (String valor); -- n�o � poss�vel criar mais de um m�todo em iterface funcional 

	default String gerar2 (String valor) {return null;} // mas � poss�vel criar um m�todo default
}
