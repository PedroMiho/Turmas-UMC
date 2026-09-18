package poo;

public class MainMes {
    public static void main(String[] args) {

        Mes janeiro = new Mes();
        Mes fevereiro = new Mes();

        janeiro.agua = 300;
        janeiro.energia = 200;
        janeiro.alimentacao = 600;

        janeiro.gastoTotal();

        fevereiro.agua = 300;
        fevereiro.energia = 200;
        fevereiro.alimentacao = 600;

        fevereiro.gastoTotal();

    }
}
