import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);

		System.out.print("informe a nota 1: ");  
		double n1 = in.nextDouble();
		
		System.out.print("informe a nota 2: ");  
		double n2 = in.nextDouble();

	  	System.out.println("A média é: " + (n1+n2)/2);
  	} 
}