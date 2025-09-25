package principal;

import entidades.Carro;
import entidades.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro civic = new Carro("Honda", "Civic", 2024, 250, true);

		System.out.println(civic.toString());
		System.out.println("O valor do aluguel foi de, R$ " + civic.calcularAluguel(5) + "\n");
		
		Moto ninja = new Moto("Kawasaki", "Ninja", 2024, 200, 400);
		
		System.out.println(ninja.toString());
		System.out.println("O valor do aluguel foi de, R$ " + ninja.calcularAluguel(5) + "\n");
	}

}
