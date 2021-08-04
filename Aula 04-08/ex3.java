import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);

		System.out.print("informe o valor de R: ");  
		double r = in.nextDouble();
		
		double d = 2*r;
		double a = Math.PI * Math.pow(r, 2);
		double c = 2 * Math.PI * r;

	  	System.out.println("Diametro: " +d + " area: " +a+ " Circunferencia: "+c);
  	} 
}