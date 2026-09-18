package com.urbanvibe.lojaRoupa.dto;

import com.urbanvibe.lojaRoupa.enums.Tamanho;

public record DadosAtualizarRoupa(
        Long id,
        String nomeProduto,
        String marca,
        Tamanho tamanho,
        double preco,
        int quantidade
) {
}
