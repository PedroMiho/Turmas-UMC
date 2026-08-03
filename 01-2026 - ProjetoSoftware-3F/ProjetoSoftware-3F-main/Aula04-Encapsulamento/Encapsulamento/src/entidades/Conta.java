package entidades;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Setters - Metodo Modificador
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Getters - Metodo de Acesso
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Depositado com sucesso, seu saldo é de " + this.saldo);
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso, seu saldo é de " + this.saldo);
        } else  {
            System.out.println("Saldo insuficiente");
        }
    }


}
