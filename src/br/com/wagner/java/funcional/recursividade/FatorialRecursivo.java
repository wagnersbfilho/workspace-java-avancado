package br.com.wagner.java.funcional.recursividade;

/**
 * Recursividade.
 * 
 * PROBLEMA: empilhamento:
 * 
 * (fatorial(5))
 * (5 * (fatorial(4)))
 * (5 * (4 * (fatorial(3))))
 * (5 * (4 * (3 * (fatorial(2)))))
 * (5 * (4 * (3 * (2 * (fatorial(1))))))
 * (5 * (4 * (3 * (2 * (1 * (fatorial(0)))))))
 * (5 * (4 * (3 * (2 * (1 * 1)))))
 * (5 * (4 * (3 * (2 * (1)))))
 * (5 * (4 * (3 * (2))))
 * (5 * (4 * (6)))
 * (5 * (24))
 * (120)
 *
 */
public class FatorialRecursivo {

	public static void main(String[] args) {
		System.out.println(fatorial(5));
	}
	
	public static int fatorial(int valor) {
		if (valor == 1)
			return valor;
		else
			return valor * fatorial(valor-1);
	}
}
