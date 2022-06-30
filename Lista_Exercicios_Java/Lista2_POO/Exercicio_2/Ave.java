/*
 	Nova classe adicionada com proposito de incluir a categoria das aves.
 */

package Exercicio_2;

public class Ave extends Animal{
	private String corPenas;
	
	public Ave(String nome, String corPenas) {
		super(nome);
		this.corPenas = corPenas;
	}
	
	public String getCorPenas() {
		return this.corPenas;
	}
	
	public String toString() {
		return "Nome: " + getNome() +
				"\nCor Penas: " + getCorPenas() + "\n";
	}
}
