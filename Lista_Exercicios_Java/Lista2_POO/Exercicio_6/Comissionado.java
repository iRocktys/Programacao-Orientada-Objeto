package Exercicio_6;

public class Comissionado extends Empregado{
	private float taxaComissao, ganhoTotal;
	
	public Comissionado(String nome, String sobrenome, float salarioBase, float taxaComissao) {
		super(nome, sobrenome, salarioBase);
		this.taxaComissao = taxaComissao;
	}
	
	public float getTaxaComissao() {
		return taxaComissao;
	}
	
	public void imprimir() {
		System.out.print("Nome: " + getNome() + " | Sobrenome: " + getSobrenome() +
				" | Salario Base: " + getSalarioBase() + " | Taxa de Comissao: " + getTaxaComissao());
	}
	
	public void ganhos() {
		this.ganhoTotal = getSalarioBase() + ((getTaxaComissao()/100)*getSalarioBase());
		System.out.print(" | Total Ganho: " + this.ganhoTotal);	
	}

}
