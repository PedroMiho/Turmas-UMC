import entidades.Caneta;

public class MainCaneta {

    public static void main(String[] args) {
        Caneta canetaVerde = new Caneta();
        canetaVerde.cor = "Verde";
        canetaVerde.marca = "Pilot";
        canetaVerde.ponta = "Média";
        canetaVerde.recarregavel = true;

        Caneta canetaPreta = new Caneta();
        canetaPreta.cor = "Preta";
        canetaPreta.marca = "Pilot";
        canetaPreta.ponta = "Fina";
        canetaPreta.recarregavel = false;

        canetaVerde.exibeInformacoes();
        canetaPreta.exibeInformacoes();


    }
}
