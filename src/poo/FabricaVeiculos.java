package poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FabricaVeiculos {
	
		

		private List<Veiculo> lista = new ArrayList();
		private static FabricaVeiculos instancia = null;
		
		
		private  FabricaVeiculos() {
			System.out.println("chamando construtor");
		}
		
		public static FabricaVeiculos getInstancia() {
			if (instancia == null)
				instancia = new FabricaVeiculos();
			return instancia;
			
		}
		
		public void adicionar (Veiculo v) {
			lista.add(v);
		}

		public boolean remover (int indice) {
			return lista.remove (indice) !=null;
			
		}
  
		//public Object[] listar(){
			//return lista.toArray();
		
		public List<Veiculo>listar(){
			return Collections.unmodifiableList(lista);
			
		}
}
