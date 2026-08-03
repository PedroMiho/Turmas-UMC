package entidades;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GerenciarListaAlunos {
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos(){
        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado!");
        } else {
            System.out.println("| ID | NOME | NOTA 1 | NOTA 2 | MÉDIA | SITUAÇÃO |");
            for (Aluno aluno : alunos) {
                System.out.println("| " + alunos.indexOf(aluno) + " | " + aluno);
            }
        }
    }

    public void atualizarCadastro(int idAluno, String nomeAluno, double notaAluno, double notaAluno2) {
        Aluno aluno = alunos.get(idAluno);
        aluno.setNome(nomeAluno);
        aluno.setNota(notaAluno);
        aluno.setNota2(notaAluno2);
        System.out.println("Cadastro do aluno atualizado com sucesso!");
    }

    public void removerAlunos(int idAluno) {
        alunos.remove(idAluno);
        System.out.println("Aluno removido com sucesso!");
    }


}
