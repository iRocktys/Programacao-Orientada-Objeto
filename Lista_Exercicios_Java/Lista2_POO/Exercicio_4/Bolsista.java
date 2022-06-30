package Exercicio_4;

public class Bolsista extends Status{
	private String nome;
	
	public Bolsista() {
		super();
		this.nome = "Indefinido";
	}
	
	public Bolsista(String nome, float pagamento) {
		super(pagamento);
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		return  "Cargo: Bolsista \nNome: " + getNome() +
				"\nPagamento: " + getPagamento() + 
				"\nRemuneracao: " + getStatus() + "\n";
	}
}
