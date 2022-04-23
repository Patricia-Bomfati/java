package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeituraGravacao {
	
	
	
	//metodo estatico e aquele que posso acessar sem criar objeto
	public static void gravar(String arquivo) {
		
		
		// objeto para gravacao de texto
		
		
		try {
			FileWriter gravador = new FileWriter(arquivo);
			gravador.write("primeira linha");
			gravador.write("\nbatatinha quando nasce");
			gravador.write("\nbatatinha 1 ,2 ,3");
			gravador.write("\nultima linha");
			
			//fecha o arquivo
			gravador.close();
			System.out.println("arquivo gravado com sucesso");
			
		} catch (IOException e) {
			System.out.println("erro durante gravacao do arquivo:\n" + arquivo);
			e.printStackTrace();
		}
		
	
	}

	static public void ler(String arquivo) {
		try {
			FileReader leitor = new FileReader(arquivo);
			BufferedReader buffer = new BufferedReader(leitor);
		String linha;
		while ((linha = buffer.readLine())!=null) {
			System.out.println(linha);
		}
		buffer.close();
		leitor.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado para leitura do arquivo:\n" + arquivo);
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("erro durante leitura do arquivo:\n" + arquivo);
			e.printStackTrace();
		}
		
	}
}
