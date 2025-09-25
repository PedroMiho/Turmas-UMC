package entidades;

import servico.Aluguel;

public class Carro extends Veiculos implements Aluguel{
	private boolean arCondicionado;
	
	
	public Carro(String marca, String modelo, int ano, double valorDiario, boolean arCondicionado) {
		super(marca, modelo, ano, valorDiario);
		this.arCondicionado = arCondicionado;
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() +
				"\nModelo: " + getModelo() + 
				"\nAno: " + getAno() + 
				"\nValor Diaria: " + getValorDiario() +
				"\nAr condicionado: " + arCondicionado;
	}

	@Override
	public double calcularAluguel(int dias) {
		
		double valorTotal;
		
		if (arCondicionado) {
			valorTotal = getValorDiario() * dias * 1.5;
		}
		else {
			valorTotal = dias * getValorDiario();
		}
		
		return valorTotal;
	}


}
