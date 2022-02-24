package br.com.wagner.java.funcional.recursividade;

/**
 * Método Tail Call
 * 
 * Em vez de começar do 1 e ir até o 5, 
 * começa do 5 e vai até o 1.
 *
 * fatorialA(5,1)
 * fatorialA(4,5)
 * fatorialA(3,20)
 * fatorialA(2,60)
 * fatorialA(1,120)
 * fatorialA(0,120)
 * 120
 *
 */
public class FatorialTailCall {

	public static void main(String[] args) {
		System.out.println(fatorialA(5));
	}
	
	public static double fatorialA(double valor) {
		return fatorialTailCall(valor, 1);
	}
	
	public static double fatorialTailCall(double valor, double numero) {
		if (valor == 0) {
			return numero;
		}
		return fatorialTailCall(valor-1, numero*valor);
		
	}
	
}
