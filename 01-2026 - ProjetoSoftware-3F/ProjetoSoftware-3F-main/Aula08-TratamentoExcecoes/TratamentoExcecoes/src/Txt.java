import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Txt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        while (true) {
            System.out.println("====SISTEMA CADASTRO====");
            System.out.println("1 - CADASTRAR ALUNO");
            System.out.println("2 - LISTAR ALUNOS");
            System.out.println("3 - SAIR DO PROGRAMA");
            System.out.print("Digite a opcao: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    try {
                        System.out.print("Digite o nome do aluno: ");
                        String nome = sc.nextLine();

                        System.out.print("Digite a nota do aluno: ");
                        double nota = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Digite a nota do aluno: ");
                        double nota2 = sc.nextDouble();
                        sc.nextLine();

                        FileWriter writer = new FileWriter("dados.txt", true);

                        writer.write(nome + "," + nota + "," + nota2 + "\n");
                        writer.close();
                        System.out.println("Dados cadastrados com sucesso!");

                    } catch (IOException e) {
                        System.out.println("Erro ao criar o arquivo");
                        System.out.println("Descrição do erro: " + e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Informe um valor numerico");
                        System.out.println("Descrição do erro: " + e.getMessage());
                    }
                    break;

                case "2":
                    try {
                        listarAlunos();
                    } catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo");
                    }
                    break;
                case "3":
                    break;
            }
        }
    }

    public static void listarAlunos() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));
        String linha;

        System.out.println("======LISTA DE ALUNOS======");
        System.out.println("NOME,NOTA 1,NOTA 2");
        while ((linha = reader.readLine()) != null){
            System.out.println(linha);
        }

        reader.close();
    }
}
