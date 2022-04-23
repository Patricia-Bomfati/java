package exemplo_interface;

public class TvSamsung extends Tv implements ControleRemoto {
	
	public TvSamsung() {
		super(50);
		
	}

	@Override
	public void mudarCanal(int canal) {
		System.out.println("mudando para o canal" + canal);
		
	}

	@Override 
	public void aumentarVolume(int taxa) {
		System.out.println("aumentando Volume" + taxa + "%");
	}

	@Override
	public void diminuirVolume(int taxa) {
		System.out.println("diminuindo vomume" + taxa + "%");
		
	}

	@Override
	public boolean ligar() {
		System.out.println("ligando tv");
		return false;
	}

	@Override
	public boolean desligar() {
		System.out.println("desligando tv");
		return false;
	}

}
