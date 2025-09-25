package Conta;

public class MainConta {
    public static void main(String[] args) {
        ContaMes janeiro = new ContaMes();
        ContaMes fevereiro = new ContaMes();

        //Gastos Janeiro
        janeiro.agua = 500;
        janeiro.luz = 200;
        janeiro.alimentacao = 200;

        //Gastos Fevereiro
        fevereiro.alimentacao = 200;
        fevereiro.agua = 500;
        fevereiro.luz = 200;

        //Soma de gastos
        double gastoTotalJan = janeiro.somaConta();
        double gastoTotalFev = fevereiro.somaConta();

        if (gastoTotalFev > gastoTotalJan) {
            System.out.println("Gasto total de Fevereiro foi maior");
        } else if (gastoTotalFev < gastoTotalJan) {
            System.out.println("Gasto total de Janeiro foi maior");
        } else {
            System.out.println("Ambos os meses tiveram o mesmo gasto");
        }
    }
}
