package enumeracao;

public class Teste {

	public static void main(String[] args) {
		Semana dia = Semana.SEGUNDA;
	//System.out.println(dia.compareTo(Semana.DOMINGO)); para comparacao se for igual valor da 0
		
		for(Semana s : Semana.values()) {
			System.out.println(s);
			
		}
	

	}

}
