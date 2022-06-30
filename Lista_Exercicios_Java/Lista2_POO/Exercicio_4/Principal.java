/*
 Exercicio <4>
 Autor(es): <Leandro Martins Tosta> e <Gustavo Tami�o>
 Data: <03/05/2022>
*/ 

package Exercicio_4;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Administrativo obj1 = new Administrativo("Joao", 2000);
		Bolsista obj2 = new Bolsista("Leandro", 600);
		Professor obj3 = new Professor("Lucio", 10000);
		Tecnico obj4 = new Tecnico("Tiao", 1500);
		Bolsista obj5 = new Bolsista("Gustavo", 0);
		
		List <MembroUniversidade> lista = new ArrayList<>();
		
		lista.add(obj1);
		lista.add(obj2);
		lista.add(obj3);
		lista.add(obj4);
		lista.add(obj5);
		
		for(MembroUniversidade universidade: lista)
			System.out.println(universidade);
	}

}
