package entidades;

public class ContaBancaria {
    private String nome;
    private String telefone;
    private int agencia;
    private int conta;
    private double saldo;

    public ContaBancaria(String nome, String telefone, int agencia, int conta, double saldo) {
        this.nome = nome;
        this.telefone = telefone;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor insuficiente para depositar");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor insuficiente para sacar");
        }
    }

    public String getNome() {
       return nome;
    }


    public String getTelefone() {
        return telefone;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta Bancaria" +
                "\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\nAgencia: " + agencia +
                "\nConta: " + conta +
                "\nSaldo: " + saldo ;
    }
}
