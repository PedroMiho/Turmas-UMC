package com.urbanvibe.lojaRoupa.dto;

import com.urbanvibe.lojaRoupa.enums.Tamanho;

public record DadosCadastroRoupa(
        String nomeProduto,
        String marca,
        Tamanho tamanho,
        double preco,
        int quantidade
) {
}
