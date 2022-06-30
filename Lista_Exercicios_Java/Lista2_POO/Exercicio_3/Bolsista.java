package Exercicio_3;

public class Bolsista extends MembroUniversidade{
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
				"\nPagamento: " + getPagamento() + "\n";
	}
}
