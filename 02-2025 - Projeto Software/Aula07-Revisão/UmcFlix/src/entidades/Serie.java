package entidades;

public class Serie extends Catalogo{
    private int temporadas;
    private int episodios;

    public Serie(String nomeFilme, String protagonista, Genero genero, String diretor, int classificacao, int temporadas, int episodios) {
        super(nomeFilme, protagonista, genero, diretor, classificacao);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "\nTemporadas: " + temporadas +
                "\nEpisodios: " + episodios ;
    }
}
