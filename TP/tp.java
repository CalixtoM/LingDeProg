/* 
TP LOGICA DE PROGRAMAÇÃO
GRUPO:
	ERIC KIDA MENESES CORREA
	GABRIEL DOS SANTOS SANTANA
	MATHEUS CALIXTO DE OLIVEIRA

A primeira linha da entrada consiste de quatro inteiros:  N  (1 ≤  N≤ 200), que é o número de 
participantes, O(1 ≤ O≤ 500000), que é o orçamento, H (1 ≤ H≤ 18), que é o número de hotéis a 
considerar, e S (1 ≤ S≤ 13), que é o número de semanas que você pode escolher. Em seguida, há duas 
linhas para cada um dos H hotéis. A primeira linha fornece um   inteiro P (1 ≤ P≤ 10000), que é o 
preço por uma pessoa se hospedar no fim de semana no hotel. A segunda linha contém S inteiros 
Ci (0 ≤ Ci≤ 1000, para 1 ≤ i ≤ S), que é o número de camas disponíveis para cada fim de semana no
hotel.

*/
import java.util.Arrays;
import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		int n; //numero de participantes
  		int o; //orcamento
  		int h; //hoteis
  		int s; //semanas
  		// int[][] precoCama = new int[h][h];
  		

  		System.out.print("Digite o número de participantes: ");
  		n = in.nextInt();
		System.out.print("Digite o orçamento disponivel: ");
		o = in.nextInt();
		System.out.print("Digite o número de hotéis a considerar: ");
		h = in.nextInt();
		System.out.print("Digite o número de semanas a escolher: ");
		s = in.nextInt();
		int[] p = new int[h]; //preco por uma pessoa
		int[][] ci = new int[h][s]; //camas disponiveis
		int custo = 0; //camas disponiveis
		

		for(int i = 0; i < h; i++){
			System.out.print("Informe o valor por uma pessoa se hospedar no fim de semana no hotel "+i+1+": ");
			p[i]= in.nextInt();
			for(int j = 0; j < s; j++){
				System.out.print("Informe o numero de camas disponiveis na semana "+j+1+": ");
				ci[i][j] = in.nextInt();
			}
		}

		/*for(int k = 0; k < h; k++){
			int custo = p[k] * n;
			System.out.println(custo);
		}*/

		for(int i = 0; i < h; i++){
			for(int j = 0; j < s; j++){				
				if( ci[i][j] >= n){
					if((p[i] * n) < custo || custo == 0){
						custo = p[i] * n;
					}
				}
				
			}
		}


		
		if(custo <= o && custo > 0){
			System.out.println(custo);	
		}
		else{
			System.out.println("Fique em casa");	
		}
	} 
}

/* for(int i = 0; i< custo.length; i++){
			if(custo[i] < o){
				System.out.println(custo[i]);	
			}
			
		}
*/		