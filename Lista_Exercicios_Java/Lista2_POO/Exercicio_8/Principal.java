/*
 Exercicio <8>
 Autor(es): <Leandro Martins Tosta> e <Gustavo Tamião>
 Data: <03/05/2022>
*/ 

package Exercicio_8;

import java.util.Scanner;

public class Principal {
	private static Scanner sc;

	public Principal() {
		
	}

	public static void main(String[] args) {
		
        sc = new Scanner(System.in);
        float result;
        
        System.out.printf("Valor A: ");
        int A = sc.nextInt();

        System.out.printf("Valor B: ");
        int B = sc.nextInt();

        System.out.print("Valor C: " );
        int C = sc.nextInt();
        
        try {
        	if(A == 0) throw new ExceptionA();
        	
        	if(B == 0) throw new ExceptionB();
        	
        	if(C == 0) throw new ExceptionC();
        
           result = (float) (1 / Math.sqrt(Math.pow(A,2) * Math.pow(B,2) * Math.pow(C,2)));
           System.out.println("\nResultado: " + result);
           
        } catch(ExceptionC e){
        	System.out.println(e.getMessage());
        } catch(ExceptionB e){
        	System.out.println(e.getMessage());
        } catch(ExceptionA e){
        	System.out.println(e.getMessage());
        }	
		
	}

}
