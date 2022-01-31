package com.prueba.funciones;

import java.util.function.Consumer;

public class Impresora implements Consumer {

	@Override
	public void accept(Object t) {
		System.out.println(t);
	}
}
