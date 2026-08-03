import entidades.Aluno;
import entidades.GerenciarListaAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciarListaAlunos listaAlunos = new GerenciarListaAlunos();

        while (true){

            System.out.println("=====LISTA OPÇÕES=====");
            System.out.println("1 - CADASTRAR ALUNO");
            System.out.println("2 - LISTAR ALUNOS");
            System.out.println("3 - ATUALIZAR ALUNO");
            System.out.println("4 - EXCLUIR ALUNO");
            System.out.println("5- SAIR DO PROGRAMA");
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            String opcao = sc.nextLine();

            switch (opcao){
                case "1" -> {
                    System.out.print("DIGITE O NOME DO ALUNO: ");
                    String nome = sc.nextLine();

                    System.out.print("DIGITE A PRIMEIRA NOTA: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("DIGITE A SEGUNDA NOTA: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    listaAlunos.cadastrarAluno(aluno);
                }

                case "2" -> {
                    listaAlunos.listarAlunos();
                }

                case "3" -> {
                    listaAlunos.listarAlunos();
                    System.out.print("Informe o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o novo nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    System.out.println("Informe o novo nota do aluno: ");
                    double notaAluno = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Informe o novo nota do aluno: ");
                    double notaAluno2 = sc.nextDouble();
                    sc.nextLine();
                    listaAlunos.atualizarCadastro(idAluno, nomeAluno, notaAluno, notaAluno2);
                }

                case "4" -> {
                    listaAlunos.listarAlunos();
                    System.out.print("Informe o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();
                    listaAlunos.removerAlunos(idAluno);
                }

                case "5" -> {
                    System.out.println("Programa finalizado com sucesso!");
                    return;

                }



            }

        }

    }
}
