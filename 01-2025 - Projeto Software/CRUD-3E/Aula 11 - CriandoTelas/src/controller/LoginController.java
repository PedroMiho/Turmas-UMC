package controller;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.LoginUsuario;
import model.Usuario;

public class LoginController {

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    void onClickEntrar(ActionEvent event) throws SQLException, IOException {
    	String login = this.txtLogin.getText();
    	String senha = this.txtSenha.getText();
    	
    	LoginUsuario loginUsuario = new LoginUsuario();
    	Usuario usuario = loginUsuario.verificarLogin(login, senha);
    	
    	if (usuario == null) {
    		Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setTitle("Erro Login");
			alerta.setHeaderText("Login ou senha incorretas");
			alerta.setContentText("Verifique as credenciais e tente novamente");
			alerta.showAndWait();
    	}else {
    		AlterarTelaController.mudarTelaUsuario(event, "/view/TelaUsuario.fxml", "Tela Usuario", usuario);
    	}
    
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
    	AlterarTelaController.mudarTela(event, "/view/TelaHome.fxml", "Tela Home");
    }

}
