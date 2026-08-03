package poocarro;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.print("Digite a marca do carro: ");
        carro.marca = sc.nextLine();
        System.out.print("Digite o modelo do carro: ");
        carro.modelo = sc.nextLine();
        System.out.print("Digite a ano do carro: ");
        carro.ano = sc.nextInt();

        carro.exibirInfo();


        sc.close();

    }
}
