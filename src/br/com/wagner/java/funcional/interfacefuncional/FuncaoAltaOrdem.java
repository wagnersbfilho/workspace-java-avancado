package br.com.wagner.java.funcional.interfacefuncional;

public class FuncaoAltaOrdem {

	public static void main(String[] args) {
		Calculo soma = (a, b) -> a+b;
		Calculo sub = (a, b) -> a-b;
		Calculo mult = (a, b) -> a*b;
		Calculo div = (a, b) -> a/b;
		
		System.out.println(executarOperacao(soma,  1, 3));
		System.out.println(executarOperacao(sub,  3, 1));
		System.out.println(executarOperacao(mult,  3, 2));
		System.out.println(executarOperacao(div,  10, 2));
	}
	
	// paradigma funcional
	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
	
	// paradigma imperativo
	public int soma (int a, int b) {
		return a + b;
	}
}

@FunctionalInterface
interface Calculo {
	public int calcular(int a, int b);
}
