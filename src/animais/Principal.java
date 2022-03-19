package animais;

public class Principal {

	public static void main(String[] args) {
		
		// cria um objeto animal
		Animal animal = new Animal ();
		animal.nome = "Toto";
		animal.especie = "Mamifero";
		
		//a partir do objeto acesso os metodos
		animal.dormir();
		animal.comer();
		animal.locomover();
		
		// cria um objeto do tipo mamifero
		
		Mamifero mamifero = new Mamifero();
		mamifero.comer();
		mamifero.dormir();
		mamifero.locomover();
		mamifero.mamar();
		
		// cria um objeto do tipo reptil
		
		Reptil reptil = new Reptil();
		reptil.rastejar();
		reptil.dormir();
		
		Ave ave = new Ave();
		ave.voar();
		ave.dormir();
		
		
		Cachorro cachorro = new Cachorro();
		cachorro.latir();
		cachorro.locomover();
		
		Gato gato = new Gato();
		gato.miar();
		gato.locomover();
		
		
		
				
		
		
	}

}
