package controller;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.AtualizaDados;
import model.ExcluirUsuario;
import model.Usuario;

public class UsuarioController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;
    
    private Usuario usuarioAtual;
    
    public void recebeUsuario(Usuario usuario) {
    	this.usuarioAtual = usuario;
    	txtNome.setText(usuario.getNome());
    	txtLogin.setText(usuario.getLogin());
    	txtSenha.setText(usuario.getSenha());
    }
    
    @FXML
    void onClickAtualizar(ActionEvent event) throws SQLException {
    	//Capturar os novos dados do usuário
    	String novoNome = txtNome.getText();
    	String novaLogin = txtLogin.getText();
    	String novaSenha = txtSenha.getText();
    	
    	//Salvar o login antigo
    	String loginAntigo = usuarioAtual.getLogin();
    	
    	//Alterar as informações do usuario
    	usuarioAtual.setNome(novoNome);
    	usuarioAtual.setLogin(novaLogin);
    	usuarioAtual.setSenha(novaSenha);
    	
    	//Chamar a classe para alterar os dados no banco de dados
    	AtualizaDados dadosAtualizados = new AtualizaDados();
    	boolean sucesso = dadosAtualizados.AtualizarUsuario(usuarioAtual, loginAntigo);
    	
    	if (sucesso) {
    		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    		alerta.setTitle("Usuário atualizado");
    		alerta.setHeaderText("Usuário atualizado com sucesso");
    		alerta.showAndWait();
    	}
    }

    @FXML
    void onClickExcluir(ActionEvent event) throws SQLException, IOException {
    	//Salvar o login antigo
    	String loginAntigo = usuarioAtual.getLogin();
    	
    	ExcluirUsuario excluir = new ExcluirUsuario();
    	boolean sucesso = excluir.deletarUsuario(loginAntigo);
    	
    	if (sucesso) {
    		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    		alerta.setTitle("Usuário Deletado");
    		alerta.setHeaderText("O Usuário foi deletado com sucesso");
    		alerta.showAndWait();
    		AlterarTelaController.mudarTela(event, "/view/TelaHome.fxml", "Tela Home");
    	} else {
    		System.out.println("pedro");
    	}
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
    	AlterarTelaController.mudarTela(event, "/view/TelaLogin.fxml", "Tela Login");
    }


}
