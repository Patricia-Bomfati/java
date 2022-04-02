package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlayerAudio extends Application {

	public static void main(String[] args) {
		System.out.println("\nCarregando audio da web...");
	launch();
	

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		// carrega o clip de audio
		
		AudioClip audio = new AudioClip("https://softgraf.com/cursojava/multimidia/musica.wav");
		
		StackPane painel = new StackPane();
		painel.getChildren().add(new Text ("tocando musica..."));
		
		Scene cena = new Scene(painel, 500,100);
		stage.setTitle("Tocando audio com javafx");
		stage.setScene(cena);
		stage.show();
		
		audio.play();
		
		
	}

}
