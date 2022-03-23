package br.com.wagner.java.threads;

import java.util.stream.IntStream;

public class ParalellStreams {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		IntStream.range(1, 100000).forEach(num -> fatorial(num)); // serial stream
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execu��o: " + (fim-inicio));

		inicio = System.currentTimeMillis();
		IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num)); // paralell stream
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execu��o: " + (fim-inicio));
}
	
	public static long fatorial (long num) {
		int fat = 1;
		for (int i = 2; i <= num; i++) {
			fat*=i;
		}
		return fat;
	}
}
