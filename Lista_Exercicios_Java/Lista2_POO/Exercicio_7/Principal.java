/*
 Exercicio <7>
 Autor(es): <Leandro Martins Tosta> e <Gustavo Tamião>
 Data: <03/05/2022>
*/ 

package Exercicio_7;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		List <IOperacao> lista = new ArrayList<>();
		
		Soma soma = new Soma(10f, 20f);
		Subtracao sub = new Subtracao(10f, 20f);
		Divisao div = new Divisao(10f, 20f);
		Multiplicacao mult = new Multiplicacao(10f, 20f);
		
		lista.add(soma);
		lista.add(sub);
		lista.add(mult);
		lista.add(div);
		
		for(IOperacao CM : lista)
			System.out.println(CM.getNome() + CM.getResultado());
	}

}
