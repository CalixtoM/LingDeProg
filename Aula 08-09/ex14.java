import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		System.out.print("insira as proporções da matriz: ");
  		int n = in.nextInt();
  		int [][] m = new int [n][n];
  		for(int i = 0; i<m.length; i++){
  			for(int j = 0; j<m.length; j++){
  				System.out.print("Insira um número: ");
  				m[i][j] = in.nextInt();
  			}
  		}

  		System.out.print("escreva os elementos da diagonal principal: ");
  		for(int i = 0; i<m.length; i++){
  			System.out.println(m[i][i]);
  		}

  		System.out.print("escreva todos os elementos (com excecao da diagonal principal): ");
  		for(int i = 0; i<m.length; i++){
  			for(int j = 0; j<m.length; j++){
  				if(i != j){
  					System.out.println(m[i][j]);
  				}
  			}
  		}


  		System.out.print("escreva os elementos da diagonal secundaria: ");
  		for(int i = 0; i<m.length; i++){
  			for(int j = 0; j<m.length; j++){
  				if(i ==(j-1)){
  					System.out.println(m[i][j]);
  				}  				
  			}

  		}
	} 
}