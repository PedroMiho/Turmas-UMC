package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		//Tipos Primitivos - int, double char
		//Objetos - String, Integer, Double
		
		List <String> listaNomes = new ArrayList<>();
		
		//Adicionando itens na ultima posição do array
		listaNomes.add("Pedro");
		listaNomes.add("Geovanna");
		listaNomes.add("Luiz");
		listaNomes.add("Kauan");
		
		//Adicionando itens em uma posição desejada do array
		listaNomes.add(1, "João");
		
		//Verificando o tamanho do Array
		System.out.println("O tamanho da lista é igual a " + listaNomes.size());
		
		//Exibindo um valor especifico da lista
		System.out.println("Posição 1: " + listaNomes.get(1));
		
		//Removendo itens de acordo com a posição 
		listaNomes.remove(3);
		
		//Removendo itens de acordo com o valor 
		listaNomes.remove("João");
		
		//Identificando a posição de um elemento
		System.out.println(listaNomes.indexOf("Pedro"));
		
		for(String nome : listaNomes) {
			System.out.println(nome);
		}
		
	}

}
