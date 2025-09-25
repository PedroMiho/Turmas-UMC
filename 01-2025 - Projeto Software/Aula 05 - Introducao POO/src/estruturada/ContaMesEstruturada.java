package estruturada;

public class ContaMesEstruturada {

	public static void main(String[] args) {
		
		double janAlim, janEnergia, janAgua, fevAlim, fevEnergia, fevAgua;
		
		//Gastos em Janeiro
		janAlim = 1000;
		janEnergia = 300;
		janAgua = 300;
		
		//Gastos em Fevereiro
		fevAlim = 600;
		fevEnergia = 500;
		fevAgua = 500;
		
		//Total de gastos em ambos os meses
		double gastoJan = janAgua + janAlim + janEnergia;
		double gastoFev = fevAgua + fevAlim + fevEnergia;	
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto de janeiro foi maior");
		}
		
		else if (gastoFev > gastoJan) {
			System.out.println("O gasto de fevereiro foi maior");
		}
		else {
			System.out.println("Ambos os meses tiveram o mesmo gasto");
		}
		
		
		

	}

}
