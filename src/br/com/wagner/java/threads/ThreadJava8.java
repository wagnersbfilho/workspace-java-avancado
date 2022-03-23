package br.com.wagner.java.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadJava8 {
	
	private static final ExecutorService threadPool = 
			Executors.newCachedThreadPool();
	
	public static void main(String[] args) {
		Casa casa = new Casa(new Quarto());
		casa.obterTarefasCasa()
			.forEach(atividade -> threadPool.execute(() -> atividade.realizar()));
		threadPool.shutdown();
	}
	
}

//@FunctionalInterface
interface Atividade {
	void realizar();
}

abstract class Comodo {
	abstract List<Atividade> obterTarefasComodo();
}

class Casa {
	private List<Comodo> comodos;
	
	public Casa(Comodo...comodos) {
		this.comodos = Arrays.asList(comodos);
	}
	
	public List<Atividade> obterTarefasCasa() {
		return this.comodos.stream()
				.map(Comodo::obterTarefasComodo)
				.reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
					pivo.addAll(atividades);
					return pivo;
				});
	}
	
}

class Quarto extends Comodo {

	@Override
	public List<Atividade> obterTarefasComodo() {
		
		/*
		 * Este trecho de código é o equivalente da referencia lambda "this::arrumarCama"
		 * 
		Atividade arrumarCama = new Atividade() {
			
			@Override
			public void realizar() {
				Quarto q = new Quarto();
				q.arrumarCama();
			}
		};
		
		List<Atividade> atividades = new ArrayList<Atividade>();
		atividades.add(arrumarCama);
		atividades.add(() -> arrumarCama());
		*/
		
		return Arrays.asList(
				this::arrumarCama,
				this::varrerQuarto,
				this::arrumarGuardaRupa);
	}

	private void arrumarGuardaRupa() {System.out.println("Arrumar guara roupa");}
	private void varrerQuarto() {System.out.println("Varrer Quarto");}
	private void arrumarCama() {System.out.println("Arrumar cama");}
	
}

