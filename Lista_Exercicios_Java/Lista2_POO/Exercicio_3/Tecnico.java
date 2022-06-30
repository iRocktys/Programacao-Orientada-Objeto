package Exercicio_3;

public class Tecnico extends MembroUniversidade{
	private String nome;
	
	public Tecnico() {
		super();
		this.nome = "Indefinido";
	}
	
	public Tecnico(String nome, float pagamento) {
		super(pagamento);
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		return  "Cargo: Tecnico \nNome: " + getNome() +
				"\nPagamento: " + getPagamento() + "\n";
	}
}
