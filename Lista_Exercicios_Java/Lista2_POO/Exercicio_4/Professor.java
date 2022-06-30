package Exercicio_4;

public class Professor extends MembroUniversidade{
	private String nome;
	
	public Professor() {
		super();
		this.nome = "Indefinido";
	}
	
	public Professor(String nome, float pagamento) {
		super(pagamento);
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		return  "Cargo: Professor\nNome: " + getNome() +
				"\nPagamento: " + getPagamento() + "\n";
	}
}
