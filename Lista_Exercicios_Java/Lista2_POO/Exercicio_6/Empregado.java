package Exercicio_6;

public abstract class Empregado {
	private String nome;
	private String sobrenome;
	private float salarioBase;
	
	public abstract void imprimir();
	public abstract void ganhos();

	public Empregado(String nome, String sobrenome, float salarioBase) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioBase = salarioBase;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public float getSalarioBase() {
		return this.salarioBase;
	}
}
