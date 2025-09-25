package vetores;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos itens você deseja inserir no Vetor ?");
		int tamanhoVetor = sc.nextInt();
		
		double[] notasAlunos = new double[tamanhoVetor];
		
		for(int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Informe uma nota entre 0 a 10");
			double nota = sc.nextDouble();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Nota Inválida");
				i--;
			}
			else {
				notasAlunos[i] = nota;
			}	
		}
		
		for(double nota : notasAlunos) {
			System.out.println(nota);
		}
		
		sc.close();
	}

}
