package Exercicio_6;

public class Bonificado extends Assalariado{
	private float bonificacao, ganhoTotal;
	
	public Bonificado(String nome, String sobrenome, float salarioBase, float bonificacao, float salarioSemanal) {
		super(nome, sobrenome, salarioBase, salarioSemanal);
		this.bonificacao = bonificacao;
	}
	
	public float getBonificacao() {
		return this.bonificacao;
	}
	
	public void imprimir() {
		System.out.print("Nome: " + getNome() + " | Sobrenome: " + getSobrenome() +
				" | Salario Base: " + getSalarioBase() + " | Bonificacao:" +
				getBonificacao() + " | Salario Semanal: " + getSalarioSemanal());
	}
	
	public void ganhos() {
		this.ganhoTotal = getSalarioBase()+getBonificacao()+getSalarioSemanal();
		System.out.println(" | Total Ganhos: " + this.ganhoTotal);
	}
}
