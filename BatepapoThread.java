import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class BatepapoThread extends Thread {
	
	private String usuario;
	private InetAddress endereco;
	private int porta;
	
	public BatepapoThread(String usuario, InetAddress endereco, int porta) {
		this.usuario = usuario;
		this.endereco = endereco;
		this.porta = porta;
	}
	
	@Override
	public void run() {
		
		try {
			// socket para receber e enviar pacotes datagramas para multiplos usuarios
			MulticastSocket socket = new MulticastSocket(porta);
			//passa a aceitar pacotes neste endereco e porta
			socket.joinGroup(endereco);
			
			//executa infinitamente
			while(true) {
				//cria um vetor para receber uma mensagem de ate 128 bytes
				byte[] msg = new byte[128];
				//cria um pacote para receber mensagem
				DatagramPacket datagrama = new DatagramPacket(msg, msg.length);
				//aguarda mensagem  e armazena no datagrama
				socket.receive(datagrama);
				// o datagrama é desempacotado e convertido em string
				String mensagem = new String(datagrama.getData());
				// atencao nao exibe mensagem se dor do mesmo usuario
				if(!mensagem.contains(usuario)) {
					System.out.println("\nMensagem recebida: " + mensagem);
					System.out.println("Digite uma mensagem");
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
