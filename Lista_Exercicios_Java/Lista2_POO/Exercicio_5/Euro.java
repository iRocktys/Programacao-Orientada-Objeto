package Exercicio_5;

public class Euro implements IConversorMoeda{
	private double conversao, moeda, diferenca;
	
	public Euro(double moeda) {
		this.moeda = moeda;
	}
	
	public double getConversaoDolar() {
		this.conversao = this.moeda/1.05;
		this.diferenca = (1.05 - this.moeda);
		System.out.printf("%.2f Diferenca de valor em 2022 | ", this.diferenca);
		System.out.printf("€ %.2f --> $", this.moeda);
		return this.conversao;
	}

}
