package com.dmgmodels.lojaRoupas.dto;

import com.dmgmodels.lojaRoupas.enums.Tamanho;

public record DadosCadastroRoupa(
        String nomeProduto,
        String marca,
        Tamanho tamanho,
        double preco,
        int quantidade
) {
}
