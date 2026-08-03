package poo;

public class Mes {
    double agua;
    double energia;
    double alimentacao;

    public void gastoTotal(){
        double gastoTotal = agua + energia + alimentacao;
        System.out.println("Gasto total: " + gastoTotal);
    }
}
