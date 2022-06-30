package Exercicio_6;

public class Horista extends Empregado{
	private float ganhoTotal;
	private int horas;
	
	public Horista(String nome, String sobrenome, float salarioBase, int horas) {
		super(nome, sobrenome, salarioBase);
		this.horas = horas;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public void imprimir() {
		System.out.print("\nNome: " + getNome() + " | Sobrenome: " + getSobrenome() +
				" | Salario Base: " + getSalarioBase() + " | Horas: " + getHoras()
				+ " | Valor Horas: 10");
	}
	
	public void ganhos() {
		this.ganhoTotal = getSalarioBase() + (getHoras()*10);
		System.out.print(" | Total Ganho: " + this.ganhoTotal);	
	}

}
