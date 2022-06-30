/*
 Exercicio <3>
 Autor(es): <Leandro Martins Tosta> e <Gustavo Tamião>
 Data: <03/05/2022>
*/ 

package Exercicio_3;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Administrativo obj1 = new Administrativo("Joao", 2000);
		Bolsista obj2 = new Bolsista("Leandro", 600);
		Professor obj3 = new Professor("Lucio", 10000);
		Tecnico obj4 = new Tecnico("Tiao", 1500);
		
		List <MembroUniversidade> lista = new ArrayList<>();
		
		lista.add(obj1);
		lista.add(obj2);
		lista.add(obj3);
		lista.add(obj4);
		
		for(MembroUniversidade universidade: lista)
			System.out.println(universidade);
	}

}
