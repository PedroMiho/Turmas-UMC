package com.urbanvibe.lojaRoupa.model;

import com.urbanvibe.lojaRoupa.dto.DadosAtualizarRoupa;
import com.urbanvibe.lojaRoupa.dto.DadosCadastroRoupa;
import com.urbanvibe.lojaRoupa.enums.Tamanho;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "roupa")
@Entity(name = "Roupa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private String marca;
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
    private double preco;
    private int quantidade;

    public Roupa(DadosCadastroRoupa dados) {
        this.nomeProduto = dados.nomeProduto();
        this.marca = dados.marca();
        this.tamanho = dados.tamanho();
        this.preco = dados.preco();
        this.quantidade = dados.quantidade();
    }

    public void atualizarDados(DadosAtualizarRoupa dadosAtualizados) {
        this.nomeProduto = dadosAtualizados.nomeProduto();
        this.marca = dadosAtualizados.marca();
        this.tamanho = dadosAtualizados.tamanho();
        this.preco = dadosAtualizados.preco();
        this.quantidade = dadosAtualizados.quantidade();
    }
}
