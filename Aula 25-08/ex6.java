import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		double n = 0;
		do {
			System.out.print("digite um numero: ");
			n = in.nextDouble();
			System.out.println(n*n);
		}while (n != 0);
		System.out.print("FIM!!");
	} 
}