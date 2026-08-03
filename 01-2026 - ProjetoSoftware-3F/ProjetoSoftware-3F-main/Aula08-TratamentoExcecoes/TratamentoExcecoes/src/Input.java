import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){

            try {
                System.out.print("Digte um número: ");
                double n1 = sc.nextDouble();
                sc.nextLine();

                System.out.print("Digite um número: ");
                double n2 = sc.nextDouble();
                sc.nextLine();

                double resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Informe um valor numerico");
            }
        }

        sc.close();

    }
}
