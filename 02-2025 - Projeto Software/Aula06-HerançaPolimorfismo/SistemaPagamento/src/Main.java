import entidades.Pagamento;
import entidades.PagamentoBoleto;
import entidades.PagamentoPix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pagamento> pagamentos = new ArrayList<>();

        while (true){

            System.out.println("1 - Cadastrar pagamento");
            System.out.println("2 - Listar pagamentos");
            System.out.println("3 - Sair");
            String opcao = sc.nextLine();

            if (opcao.equals("1")){
                System.out.print("Digite seu nome: ");
                String nome = sc.nextLine();

                System.out.print("Digite a Data de Pagamento: ");
                String dataPagamento = sc.nextLine();

                System.out.print("Digite o valor do Pagamento: ");
                double valorPagamento = sc.nextDouble();
                sc.nextLine();

                System.out.println("INFORME O MÉTODO DE PAGAMENTO");
                System.out.println("1 - BOLETO");
                System.out.println("2 - PIX");
                System.out.println("3 - CRÉDITO");
                int metodoPagamento = sc.nextInt();
                sc.nextLine();

                Pagamento pagamento = null;
                switch(metodoPagamento){
                    case 1:
                        System.out.print("Digite o código de barras: ");
                        String codigoBarras = sc.nextLine();
                        pagamento = new PagamentoBoleto(nome, valorPagamento, dataPagamento, codigoBarras);
                        break;
                    case 2:
                        System.out.println("Digite a chave pix: ");
                        String chavePix = sc.nextLine();
                        pagamento = new PagamentoPix(nome, valorPagamento, dataPagamento, chavePix);
                        break;
                    default:
                        System.out.println("OPÇÃO INVALIDA");
                        continue;
                }
                pagamentos.add(pagamento);
            }
            else if (opcao.equals("2")){
                System.out.println("\nLISTA DE PAGAMENTOS");
                for (Pagamento pagamento : pagamentos){
                    System.out.println(pagamento.toString());
                }
            }



        }


    }
}