package Entidade;

public class Carro {
	String fabricante;
	String modelo;
	int ano;
	String placa;
	String cor;
	int velocidade = 0;
	
	public double acelera(double velocidade) { 
		return this.velocidade += velocidade;
	}
	
	public double freia(double velocidade) { 
		return this.velocidade -= velocidade;
	}
	
	public void exibirInfo() {
		System.out.println(
				"Fabricante: " + fabricante +
				", Modelo: " + modelo +
				", Cor: " + cor + 
				", Ano: " + ano + 
				", Placa: " + placa + 
				", Velocidade: " + velocidade
				
			);
	}
}
