package entidades;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	//Construtores
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//Setters
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	//Getters
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	
	//Metodos altera saldo
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
		else {
			System.out.println("Valor depositado inválido");
		}
	}
	
	//Metodo para sacar saldo
	public void sacar(double valor) {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
		}
		else {
			System.out.println("Valor Inválido");
		}
	}
	
	

	//toString
	@Override
	public String toString() {
		return "Titular: " + titular +
				"\nsaldo=" + saldo;
	} 
	
	
}
