package br.com.wagner.java.funcional.recursividade;

import java.util.HashMap;
import java.util.Map;

/**
 * Também consome muita memória por utilizar variável estática
 *
 */
public class FatorialMemoization {

	static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		long I = System.nanoTime();
		System.out.println(fatorial(5));
		long F = System.nanoTime();
		System.out.println("FATORIAL 1: " + (F - I));

		I = System.nanoTime();
		System.out.println(fatorial(5));
		F = System.nanoTime();
		System.out.println("FATORIAL 2: " + (F - I));
	}
	
	public static Integer fatorial(Integer valor) {
		if (valor == 1) {
			return valor;
		} else {
			if (MAPA_FATORIAL.containsKey(valor)) {
				return MAPA_FATORIAL.get(valor);
			} else {
				Integer resultado = valor * fatorial(valor-1);
				MAPA_FATORIAL.put(valor, resultado);
				return resultado;			}
		}
	}
}
