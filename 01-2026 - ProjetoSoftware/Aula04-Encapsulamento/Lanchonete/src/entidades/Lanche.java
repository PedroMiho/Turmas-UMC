package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;

    //Construtor
    public Lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
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

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.isBlank()){
            System.out.println("Informe uma descrição válida");
        } else {
            this.descricao = descricao;
        }
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            System.out.println("Informe um valor maior que zero!");
        } else {
            this.valor = valor;
            System.out.println("Valor Alterado com sucesso!");
        }
    }

<<<<<<< Updated upstream
    private void verificaDisponivel(){
        this.disponivel = this.estoque > 0;
    }

    public boolean decrementaEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            verificaDisponivel();
            return true;
        } else {
            return false;
        }
    }

    public void incrementaEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            verificaDisponivel();
            System.out.println("Valor Alterado com sucesso!, valor no estoque");
        }else {
            System.out.println("Valor Inválido");
        }
    }

    public double valorTotal(int quantidade) {
        return this.valor * quantidade;
    }


=======
    public boolean verificaEstoque(){
        return this.estoque > 0;
    }

    public boolean pedidoLanche(int quantidade) {
        if (quantidade <= 0) {
            return false;
        } else if (quantidade > this.estoque) {
            return false;
        }

        this.estoque -= quantidade;
        return true;
    }

    public boolean reposicaoLanche(int quantidade) {
        if (quantidade <= 0) {
            return false;
        }

        this.estoque += quantidade;
        return true;
    }

>>>>>>> Stashed changes
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nDescricao: " + descricao +
                "\nValor: R$ " + valor +
                "\nEstoque: " + estoque +
                "\nDisponivel: " + verificaEstoque() ;
    }

    public double valorFinal(int quantidade) {
        return this.valor * quantidade;
    }
}
