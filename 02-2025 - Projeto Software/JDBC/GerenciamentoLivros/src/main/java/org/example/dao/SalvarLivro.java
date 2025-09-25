package org.example.dao;

import org.example.entidades.Livro;

public class SalvarLivro {

    public void salvar(Livro livro) {

        String sql = "INSERT INTO livro (titulo, descricao, quantidade, valor) VALUES (?, ?, ?, ?)";
        
    }
}
