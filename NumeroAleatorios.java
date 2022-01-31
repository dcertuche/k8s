package com.prueba.funciones;

import java.util.function.Supplier;

public class NumeroAleatorios implements Supplier {

	@Override
	public Object get() {
		return (int) (Math.random() * (66 - 18)) + 18;
	}

}
