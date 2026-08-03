package poo;

public class MainLanche {
    public static void main(String[] args) {
        Lanche xEgg = new Lanche();
        xEgg.nome = "X-Egg";
        xEgg.descricao = "Pão, Ovo, Maionese, Hamburguer, Queijo";
        xEgg.tamanho = "Kids";
        xEgg.preco = 15.90;
        xEgg.exibirInformacoes();

        Lanche xTudo = new Lanche();
        xTudo.nome = "X-Tudo";
        xTudo.descricao = "Pão, Ovo, Maionese, Hamburguer, Queijo, Bacon";
        xTudo.preco = 20.90;
        xTudo.tamanho = "Kids";
        xTudo.exibirInformacoes();
    }
}
