package org.example.model;

import org.example.entidades.Pagamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PagamentoReadDAO {
    public List<Pagamento> listaPagamentos(){

        List<Pagamento> pagamentos = new ArrayList<>();


        String sql = "SELECT * FROM pagamentos";

        try {
            Connection conn = Conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pagamento pagamento = new Pagamento(
                        rs.getString("data"),
                        rs.getDouble("valor"),
                        rs.getString("nomeCliente"),
                        rs.getInt("id")
                );

                pagamentos.add(pagamento);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return pagamentos;
    }
}
