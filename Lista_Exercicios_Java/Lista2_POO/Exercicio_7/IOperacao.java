package Exercicio_7;

public interface IOperacao {
	//Atribui os valores para as classes para fazer as operacoes
	public void setOperando1(float Operando1);
	public void setOperando2(float Operando2);
	
	//Responsavel para exibir os resultados das operacoes
	public float getResultado();
	public String getNome();
	public int getQuantidade();
}
