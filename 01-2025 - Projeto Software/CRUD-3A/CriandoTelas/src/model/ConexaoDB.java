package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	private static final String URL = "jbdc:mysql://localhost:3306/sistema";
	
	//Informar o Usuário e a senha do Banco de dados
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	
	//Método estático da classe que retorna a conexão com o DB
	public static Connection conectar() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
}
