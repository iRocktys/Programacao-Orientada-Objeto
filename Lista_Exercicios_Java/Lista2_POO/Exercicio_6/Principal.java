/*
 Exercicio <6>
 Autor(es): <Leandro Martins Tosta> e <Gustavo Tamião>
 Data: <03/05/2022>
*/ 

package Exercicio_6;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Empregado> lista = new ArrayList<>();
		
		Bonificado b1 = new Bonificado("Joao","Silva", 1500, 150, 200);
		Comissionado c1 = new Comissionado("Maria","Soares", 1500, 10); 
		Horista h1 = new Horista("Jomar","Silva Soares", 1500, 10); 

		lista.add(b1);
		lista.add(c1);
		lista.add(h1);
		
		for ( Empregado emp : lista ) {
			 emp.imprimir();
			 emp.ganhos();
		}

	}

}
