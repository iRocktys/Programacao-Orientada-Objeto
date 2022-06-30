package Exercicio_1;

public class Sapo extends Anfibio{
	private boolean veneno;
	
	public Sapo(String nome, String quantidadeEscamas, boolean veneno) {
		super(nome, quantidadeEscamas);
		this.veneno = veneno;
	}
	
	public boolean getVeneno() {
		return this.veneno;
	}
	
	public String toString() {
		return  "Nome: " + getNome() +
				"\nEscamas: " + getQuantidadeEscamas() +
				"\nVeneno: " + getVeneno() + "\n";
	}
}
