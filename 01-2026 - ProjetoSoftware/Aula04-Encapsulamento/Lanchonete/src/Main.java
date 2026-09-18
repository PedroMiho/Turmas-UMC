import entidades.Lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lanche x_burguer = new Lanche("X-BURGER",
                "Pão, Hamburguer, Queijo, Maionese Verde",
                24.9, 10
        );

        Scanner sc = new Scanner(System.in);
        int quantidade;
        while (true) {
            System.out.println("----LISTA DE OPÇÕES----");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - ADICIONAR NO ESTOQUE");
            System.out.println("3 - INFORMAÇÃO DO LANCHE");
            System.out.println("4 - ALTERAR VALOR");
            System.out.println("5 - ALTERAR DESCRIÇÃO");
            System.out.println("6 - SAIR");
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            String opcao = sc.nextLine();

            switch (opcao) {
<<<<<<< Updated upstream

                case "1":
                    System.out.print("Quantos lanches você deseja: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    if (x_burguer.decrementaEstoque(quantidade)) {
                        System.out.println("Você pediu " + quantidade +
                                " " + x_burguer.getNome() + " e o valor final, foi de R$ " +
                                x_burguer.valorTotal(quantidade)
                        );
                    } else {
                        System.out.println("Pedido não realizado!");
=======
                case "1":
                    System.out.print("Informe a quantidade de lanches: ");
                    quantidade = sc.nextInt();
                    sc.nextLine();

                    if (x_burguer.pedidoLanche(quantidade)){
                        System.out.println("Você pediu o " + quantidade + " " + x_burguer.getNome() +
                                ", valor total R$" + x_burguer.valorFinal(quantidade));
                    } else {
>>>>>>> Stashed changes
                        System.out.println("Quantidade Inválida");
                    }
                    break;

<<<<<<< Updated upstream
                case "2":
                    System.out.print("Quantos lanches você deseja: ");
                    int quantidadeEstoque = sc.nextInt();
                    sc.nextLine();
                    x_burguer.incrementaEstoque(quantidadeEstoque);
                    break;

=======

                case "2":
                    System.out.print("Informe a quantidade de lanches: ");
                    quantidade = sc.nextInt();
                    sc.nextLine();

                    if (x_burguer.reposicaoLanche(quantidade)){
                        System.out.println("Lanches Acrescentados");
                    } else {
                        System.out.println("Quantidade Inválida");
                    }
                    break;



>>>>>>> Stashed changes
                case "3":
                    System.out.println(x_burguer.toString());
                    break;

                case "4":
<<<<<<< Updated upstream
                    System.out.println("O lanche " + x_burguer.getNome() +
                            " custa R$ " + x_burguer.getValor()
                    );

                    System.out.print("Informe o novo valor do lanche: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    x_burguer.setValor(valor);
                    break;

                case "5":
                    System.out.println("O lanche " + x_burguer.getNome() +
                            " tem a seguinte descrição " + x_burguer.getDescricao());

                    System.out.print("Informe a nova Descrição: ");
                    String descricao = sc.nextLine();

                    x_burguer.setDescricao(descricao);
                    break;

                default:
                    System.out.println("Informe uma opção válida");
                    break;
            }





=======
                    System.out.print("Informe o valor do lanche: ");
                    double novoValor = sc.nextDouble();

                    x_burguer.setValor(novoValor);
                    System.out.println("Valor alterado com sucesso");
                    break;


                case "5" :
                    System.out.print("Informe o nome do lanche: ");
                    String novoNome = sc.nextLine();

                    x_burguer.setNome(novoNome);
                    System.out.println("Nome alterado com sucesso");
                    break;

                case "6":
                    return;

                default:
                    System.out.println("Informe uma opção válida");
                    break;

            }


>>>>>>> Stashed changes

        }


    }
}
