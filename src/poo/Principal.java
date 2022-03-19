package poo;

import java.util.ArrayList;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		Motor motor70cv = new Motor(70);
		Motor motor200cv = new Motor(200);
		
		//polimorfimo comportamento do objeto 
		Automovel gol = new Gol(motor70cv);
		Automovel palio = new Palio(motor70cv);
		Automovel bmw = new Bmw(motor200cv);
		
		
		FabricaVeiculos fabrica = FabricaVeiculos.getInstancia();
		
		
		fabrica.adicionar(gol);
		fabrica.adicionar(palio);
		fabrica.adicionar(bmw);
	
		
	
	
		
		
		
		for (Object v : fabrica.listar()) {
			System.out.println(v);
			
		}
		// casting - classe pra mudar comportamento
		((Palio)palio).gelar();

	}

}
