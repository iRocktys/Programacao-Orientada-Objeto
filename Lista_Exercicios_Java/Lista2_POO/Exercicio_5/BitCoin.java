package Exercicio_5;

public class BitCoin implements IConversorMoeda{
	private double conversao, moeda, umAno = 53555.02, lucro;
	
	public BitCoin(double moeda) {
		this.moeda = moeda;
	}
	
	public double getConversaoDolar() {
		this.conversao = this.moeda*39747.69;
		LucroEmAno();
		System.out.printf(" | %.2f BitCoin --> $", this.moeda);
		return this.conversao;
	}
	
	public void LucroEmAno() {
		this.lucro = (this.umAno - 39747.69)*this.moeda;
		System.out.printf("Lucro Bitcoin 2021: %.2f", this.lucro);
		
	}

}
