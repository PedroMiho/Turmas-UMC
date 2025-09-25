import entidades.Livro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro harryPotter = new Livro("Harry Potter", "J. K. Rowling", 5, 50);
        Livro naruto = new Livro("Naruto", "Masashi Kishimoto");
        naruto.valor = 50;

        naruto.emprestaLivro(1);
        harryPotter.emprestaLivro(1);
        harryPotter.devolveLivro(20);
        naruto.devolveLivro(20);
        System.out.println(naruto.toString());
        System.out.println(harryPotter.toString());;

    }
}