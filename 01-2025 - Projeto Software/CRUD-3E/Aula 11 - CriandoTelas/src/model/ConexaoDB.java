package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	
	//URL de conexão com o DB
	private static final String URL = "jdbc:mysql://localhost:3306/sistema";
	
	//Informar o usuário e senha do banco de dados
	private static final String User = "root";
	private static final String PASSWORD = "";
	
	//Método estático que retorna a conexão com o banco de dados
	public static Connection conectar() throws SQLException {
		return DriverManager.getConnection(URL, User, PASSWORD);
	}
}
