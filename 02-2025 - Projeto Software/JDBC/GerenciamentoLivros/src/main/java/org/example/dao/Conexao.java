package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    public static final String USUARIO = "root";
    public static final String SENHA = "";

    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
