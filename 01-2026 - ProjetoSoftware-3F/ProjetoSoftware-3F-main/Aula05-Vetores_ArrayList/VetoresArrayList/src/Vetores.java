public class Vetores {
 public static void main(String[] args) {
     //Vetores
     double[] listaNotas = new double[4];

     //Atribuir valores a esse vetor
     listaNotas[0]=10;
     listaNotas[1]=20;
     listaNotas[2]=30;
     listaNotas[3]=40;

     //Percorrer um Vetor
     for (int i = 0; i < listaNotas.length; i++) {
         System.out.println(listaNotas[i]);
     }

     //Percorrer listas com forEach
     for (double nota : listaNotas) {
         System.out.println(nota);
     }


 }
}
