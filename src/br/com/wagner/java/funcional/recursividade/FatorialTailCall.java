package br.com.wagner.java.funcional.recursividade;

/**
 * M�todo Tail Call
 * 
 * Em vez de come�ar do 1 e ir at� o 5, 
 * come�a do 5 e vai at� o 1.
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
