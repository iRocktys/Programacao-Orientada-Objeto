package Exercicio_3;

public class Administrativo extends MembroUniversidade{
	private String nome;
	
	public Administrativo() {
		super();
		this.nome = "Indefinido";
	}
	
	public Administrativo(String nome, float pagamento) {
		super(pagamento);
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		return  "Cargo: Administrativo \nNome: " + getNome() +
				"\nPagamento: " + getPagamento() + "\n";
	}
}
