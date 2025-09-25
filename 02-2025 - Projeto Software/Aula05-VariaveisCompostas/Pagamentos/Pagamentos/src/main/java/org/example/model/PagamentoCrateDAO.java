package org.example.model;

import org.example.entidades.Pagamento;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PagamentoCrateDAO {
    public void inserir(Pagamento pagamento) {

        String sql = "INSERT INTO pagamentos (nomeCliente, valor, data) VALUES (?, ?, ?)";

        try (Connection con = Conexao.getConexao();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1 , pagamento.getNomeCliente());
            stmt.setDouble(2 , pagamento.getValor());
            stmt.setString(3 , pagamento.getData());

            stmt.executeUpdate();
            stmt.close();
            System.out.println("Pagamento Cadastrado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
