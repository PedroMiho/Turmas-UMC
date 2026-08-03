import entidades.Cachorro;
import entidades.Gato;
import entidades.Peixe;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Max", 2, 20, "Pit Bull");
        Cachorro labrador = new Cachorro("Marley", "Labrador");


        Gato gato = new Gato("Gato", 5, 5, "Marrom");
        Gato cat = new Gato("Cat", "Cinza");

        Peixe peixe = new Peixe("Peixe", 1, 0.005, "Betta");


        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(peixe);

    }
}
