public class Livro {
    String titulo;
    String autor;
    int quantidade;
    double valorUnitario;

    //Construtores
    public Livro(String titulo, String autor, int quantidade, double valorUnitario) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    //Metodo Empresta Livro
    public void emprestaLivro(int quantidade){
        if (this.quantidade >=  quantidade && quantidade > 0){
            this.quantidade -= quantidade;
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    //Metodo para devolver o livro
    public void devolverLivro(int quantidade){
        if (quantidade > 0){
            this.quantidade += quantidade;
        } else {
            System.out.println("Informe um valor válido");
        }
    }

    //Metodo - double, int e String
    //Possuem retorno
    public double valorTotal(){
        double valorTotal = this.valorUnitario * this.quantidade;
        return valorTotal;
    }

    //Exibir as Informações do livro
    public void exibirDados(){
        System.out.println(
                "Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nQuantidade: " + this.quantidade +
                "\nValor Unitario: R$ " + this.valorUnitario +
                "\nValor Total: R$ " + this.valorTotal()
        );
    }



}
