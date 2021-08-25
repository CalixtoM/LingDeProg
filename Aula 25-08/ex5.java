import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.print("digite um numero: ");
			double n = in.nextDouble();
			System.out.println(n*n);
		}
	} 
}