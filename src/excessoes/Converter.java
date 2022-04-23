package excessoes;

public class Converter {
	
	public static int paraInteiro(String valor) throws MinhaExcessao {
		
		//return Integer.parseInt(valor);
		
		try {
			int v = Integer.parseInt(valor);
			return v;
			
		}catch (NumberFormatException e) {
			
			MinhaExcessao excessao = new MinhaExcessao("Erro de conversao de valor");
			throw excessao;
			
		}
	}
	

}
