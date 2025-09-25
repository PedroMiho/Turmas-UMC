package tratamentoExcecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OutrasExcecoes {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("class");
		} catch (ClassNotFoundException e) {
			System.out.println("A classe não foi encontrada");;
		}
		
		try {
			File file = new File("arquivo.txt");
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}catch (IOException e) {
			System.out.println("Arquivo corrompido");
		}finally {
			System.out.println("Programa finalizado");
		}
		

	}

}
