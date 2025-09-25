//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Criar um vetor

        double[] notasAlunos = new double[3];

        notasAlunos[0] = 5.0;
        notasAlunos[1] = 6.0;
        notasAlunos[2] = 7.0;

        System.out.println(notasAlunos[0]);
        System.out.println(notasAlunos[1]);
        System.out.println(notasAlunos[2]);

        //Percorrer o vetor
        for (double nota : notasAlunos) {
            System.out.println(nota);
        }




    }
}