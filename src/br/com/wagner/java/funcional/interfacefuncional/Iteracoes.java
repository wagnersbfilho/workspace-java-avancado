package br.com.wagner.java.funcional.interfacefuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

	public static void main(String[] args) {
		String[] nomes = {"Wagner", "Wagner", "Boaventura", "Santos", "Programador", "Java"};
		Integer[] numeros = {1,2,3,4,5};

		imprimirNomesFiltrados(nomes);
		imprimirNomesFiltradosFuncional(nomes);
		
		imprimirTodosNomes(nomes);
		imprimirTodosNomesStream(nomes);
		
		imprimirDobroCadaItem(numeros);
		imprimirDobroCadaItemStream(numeros);
		
		// Streams dentro de "Collections"
		List<String> listaProfissoes = new ArrayList<String>();
		listaProfissoes.add("Programador");
		listaProfissoes.add("Testador");
		listaProfissoes.add("Gerente");
		listaProfissoes.add("Analista");
		
		listaProfissoes.stream()
			.filter(profissao -> profissao.startsWith("P"))
			.forEach(System.out::println);;
	}
	
	// Imperativo
	public static void imprimirNomesFiltrados(String... nomes) {
		String nomesParaImprimir = "";
		for (String nome: nomes) {
			if (nome.equals("Wagner")) {
				nomesParaImprimir += " " + nome;
			}
		}
		
		System.out.println(nomesParaImprimir);
	}
	
	// Declarativo Funcional
	public static void imprimirNomesFiltradosFuncional(String... nomes) {
		String nomesParaImprimirStream = Stream.of(nomes)
			.filter(nome -> nome.equals("Wagner"))
			.collect(Collectors.joining());

		System.out.println(nomesParaImprimirStream);
	}
	
	public static void imprimirTodosNomes(String... nomes) {
		for(String nome: nomes) {
			System.out.println("FOR: " + nome);
		}
	}

	public static void imprimirTodosNomesStream(String... nomes) {
		Stream.of(nomes)
			.forEach(nome -> System.out.println("STREAM: " + nome));
	}
	
	public static void imprimirDobroCadaItem (Integer... numeros) {
		for (Integer num: numeros) {
			System.out.println(num*2);
		}
	}

	public static void imprimirDobroCadaItemStream (Integer... numeros) {
		Stream.of(numeros)
			.map(numero -> numero * 2)
			.forEach(System.out::println);;
	}

}
