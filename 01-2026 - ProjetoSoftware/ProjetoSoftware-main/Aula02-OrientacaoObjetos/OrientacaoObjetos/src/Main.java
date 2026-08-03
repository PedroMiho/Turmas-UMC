public class Main {
    public static void main(String[] args) {

        Lanche xEgg = new Lanche();
        xEgg.nome = "X-Egg";
        xEgg.preco = 24.90;
        xEgg.descricao = "Pão, Maionese, Ovo, Hamburguer, Queijo";

        Lanche xTudo = new Lanche();
        xTudo.nome = "X-Tudo";
        xTudo.preco = 34.90;
        xTudo.descricao = "Pão, Maionese, Ovo, Hamburguer, Queijo, Bacon, etc";

        xTudo.exibir();
        xEgg.exibir();

    }
}
