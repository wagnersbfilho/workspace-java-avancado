package br.com.wagner.java.threads;

public class ThreadExemplo {
	
	public static void main(String[] args) {
		
		GeradorPDF geraPDF = new GeradorPDF();
		BarraDeCarregamento barra = new BarraDeCarregamento(geraPDF);
		
		geraPDF.start();
		barra.start();
		
		BarraDeCarregamento2 barra2 = new BarraDeCarregamento2();
		BarraDeCarregamento2 barra2_2 = new BarraDeCarregamento2();
		Thread barra3 = new Thread(new BarraDeCarregamento3());
		
		barra2.start();
		barra2_2.start();
		barra3.start();
		
		barra2.run();
		barra3.run();
		
	}
}

class GeradorPDF extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Iniciado Gerar PDF");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finalizado Gerar PDF");
	}
}

// Estrategia 1
//class BarraDeCarregamento implements Runnable {

//Estrategia 2
class BarraDeCarregamento extends Thread {
	
	private Thread iniciarGeradorPDF;
	
	public BarraDeCarregamento(Thread iniciarGeradorPDF) {
		this.iniciarGeradorPDF = iniciarGeradorPDF;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);

				if (!iniciarGeradorPDF.isAlive()) {
					break;
				}
				
				System.out.println("Loading...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// Estrategia 2
// Consegue pegar nome da Thread exeutada
class BarraDeCarregamento2 extends Thread {
	
	@Override
	public void run() {
		super.run();
		System.out.println("Carregando 2... " + this.getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class BarraDeCarregamento3 extends Thread {
	
	@Override
	public void run() {
		super.run();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Carregando 3... " + this.getName());
	}
}