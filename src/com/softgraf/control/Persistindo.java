package com.softgraf.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.softgraf.entity.Cliente;
import com.softgraf.entity.Endereco;
import com.softgraf.entity.Item;
import com.softgraf.entity.Pedido;
import com.softgraf.entity.Produto;

public class Persistindo {
	
	
	
	

	public static void main(String[] args) {
		
		Endereco ruaXV = new Endereco("Rua XV de Novembro, 123", "Ponta Grossa", "Parana" );
		
		
		Cliente joao = new Cliente("Joao da Silva", ruaXV);
		
		
		Pedido ped = new Pedido();
		ped.setCliente(joao);
		ped.setData(new Date());
		
		Produto bolacha = new Produto();
		bolacha.setNome("Bolacha Maria"); // 3 pacotes
		bolacha.setPreco(5.99f);
		
		Produto balas = new Produto();
		balas.setNome("Bala 7 Belo");
		balas.setPreco(7.50f);
		
		Item item1  = new Item();
		item1.setPedido(ped);
		item1.setProduto(bolacha);
		item1.setQuantidade(10); // 10 pacotes bolacha maria
		
		Item item2 = new Item();
		item2.setPedido(ped);
		item2.setProduto(balas);
		item2.setQuantidade(3); // 3 pacotes de bala	
		
		ped.addItem(item1);
		ped.addItem(item2);
		
		
		
		
		joao.addPedido(ped);
		
		
			
		
		
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("softgraf_pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		em.persist(joao);
		
		tx.commit();
		
		em.close();
		emf.close();
		
	}

}
