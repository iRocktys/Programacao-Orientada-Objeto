package Exercicio_3;

public abstract class MembroUniversidade {
	private float pagamento;
	
	public MembroUniversidade() {
		setPagamento(0);
	}
	
	public MembroUniversidade(float pagamento) {
		setPagamento(pagamento);
	}
	
	//Metodos acessores e mutadores
	public float getPagamento() {
		return this.pagamento;
	}
	
	public void setPagamento(float pagamento) {
		this.pagamento = pagamento;
	}
	
	
}
