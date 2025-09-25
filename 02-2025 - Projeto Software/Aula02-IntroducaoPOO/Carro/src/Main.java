import entidades.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro corolla = new Carro();

        System.out.print(("Digite a marca do carro: "));
        corolla.marca = sc.nextLine();

        System.out.print(("Digite o modelo do carro: "));
        corolla.modelo = sc.nextLine();

        System.out.print(("Digite a cor do carro: "));
        corolla.cor = sc.nextLine();

        System.out.print(("Digite o ano do carro: "));
        corolla.ano = sc.nextInt();

        System.out.print(("Digite true se ele for eletrico: "));
        corolla.eletrico = sc.nextBoolean();

        corolla.exibeInformacoes();

        sc.close();
    }
}
