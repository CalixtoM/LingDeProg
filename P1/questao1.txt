import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		System.out.print("Insira o melhor resultado obtido na prova da Olimpiada: ");
  		int r = in.nextInt();
  		System.out.print("Insira o recorde mundial da prova: ");
  		int m = in.nextInt();
  		System.out.print("Insira o recorde olimpico da prova: ");
  		int l = in.nextInt();

  		if(r < m){
  			System.out.println("RM");
  		}
  		else{
  			System.out.println("*");
  		}

  		if(r < l){
  			System.out.println("RO");
  		}

  		else{
  			System.out.println("*");
  		}
	} 
}