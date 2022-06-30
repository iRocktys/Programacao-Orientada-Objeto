package Exercicio_7;

public class Soma implements IOperacao{
	private float operando1, operando2;
	protected static int instancia = 0;
	
	public Soma(float x, float y) {
		this.operando1 = x;
		this.operando2 = y;
		Soma.instancia++;
	}
	
	public void setOperando1(float Operando1) {
		this.operando1 = operando1;
	}

	public void setOperando2(float Operando2) {
		this.operando2 = operando2;
	}

	public float getResultado() {
		return this.operando1 + this.operando2;
	}

	public String getNome() {
		return "Soma: ";
	}

	public int getQuantidade() {
		return Soma.instancia;
	}
	
}
