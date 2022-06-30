package Exercicio_1;

public class Felino extends Terrestre{
	private String cor;
	
	public Felino(String nome, String quantidadePelos, String cor) {
		super(nome, quantidadePelos);
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public String toString() {
		return  "Nome: " + getNome() +
				"\nPelo: " + getQuantidadePelos() +
				"\nCor do pelo: " + getCor() + "\n";
	}
}
