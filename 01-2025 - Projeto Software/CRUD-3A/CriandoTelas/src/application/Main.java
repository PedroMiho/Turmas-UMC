package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//Titulo tela
			primaryStage.setTitle("Tela Cadastro");
			
			//Informa se a tela pode mudar o tamanho
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			
			//Carregar as informações da tela
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TelaCadastro.fxml"));
			Parent arquivoFXML = loader.load();
			
			//Abrir a tela
			Scene home = new Scene(arquivoFXML);
			primaryStage.setScene(home);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
