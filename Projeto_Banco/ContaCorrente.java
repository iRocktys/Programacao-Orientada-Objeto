package banco;

import java.util.*;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta{
	static double saldo_corrente;

	Banco_Frame frame = new Banco_Frame();
	
	//Declarando array para utilizar em extrato
	static ArrayList<String> transacoes = new ArrayList<String>();
	
	@SuppressWarnings("deprecation")
	public ContaCorrente(String conta, String senha, double saldo_corrente) {
		super(conta, senha);
		ContaCorrente.saldo_corrente = saldo_corrente;
		
		frame.show();
                Banco_Frame.play("indicacao");
	}	

	//Funcao para saque
	public static double saque(double saldo_corrente) {
		if(saldo_corrente > 0) {
			double valor = 0;
			String aux;
                        Banco_Frame.play("ValorSaque");
			aux = JOptionPane.showInputDialog(null, "Valor de Saque: ");
			valor = Double.parseDouble(aux);
			if(valor > saldo_corrente) {
				//Mensagem de saldo insuficiente
                                Banco_Frame.play("saldoInsuficiente");
				JOptionPane.showMessageDialog(null, "Saldo Insuficiente", "CAIXA NADA ECONOMICO", JOptionPane.CANCEL_OPTION); 
				return saldo_corrente;
			}else {
				saldo_corrente = saldo_corrente - valor;
				transacoes.add("Saque: -" + valor);
                                Banco_Frame.play("ValorSacado");
				return saldo_corrente;                   
			}
		}else {
			//Menssagem de Não possui saldo
                        Banco_Frame.play("saldoZerado");
			return saldo_corrente;
		}
	}

	//Funcao para deposito
	public static double deposito(double saldo_corrente) {
		double valor;
                String aux;
                Banco_Frame.play("valorDeposito");
		aux = JOptionPane.showInputDialog(null, "Valor de Deposito: ");
		valor = Double.parseDouble(aux);
		saldo_corrente = saldo_corrente + valor;
		transacoes.add("Deposito: +" + valor);
                Banco_Frame.play("depositoSucesso");
		return saldo_corrente;
	}
	
	//Função para exibir o saldo da conta corrente
	public static void saldo() {
            Banco_Frame.play("saldoInformacao");
            System.out.println("Saldo: " + ContaCorrente.saldo_corrente);
	}
        
        //Função para exibir o extrato da conta corrente
	public static void extrato() {
		int n = transacoes.size();

                System.out.printf("\n");
		for(int i=0; i<n; i++) {
			System.out.printf("%s\n", transacoes.get(i));
		}
		System.out.println("Saldo Conta Corrente: " + ContaCorrente.saldo_corrente);
                Banco_Frame.play("eInformacao");
	}
	
}