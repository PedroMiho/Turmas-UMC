package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;

public class AtualizaDados {
	
	public boolean AtualizarUsuario (Usuario usuario, String login) throws SQLException {
		
		//SQL para atualizar dados do usuário
		String sql = "UPDATE usuarios SET nome = ?, login = ?, senha = ? WHERE login = ? ";
		
		try (Connection conn = ConexaoDB.conectar()){
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getLogin());
			stmt.setString(3, usuario.getSenha());
			stmt.setString(4, login);
			
			stmt.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			//Criar uma janela caso o login ja exista
			Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setTitle("Erro ao atualizar o Cadastro");
			alerta.setHeaderText("Login já existente");
			alerta.setContentText("Este login já está sendo utilizado");
			alerta.showAndWait();
			return false;
		}
		
	}
	
}
