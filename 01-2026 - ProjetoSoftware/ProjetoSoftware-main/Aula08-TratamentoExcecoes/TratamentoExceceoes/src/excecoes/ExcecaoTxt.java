package excecoes;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoTxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        while (true) {
            System.out.println("====SISTEMA CADASTRO====");
            System.out.println("1 - CADASTRAR PESSOA");
            System.out.println("2 - LISTAR PESSOA");
            System.out.println("3 - SAIR DO PROGRAMA");
            System.out.print("Digite a opcao: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    try {
                        System.out.print("Digite o nome do Pessoa: ");
                        String nome = sc.nextLine();

                        System.out.print("Digite a idade da Pessoa: ");
                        int idade = sc.nextInt();
                        sc.nextLine();

                        FileWriter writer = new FileWriter("dados.txt", true);
                        writer.write(nome + "," + idade + "\n");
                        writer.close();
                        System.out.println("Dados cadastrados com sucesso!");

                    } catch (IOException e) {
                        System.out.println("ERRO AO CRIAR ARQUIVO");
                        System.out.println("Detalhe: " + e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Informe um valor numerico");
                        System.out.println("Detalhe: " + e.getMessage());
                    }
                    break;

                case "2":
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));
                        String linha;

                        System.out.println("====LISTA DE PESSOAS====");

                        while((linha = reader.readLine()) != null) {


                            System.out.println(linha);
                        }

                    } catch (FileNotFoundException e) {
                        System.out.println("ARQUIVO NÃO CRIADO");
                        System.out.println("Detalhe: " + e.getMessage());
                    } catch (IOException e) {
                        System.out.println("ERRO AO LER ARQUIVO");
                        System.out.println("Detalhe: " + e.getMessage());
                    }
                    break;
                case "3":
                    return;

            }
        }
    }
}
