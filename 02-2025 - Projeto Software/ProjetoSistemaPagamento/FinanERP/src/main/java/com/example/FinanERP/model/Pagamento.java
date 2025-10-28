package com.example.FinanERP.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

//Anotação para identificar a tabela aonde os dados serão salvos
@Table(name = "pagamento")
@Entity (name = "Pagamento")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
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
