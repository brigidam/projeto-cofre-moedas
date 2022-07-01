package com.brigidamontenegro.projetocofremoedas.entities;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public double converter() {
		return getValor() * 5.33;
	}

}
