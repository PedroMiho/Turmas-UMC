package entidades;

public class Livro {
	public String livro;
	public String autor;
	public int quantidade;
	public double valor;
	
	public String exibeDados() {
		return "Livro: " + livro +
				"\nAutor: " + autor + 
				"\nQuantidade: " + quantidade +
				"\nValor: " + valor;
	}

	public void emprestaLivro(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public void devolveLivro(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public double valorTotalLivro() {
		double valorTotal = quantidade * valor;
		return valorTotal;
	}

	@Override
	public String toString() {
		return "Livro: " + livro + 
				"\nAutor: " + autor + 
				"\nQuantidade: " + quantidade + 
				"\nValor: R$" + valor +
				"\nValot Total: R$" + valorTotalLivro();
	}
}
