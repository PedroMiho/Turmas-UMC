//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Gasto Janeiro
        double aguaJan = 100;
        double eletricaJan = 200;
        double alimentacaoJan = 300;

        //Gasto Fevereiro
        double aguaFev = 200;
        double eletricaFev = 300;
        double alimentacaoFev = 400;

        //Soma de gastos Janeiro
        double gastoTotalJan = aguaJan + eletricaJan + alimentacaoJan;

        //Soma de gastos em Fevereiro
        double  gastoTotalFev = alimentacaoFev +aguaFev + eletricaFev;

        if (gastoTotalFev > gastoTotalJan) {
            System.out.println("Gasto total de Fevereiro foi maior");
        } else if (gastoTotalFev < gastoTotalJan) {
            System.out.println("Gasto total de Janeiro foi maior");
        } else {
            System.out.println("Ambos os meses tiveram o mesmo gasto");
        }

    }
}