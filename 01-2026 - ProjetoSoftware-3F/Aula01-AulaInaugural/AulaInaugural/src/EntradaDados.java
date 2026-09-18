import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Nome: " + nome);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Idade: " + idade);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Peso: " + peso);
    }

}
