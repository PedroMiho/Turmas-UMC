import entidades.Filme;
import entidades.Genero;
import entidades.Serie;

import javax.xml.transform.Source;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME O REGISTRO: ");
        System.out.println("1 - FILME");
        System.out.println("2 - SÉRIE");
        int opcao = sc.nextInt();


        System.out.println("Informe o nome do filme/série: ");
        String nome = sc.nextLine();
        System.out.println("Informe o Gênero: ");
        Genero genero = Genero.valueOf(sc.nextLine());
        System.out.println("Informe o diretor: ");
        String diretor = sc.nextLine();
        System.out.println("Informe a classificação: ");
        int classificacao = sc.nextInt();
        System.out.println("Informe o protagonista: ");
        String protagonista = sc.nextLine();

        if (opcao == 1) {
            System.out.println("Informe a duração do filme: ");
            int duracao = sc.nextInt();
            Filme filme = new Filme(nome, protagonista, genero, diretor, classificacao, duracao);
            filme.toString();

        } else if (opcao == 2) {
            System.out.println("Informe a quantidade de temporadas: ");
            int temporadas = sc.nextInt();
            System.out.println("Informe a quantidade de episodios: ");
            int episodios = sc.nextInt();
            Serie serie = new Serie(nome, protagonista, genero, diretor, classificacao, temporadas, episodios);
            serie.toString();
        }

        sc.close();

    }
}