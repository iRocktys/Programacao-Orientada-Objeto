/*
 Exercicio <9>
 Autor(es): <Leandro Martins Tosta> e <Gustavo Tamião>
 Data: <03/05/2022>
*/ 

package Exercicio_9;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Principal {
	private static Scanner leitor;
	private static List<Object> lista;
	private static BufferedReader arquivo;

	public Principal() {
	}
	
	public static void excecao(int A, int B) {
		setArquivo(arquivo);
		setLista(new ArrayList<Object>());
		setLista(null);
		float result = 0;
		 
		try {
			setArquivo(new BufferedReader(new FileReader("TEXTO")));	
		} catch (IOException e) {
			System.out.println("\nError 4:20 - Entrada e Saida de arquivo invalida");
			try {
				
			} catch (NullPointerException p) {
				System.out.println("\nError 4:20 - NullPointerException - Objeto Indefinido");
				
				try {
					if(A == 0) throw new ExceptionA();
		        	if(B == 0) throw new ExceptionB();
		        	
		            result = (float) (1/Math.sqrt(Math.pow(A,2) * Math.pow(B,2)));
		            
		            System.out.printf("\nResultado: "+ result);
		            
				} catch(ExceptionB y){
					System.out.println(y.getMessage());
					
				} catch(ExceptionA y){
					System.out.println(y.getMessage());
				}
			}	
		}
	}

	public static void main(String[] args) {
		leitor = new Scanner( System.in );
	       
		System.out.printf("Valor A: " );
		int A = leitor.nextInt();

		System.out.printf("Valor B: ");
		int B = leitor.nextInt();

		excecao(A, B);
	}

	public static BufferedReader getArquivo() {
		return arquivo;
	}

	public static void setArquivo(BufferedReader arquivo) {
		Principal.arquivo = arquivo;
	}

	public static List<Object> getLista() {
		return lista;
	}

	public static void setLista(List<Object> lista) {
		Principal.lista = lista;
	}

}
