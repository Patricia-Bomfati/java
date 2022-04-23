package excessoes;

public class ExemploDeExcessao {

	public static void main(String[] args) {
		
		try {
		int valor = Converter.paraInteiro("123e");
		System.out.println(valor + 1);
		
		}catch (MinhaExcessao e) {
			//e.printStackTrace();
			System.out.println("erro entrada:" + e.getMessage());
			
		} finally{
			System.out.println("excecuta com ou sem excessao");
			
		}
		
			System.out.println("fim do programa");
	}

}
