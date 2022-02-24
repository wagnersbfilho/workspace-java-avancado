package br.com.wagner.java.funcional.lambda;

/**
 * Antes do java 8, para implementar uma interface, era preciso
 * utlizar uma classe anônima, ou então criar um segundo arquivo
 * para implementar a interface e criar seu comportamento.
 *
 */
public class FuncaoAnonimaAntesJava8 {

	public static void main(String[] args) {
		FuncaoPrefixo colocarPrefixoSenhor = new FuncaoPrefixo() {
			
			@Override
			public String gerar(String valor) {
				return "Sr. " + valor;
			}
		};
		System.out.println(colocarPrefixoSenhor.gerar("Wagner"));
	}
}

@FunctionalInterface // opcional
interface FuncaoPrefixo {
	String gerar(String valor);
}