/*
 Classe criada com intuito de exibir o status do bolsista, ou seja,
 dependendo do valor do pagamento, esta classe coloca o status de bolsista
 remunerado ou voluntario. 
 */

package Exercicio_4;

public class Status extends MembroUniversidade{
	private String status;
	
	public Status() {
		super();
	}
	
	public Status(float pagamento) {
		super(pagamento);
		
		if(pagamento == 0) {
			setStatus("Voluntario");
		}else {
			setStatus("Remunerado");
		}
	}
	
	//Metodos acessor e mutador
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
