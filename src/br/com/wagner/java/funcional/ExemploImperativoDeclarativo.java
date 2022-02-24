package br.com.wagner.java.funcional;

import java.util.function.Function;

public class ExemploImperativoDeclarativo {

	public static void main(String[] args) {
		// Buscando usuarioa de ID = 15
		System.out.println(buscarUsuario(15));

		/* 
		 * Exemplo implementação declarativa
		 */
		Function<Integer, Object> buscarUsuario2 = idUsuario ->
			// buscar usuario
			new Object();
			System.out.println(buscarUsuario2.apply(15));
		}

	/**
	 * Exemplo de implementação imperativa
	 * 
	 * @param idUsuario
	 * @return
	 */
	public static Object buscarUsuario(int idUsuario) {
		// retorna um usuario do banco de dados
		return new Object();
	}
}
