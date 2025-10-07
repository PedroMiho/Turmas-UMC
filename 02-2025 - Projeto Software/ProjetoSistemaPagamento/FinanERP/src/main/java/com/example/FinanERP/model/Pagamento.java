package com.example.FinanERP.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//Anotação para identificar a tabela aonde os dados serão salvos
@Table(name = "pagamentos")
@Entity (name = "Pagamento")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private String nomeCliente;
    private double valor;
    private LocalDate dataPagamento;
    private String descricao;

    public Pagamento(DadosCadastroPagamento pagamento) {
        this.tipo = pagamento.tipo();
        this.nomeCliente = pagamento.nomeCliente();
        this.valor = pagamento.valor();
        this.dataPagamento = pagamento.dataPagamento();
        this.descricao = pagamento.descricao();
    }
}
