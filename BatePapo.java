import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class BatePapo {
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("\nParametros incorretos!\njava BatePapo<endereco_multicast> <porta>");
			System.exit(1);
		}
		
		try {
			//define endereco de comunicacao entre os sockets
			InetAddress endereco = InetAddress.getByName(args[0]);
			//define a porta de comunicacao
			int porta = Integer.parseInt(args[1]);
			
			// cria um buffer de leitura do teclado
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Digite seu nome: ");
			String usuario = br.readLine();
			
		// cria uma thread para responder as mensagens ate que o usuario digite sair
			Batepapo Thread bp = new batepapoThread(usuario, endereco,porta);
			// inicia a execucao da thread (que ficara aguardando)
			bp.start();
			
			// cria um socket multicast para comunicacao
			MulticastSocket socket = new MulticastSocket();
			//pode receber e enviar pacotes neste endereco e porta para multiplos usuarios
			socket.joinGroup(endereco);
			
			//executa infinitamente ate digitar sair
			while(true) {
				System.out.println("Digite uma mensagem: ");
				String mensagem = br.readLine();
				
				// se digitar sair encerra o programa
				if(mensagem.equals("sair")) {
					System.out.println("Fui!");
					System.exit(0);
				}else {
					//cria uma mensagem
					mensagem = usuario + "diz" + mensagem;
					// usa um vetor de bytes para armazenar a mensagem
					byte[] msg = mensagem.getBytes();
					// o datagrama é o envelope por onde a mensagem sera enviada
					DatagramPacket datagrama = new DatagramPacket(msg, msg.length, endereco, porta);
					//usa o socket multicast para enviar o datagrama
					socket.send(datagrama);
				}
			}
	}catch (UnknownHostException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}

}
