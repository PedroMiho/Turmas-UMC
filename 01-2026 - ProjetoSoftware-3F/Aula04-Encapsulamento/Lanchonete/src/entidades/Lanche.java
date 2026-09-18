package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;

    public Lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = estoque > 0;
    }



    //Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        System.out.println("Descrição alterada com sucesso!");
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean decrementarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Informe um valor maior que zero");
            return false;
        } else if (quantidade > this.estoque) {
            System.out.println("Sem Estoque");
            return false;
        } else {
            this.estoque -= quantidade;
            System.out.println("Pedido Efetuado com sucesso");
            alterarDisponivel();
            return true;
        }
    }

    public void incrementarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Informe um valor maior que zero");
        } else {
            this.estoque += quantidade;
        }
    }

    public double valorTotal(int quantidade) {
        return quantidade * this.valor;
    }

    public void alterarDisponivel() {
        this.disponivel = this.estoque > 0;
    }


    @Override
    public String toString() {
        return "Lanche: " + nome +
                "\nDescrição: " + descricao +
                "\nValor: R$ " + valor +
                "\nEstoque: " + estoque +
                "\nDisponível: " + disponivel
        ;
    }
}
