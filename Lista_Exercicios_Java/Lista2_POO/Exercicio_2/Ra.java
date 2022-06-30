package Exercicio_2;

public class Ra extends Anfibio{
	private boolean veneno;
	
	public Ra(String nome, String quantidadeEscamas, boolean veneno) {
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
