package Exercicio_5;

public class Real implements IConversorMoeda{
	private double conversao, moeda, comercial;
	
	public Real(double moeda) {
		this.moeda = moeda;
	}
	
	public double getConversaoDolar() {
		this.conversao = this.moeda/4.94;
		this.comercial = this.moeda/4.99;
		System.out.printf("Valor Comercial: %.3f | ", this.comercial);
		System.out.printf("R$ %.2f --> $", this.moeda);
		return this.conversao;
	}

}
