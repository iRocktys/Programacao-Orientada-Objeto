package Exercicio_1;

public class Terrestre extends Animal{
	private String quantidadePelos;
	
	public Terrestre(String nome, String quantidadePelos) {
		super(nome);
		this.quantidadePelos = quantidadePelos;
	}
	
	public String getQuantidadePelos() {
		return this.quantidadePelos;
	}
}
