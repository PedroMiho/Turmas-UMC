package repeticoes;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		// Jogo de adivinhacao
		
		
		Scanner sc = new Scanner(System.in);
			
		int maquina =(int) (Math.random() * 10); 
		int usuario;
		
		do {
			System.out.print("Informe um número: ");
			usuario = sc.nextInt();
			
			if (usuario < maquina) {
				System.out.println("Informe um número maior");
			}
			else if (usuario > maquina) {
				System.out.println("Informe um número menor");
			}
			
		} while(usuario != maquina);
		
		System.out.println("Parabéns, você venceu");
		
		sc.close();

	}

}
