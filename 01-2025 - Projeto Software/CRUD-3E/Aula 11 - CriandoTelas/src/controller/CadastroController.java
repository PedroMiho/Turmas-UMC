package controller;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.CadastroUsuario;
import model.Usuario;

public class CadastroController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;

    @FXML
    void onClick(ActionEvent event) throws SQLException {
    	
    	//Salvando as informações digitadas pelo Usuário
    	int id = (int) (Math.random() * 100);
    	String login = this.txtLogin.getText();
    	String nome = this.txtNome.getText();
    	String senha = this.txtSenha.getText();
    	
    	//Validação dos campos 
    	if (login.isEmpty() || nome.isEmpty() || senha.isEmpty() ) {
    		//Criar uma janela caso os campos estiverem vazios
			Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setTitle("Erro Cadastro");
			alerta.setHeaderText("Campos inválidos");
			alerta.setContentText("Verifique se todos os campos foram preenchidos");
			alerta.showAndWait();
    	}else {
    		//Instânciar as classes Usuario e CadastrarUsuario
        	Usuario novoUsuaio = new Usuario(id, nome, login, senha);
        	CadastroUsuario cadastrarUsuario = new CadastroUsuario();
        	
        	//Chamar o método que registra o Usuario
        	cadastrarUsuario.cadastrarUsuario(novoUsuaio);
    	}
    	
    	
    	
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
    	AlterarTelaController.mudarTela(event, "/view/TelaHome.fxml", "Tela Home");
    }

}
