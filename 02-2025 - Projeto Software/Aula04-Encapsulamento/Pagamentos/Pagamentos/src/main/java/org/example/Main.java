package org.example;

import org.example.entidades.Pagamento;
import org.example.model.PagamentoCrateDAO;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do Pagamento: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a data do Pagamento: ");
        String data = sc.nextLine();
        Pagamento pagamento = new Pagamento(nome, valor, data);
        PagamentoCrateDAO dao = new PagamentoCrateDAO();
        dao.inserir(pagamento);


        sc.close();
    }
}