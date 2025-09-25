package entidades;

import servico.Aluguel;

public class Moto extends Veiculos implements Aluguel{

	private int cilindradas;

	public Moto(String marca, String modelo, int ano, double valorDiario, int cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nCilindradas: " + cilindradas;
	}

	@Override
	public double calcularAluguel(int dias) {
		double valorTotal;
		
		if (cilindradas <= 250) {
			valorTotal = dias * getValorDiario();
		}
		else if (cilindradas <= 500) {
			valorTotal = dias * getValorDiario() * 1.5;
		}
		else {
			valorTotal = dias * getValorDiario() * 2;
		}
		
		return valorTotal;
	}
	
	
	
	
}
