package tratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		try {
//			System.out.println("Digite um número: ");
//			int numero = sc.nextInt();
//			System.out.println("O número digitado foi " + numero);
//		} catch (InputMismatchException e){
//			System.out.println("Valor inválido, informe um número");
//		}	

		try {
			int[] arr = new int[5];
			System.out.println(arr[9]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O erro encontrado foi " + e.getMessage());
		}
		
		try {
			int resultado = 10 / 0;
			System.out.println(resultado);
		}catch (ArithmeticException e){
			System.out.println("O erro encontrado foi " + e.getMessage());
		}
		
		try {
			String numero = "5";
			int num = Integer.parseInt(numero);
			System.out.println(num);
		}catch (NumberFormatException e) {
			System.out.println("O erro encontrado foi " + e.getMessage());
		}
		
		try {
			System.out.print("Informe um número: ");
			int n1 = sc.nextInt();
			System.out.print("Informe um número: ");
			int n2 = sc.nextInt();
			double resultado = n1/n2;
			System.out.println(resultado);
		}catch (ArithmeticException e) {
			System.out.println("Não é possivel dividir um número por zero");
		}catch (InputMismatchException e) {
			System.out.println("Informe um valor do tipo number");
		}
		
		try {
			System.out.print("Informe um número: ");
			int n1 = sc.nextInt();
			System.out.print("Informe um número: ");
			int n2 = sc.nextInt();
			double resultado = n1/n2;
			System.out.println(resultado);
		}catch (Exception e) {
			System.out.println("O erro encontrado foi " + e.getMessage());
		}

		sc.close();

	}

}
