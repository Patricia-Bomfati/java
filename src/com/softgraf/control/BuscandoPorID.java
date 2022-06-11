package com.softgraf.control;

import javax.persistence.EntityManager;

import com.softgraf.entity.Cliente;
import com.softgraf.util.JpaUtil;

public class BuscandoPorID {

	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.getEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1);
		
		if(cliente != null) {
			System.out.println(cliente.getNome());

	}else
			System.out.println("Id nao encontrado");
		
		
		
		
		
		
		
		
		
		em.close();
		JpaUtil.close();

	}

}
