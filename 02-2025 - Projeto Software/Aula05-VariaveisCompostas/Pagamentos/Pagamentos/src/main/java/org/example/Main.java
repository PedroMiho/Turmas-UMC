package org.example;

import org.example.entidades.Pagamento;
import org.example.model.PagamentoCrateDAO;
import org.example.model.PagamentoReadDAO;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("INFORME UMA DAS OPÇÕES ABAIXO");
            System.out.println("1 - Registrar o pagamento");
            System.out.println("2 - Listar o pagamento");
            System.out.println("3 - Para sair");
            String opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.print("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.print("Digite o valor do Pagamento: ");
                double valor = sc.nextDouble();
                sc.nextLine();
                System.out.print("Digite a data do Pagamento (AAAA-MM-DD): ");
                String data = sc.nextLine();
                Pagamento pagamento = new Pagamento(nome, valor, data);
                PagamentoCrateDAO dao = new PagamentoCrateDAO();
                dao.inserir(pagamento);
            } else if (opcao.equals("2")) {
                PagamentoReadDAO dao = new PagamentoReadDAO();
                List<Pagamento> pagamentos = dao.listaPagamentos();

                for (Pagamento pagamento : pagamentos) {
                    System.out.println(
                            "ID: " + pagamento.getId() +
                            " | Cliente: " + pagamento.getNomeCliente() +
                            " | Valor: " + pagamento.getValor() +
                            " | Data: " + pagamento.getData()
                    );
                }

            }

            else if (opcao.equals("3")) {
                break;
            }

        }

    }
}