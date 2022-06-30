package Exercicio_2;

public class Anfibio extends Animal{
	private String quantidadeEscamas;
	
	public Anfibio(String nome, String quantidadeEscamas) {
		super(nome);
		this.quantidadeEscamas = quantidadeEscamas;
	}
	
	public String getQuantidadeEscamas() {
		return this.quantidadeEscamas;
	}
}
