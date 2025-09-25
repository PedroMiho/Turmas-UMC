package principal;

import entidades.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria vitor = new ContaBancaria("Vitor", 1000);
				
		vitor.depositar(500);
		vitor.depositar(100);
		vitor.depositar(-10);
		vitor.sacar(1601);
		System.out.println("Nome do titular: " + vitor.getTitular());
		System.out.println("Saldo: " + vitor.getSaldo());

	}

}
