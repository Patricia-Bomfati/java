package com.softgraf.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Pedido {

	// numero - inteiro
	private int numero;
	private Date data;
	private Cliente cliente;
	private List<Item> lista = new ArrayList<>();
	
	// permite add um unico item na lista
	public boolean addItem(Item item) {
		return lista.add(item);
		
	// remove item da lista
	}
		
	public boolean removeItem (Item item) {
		return lista.remove(item);
		
	}
	
	public boolean removeItem(int posicao) {
		return lista.remove(posicao) !=null;
	}

	
	public List<Item> listaItem(){
		return Collections.unmodifiableList(lista);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	}


