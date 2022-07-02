package com.brigidamontenegro.projetocofremoedas.entities;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public double converter() {
		return getValor() * 5.56;
	}
}
