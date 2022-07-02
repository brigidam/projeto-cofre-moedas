package com.brigidamontenegro.projetocofremoedas.services;

import java.util.ArrayList;
import java.util.List;

import com.brigidamontenegro.projetocofremoedas.entities.Moeda;

public class Cofrinho {
	
	List<Moeda> listaMoedas = new ArrayList<>();
	

	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
}
