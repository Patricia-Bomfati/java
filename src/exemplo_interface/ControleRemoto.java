package exemplo_interface;

// interface e quando uma classe 100% abstrata
// ou seja todos os objetos sao implicitamente abstrata
// voce pode interpretar uma interface como sendo um contrato

public interface ControleRemoto {
	
	// implicitamente publico e abstrato
	void mudarCanal(int canal);
	
	void aumentarVolume(int taxa);
	
	void diminuirVolume(int taxa);
	
	boolean ligar();
	
	boolean desligar();
		
	

}
