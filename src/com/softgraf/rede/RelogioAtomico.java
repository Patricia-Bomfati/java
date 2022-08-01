package com.softgraf.rede;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RelogioAtomico {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("Conectando...");
		Socket cliente = new Socket("time-A.timefreq.bldrdoc.gov", 13);
		
		Scanner entrada = new Scanner(cliente.getInputStream());
		String linha;
		
		while(entrada.hasNextLine()) {
			linha = entrada.nextLine();
			System.out.println(linha);
		}
		entrada.close();
		cliente.close();
		
	}

}
