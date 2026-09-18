import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        //Entrada
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();
        System.out.print("Digite a marca do carro: ");
        carro.marca = sc.nextLine();
        System.out.print("Digite o ano do carro: ");
        carro.ano = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o modelo do carro: ");
        carro.modelo = sc.nextLine();

        carro.exibir();

    }
}
