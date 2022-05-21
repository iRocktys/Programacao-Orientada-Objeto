package banco;

public class Conta {
	//Declarando variáveis
	static String conta, senha;
	
	public Conta(String conta, String senha) {
		Conta.conta = conta;
		Conta.senha = senha;
	}
	
	public static void saldo() {
		System.out.println("Conta: " + Conta.conta);
	}
	
	public static void extrato() {
		System.out.println("Conta: " + Conta.conta);
	}
	
}