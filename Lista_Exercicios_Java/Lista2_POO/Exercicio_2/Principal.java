/*
 Exercicio <2>
 Autor(es): <Leandro Martins Tosta> e <Gustavo Tamião>
 Data: <03/05/2022>
*/ 

package Exercicio_2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		List <Animal> lista = new ArrayList<>();
		
		Sapo sapo = new Sapo("Cururu", "pouco", true);
		Ra perereca = new Ra("Perereca", "pouco", false);
		Felino leao = new Felino("Leao", "Pouco", "Marrom");
		Mamifero macaco = new Mamifero("Macaco", "Pouco", "Preto");
		Ave ganso = new Ave("Ganso", "Branco");
		
		lista.add(sapo);
		lista.add(perereca);
		lista.add(leao);
		lista.add(macaco);
		lista.add(ganso);
		
		for(Animal animal : lista)
			System.out.println(animal);


	}

}
