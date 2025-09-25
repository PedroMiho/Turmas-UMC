package entidades;

public class Caneta {
    public String marca;
    public String ponta;
    public String cor;
    public boolean recarregavel;

    public void exibeInformacoes() {
        System.out.println("Marca: " + marca +
                "\nPonta: " + ponta +
                "\nCor: " + cor +
                "\nRecarregável: " + recarregavel
        );
    };
}
