package com.prueba.funciones;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		new Principal();

	}

	public Principal() {
		Beta b = new Beta();
		System.out.println("x = "+ b.GetThis(0, 2));
		
		
		
		List<Integer> numeros = Funciones.crearLista(new NumeroAleatorios());
		List<Integer> multiplos = Funciones.filtrar(numeros, new MultiplosImpl());
		System.out.println("Numeros: " + numeros);
		System.out.println("Multiplos: " + multiplos);
		System.out.println("se añade nueva linea de desarollo: " + multiplos);

		Predicate<Integer> mayor_que = x -> (x > 10);

		// llamamos el método
		System.out.println(mayor_que.test(9));
	}

	public List<Integer> crearLista() {
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 13; i++) {

			lista.add((int) (Math.random() * (66 - 18)) + 18);

		}
		return lista;
	}

}
