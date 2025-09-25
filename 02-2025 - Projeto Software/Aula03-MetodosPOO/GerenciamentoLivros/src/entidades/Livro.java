package entidades;

public class Livro {
    public String titulo;
    public String autor;
    public int quantidade = 0;
    public double valor = 0;

    public Livro(String titulo, String autor, int quantidade, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestaLivro(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade indisponível ou Valor Inválido");
        }
    }

    public void devolveLivro(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public double valorTotal() {
        double valorTotal = this.quantidade * this.valor;
        return valorTotal;
    }


    @Override
    public String toString() {
        return "Livro" +
                "\ntitulo: " + titulo +
                "\nautor: " + autor +
                "\nquantidade: " + quantidade +
                "\nvalor: R$" + valor +
                "\nvalorTotal: " + valorTotal();
    }
}
