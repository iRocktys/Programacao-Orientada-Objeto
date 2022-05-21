package banco;

import javax.swing.*;

public class Caixa extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String sn;
	private String nombre;

	public Caixa() {
		//Area 51
		super("CAIXA NADA ECONOMICA");
		
		cadastro();	
	}
	
	public void cadastro() {

		//Coletando inicial
		Banco_Frame.play("Conta");
		String conta = JOptionPane.showInputDialog(null, "Conta: ");
		Banco_Frame.play("Senha");
		setNombre(conta);
		String senha = JOptionPane.showInputDialog(null, "Senha: ");
		setSn(senha);
						
		//Criação conta corrente
		//Saldo da conta corrente pré-estabelecido a 2500
		ContaCorrente cliente =  new ContaCorrente(conta, senha, 2500);
		
	}
	
	public static void main(String[] args) {
		Caixa caixa = new Caixa();
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}