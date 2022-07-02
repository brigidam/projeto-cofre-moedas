package com.brigidamontenegro.projetocofremoedas.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.brigidamontenegro.projetocofremoedas.entities.Moeda;

public class Cofrinho {

	List<Moeda> listaMoedas = new ArrayList<>();

	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}

	public void remover(Moeda moeda) {
		Iterator<Moeda> it = listaMoedas.iterator();
		while (it.hasNext()) {
			Moeda m = it.next();
			if (m.getClass() == moeda.getClass()) {
				if (m.getValor() == moeda.getValor()) {
					it.remove();
				}
			}
		}
	}
}
