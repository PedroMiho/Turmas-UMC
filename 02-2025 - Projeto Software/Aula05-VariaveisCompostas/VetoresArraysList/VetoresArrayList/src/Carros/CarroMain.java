package Carros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarroMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Carro> carros = new ArrayList<>();

        while (true) {
            System.out.println("Digite a marca do carro: ");
            String marca = sc.nextLine();
            System.out.println("Digite o modelo do carro: ");
            String modelo = sc.nextLine();
            System.out.println("Digite o ano do carro: ");
            int ano = sc.nextInt();
            sc.nextLine();

            Carro carro = new Carro(marca, modelo, ano);
            carros.add(carro);

            System.out.println("Carro adicionado com sucesso!");
            System.out.println("Deseja adicionar um carro? [S/N]");
            String continuar = sc.nextLine();

            if (continuar.equalsIgnoreCase("N")) {
                break;
            }

        }

        for (Carro carro : carros) {
            System.out.println(carro.toString());
        }


    }
}
