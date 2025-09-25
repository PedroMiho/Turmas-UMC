package controller;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Usuario;

public class AlterarTelaController {

	public static void mudarTela(ActionEvent event, String TelaFXML, String titulo) throws IOException {
		// Informa o caminho do arquivo FXML
		FXMLLoader loader = new FXMLLoader(AlterarTelaController.class.getResource(TelaFXML));
		// Carregar o arquivo FXML
		Parent root = loader.load();
		// Identificar a mudança de janela
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		//Definir uma nova cena para a tela
		Scene scene = new Scene(root);
		//Definir um titulo para a janela
		stage.setTitle(titulo);
		//Atualizo a nova cena
		stage.setScene(scene);
		stage.show();
	}
	
	public static void mudarTelaUsuario(ActionEvent event, String TelaFXML, String titulo, Usuario usuario) throws IOException {
		// Informa o caminho do arquivo FXML
		FXMLLoader loader = new FXMLLoader(AlterarTelaController.class.getResource(TelaFXML));
		// Carregar o arquivo FXML
		Parent root = loader.load();
		
		//Instanciar a classe usuario Controller
		UsuarioController controler = loader.getController();
		controler.recebeUsuario(usuario);
		
		
		// Identificar a mudança de janela
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		//Definir uma nova cena para a tela
		Scene scene = new Scene(root);
		//Definir um titulo para a janela
		stage.setTitle(titulo);
		//Atualizo a nova cena
		stage.setScene(scene);
		stage.show();
	}
	
	
	

	
}
