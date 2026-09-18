import entidades.Conta;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta("João", 5000);

        conta.setTitular("João Silva");

        System.out.println("O nome do titular é " + conta.getTitular());

        conta.depositar(500);
        conta.sacar(400);

        System.out.println("O titular " +  conta.getTitular() + " tem o saldo de " + conta.getSaldo());

    }
}
