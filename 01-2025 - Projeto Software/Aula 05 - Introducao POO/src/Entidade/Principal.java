package Entidade;

public class Principal {

	public static void main(String[] args) {
		Carro civic = new Carro();
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.placa = "EUB-6530";
		civic.ano = 2022;
		civic.cor = "Preta";
		civic.acelera(10);
		civic.acelera(10);
		civic.freia(10);
		civic.exibirInfo();
		
		Carro kicks = new Carro();
		kicks.fabricante = "Nissan";
		kicks.modelo = "Kicks SV";
		kicks.placa = "KLF-6830";
		kicks.ano = 2023;
		kicks.cor = "Prata";
		kicks.acelera(10);
		kicks.exibirInfo();
		

	}

}
