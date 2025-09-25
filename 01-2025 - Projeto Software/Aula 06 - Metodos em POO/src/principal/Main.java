package principal;
import java.util.Scanner;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		Livro harry = new Livro();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do livro");
		System.out.print("Livro: ");
		harry.livro = sc.nextLine();
		System.out.print("Autor: ");
		harry.autor = sc.nextLine();
		System.out.print("Quantidade: ");
		harry.quantidade = sc.nextInt();
		System.out.print("Valor: ");
		harry.valor = sc.nextDouble();	
		System.out.println(harry.toString());
		
		
		System.out.print("Informe a quantidade de livros emprestados: ");
		int quantidade = sc.nextInt();
		harry.emprestaLivro(quantidade);
		System.out.println("Dados Atualizados: " + harry);
		
		System.out.print("Informe a quantidade de livros devolvidos: ");
		quantidade = sc.nextInt();
		harry.devolveLivro(quantidade);
		System.out.println("Dados Atualizados: " + harry);
		
		sc.close();

	}

}
