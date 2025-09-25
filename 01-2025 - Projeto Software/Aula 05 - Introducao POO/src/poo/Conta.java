package poo;

public class Conta {

	//Atributos
	double alimentacao;
	double luz;
	double agua;
	
	//Metodos
	
	public double somaConta() {
		double gastoMes = alimentacao + luz + agua;
		return gastoMes;
	}
}
