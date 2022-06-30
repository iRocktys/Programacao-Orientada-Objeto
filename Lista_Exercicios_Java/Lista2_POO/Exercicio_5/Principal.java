/*
 Exercicio <5>
 Autor(es): <Leandro Martins Tosta> e <Gustavo Tamião>
 Data: <03/05/2022>
*/ 

package Exercicio_5;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		List <IConversorMoeda> lista = new ArrayList<>();
		
		BitCoin conversao1 = new BitCoin(3);
		Real conversao2 = new Real(1);
		Euro conversao3 = new Euro(1);
		
		lista.add(conversao1);
		lista.add(conversao2);
		lista.add(conversao3);
		
		System.out.println("----- CONVERSAO -----");
		
		for(IConversorMoeda conversor: lista)
			System.out.println(conversor.getConversaoDolar());

	}

}
