package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUsuario {
	
	//Criar um método que retornará o objeto Usuário ou null
	
	public Usuario verificarLogin(String login, String senha) throws SQLException {
		
		//SQL para buscar o usuário 
		String sql = "SELECT * FROM usuarios WHERE login = ?";
		
		try (Connection conn = ConexaoDB.conectar();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, login);
			ResultSet rs = stmt.executeQuery();
			
			//Validar se a consulta retornou False
			if (!rs.next()) {
				return null;
			}
			
			//Recupera a senha do usuario no banco de dados
			String senhaDB = rs.getString("senha");
			
			//Comparar a senha digitada com a senha salva no Banco de dados
			if (senha.equals(senhaDB)) {
				//Instancia o objeto da classe usuario, usando as informações retornadas do DB.
				Usuario usuario = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("login"), 
						rs.getString("senha"));
				return usuario;
			} else {
				return null;
			}
		}
		
		catch (SQLException e) {
			return null;
		}
		
		
		
	}
	
}


