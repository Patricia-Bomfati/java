package poo;

public class Bmw extends Automovel implements Radio, Gps, ArCondicionado {
	
	public Bmw(Motor motor) {
		super (motor);
	}

	@Override
	public void gelar() {
		System.out.println("Ar gelando");
		
	}

	@Override
	public void tocarmusica() {
		System.out.println("aeee oooo");
	
		
	}

	@Override
	public void seguir(Endereco endereco) {
		System.out.println("vire a esquerda");
		System.out.println("rode 1km");
		System.out.println("voce chegou ao seu destino");
		
	}

}
 