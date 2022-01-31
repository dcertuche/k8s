package com.prueba.funciones;

import java.util.function.Predicate;

public class MultiplosImpl implements Predicate {

	@Override
	public boolean test(Object t) {
		return (int)t%2==0;
	}

}
