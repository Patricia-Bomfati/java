package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWord extends Application {

	public static void main(String[] args) {
		// chama o metodo start do javafx
		launch();
		
		

	}

	@Override
	public void start(Stage stage) throws Exception {
		// elemento pai com layout de pilha
		StackPane painel= new StackPane();
		
		// texto
		Label lblMensagem = new Label("Ola mundo! Bem vindo ao javafx");
		
		// recupera os filhos do painel e depois adiciona o label
		painel.getChildren().add(lblMensagem);
		
										// tamanho da cena
		Scene cena = new Scene(painel, 250,100);
		stage.setTitle("Tela com JavaFx");
		stage.setScene(cena); // guarda a cena no stage
		stage.show();
		
		
		
		
	}

}
