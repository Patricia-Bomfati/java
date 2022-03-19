package animais;

public class Cachorro extends Mamifero {
	
	public void latir() {
		System.out.println("cachorro latindo...");
		
	}

	@Override
	public void locomover() {
		System.out.println("cao correndo");
	}
}
