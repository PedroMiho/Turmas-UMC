public class Main {

    public static void main(String[] args) {
        Livro harry = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 10, 89.90);

        harry.emprestaLivro(2);
        harry.devolverLivro(1);

        harry.exibirDados();


    }

}
