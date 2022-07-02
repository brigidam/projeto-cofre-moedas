package com.brigidamontenegro.projetocofremoedas.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.brigidamontenegro.projetocofremoedas.entities.Dolar;
import com.brigidamontenegro.projetocofremoedas.entities.Euro;
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
	
	public void listagemMoedas() {
		int dolar = 0;
		int euro = 0;
		int real = 0;
		for(Moeda moeda : listaMoedas) {
			if(moeda instanceof Dolar) {
				dolar += moeda.getValor();
			} else if(moeda instanceof Euro) {
				euro += moeda.getValor();
			} else {
				real += moeda.getValor();
			}
		}
		System.out.println("Listando todas as Moedas dentro do Cofrinho");
		System.out.print(dolar + " Dólares \n" + euro + " Euros \n" + real + " Reais \n");
	}
}
