/*  Escreva uma programa em Java que use
 um método que recebe um valor inteiro 
 positivo como parâmetro e devolve 
 verdadeiro se o número for par, ou falso
  se o número for ímpar. */

  	import java.util.Scanner;

	class Main {  
    	public static void main(String args[]) { 
		Scanner in = new Scanner(System.in);
        System.out.print("informe um valor inteiro: ");
        int v = in.nextInt();
        String check = verificarPar(v);
        System.out.print(check);
        in.close();
    }

    	private static boolean verificarPar(int v){		
       		
       		return (v % 2 == 0);

    	}
  }

