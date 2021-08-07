import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);

	  	System.out.print("Informe o valor gasto: ");
	  	double vg = in.nextDouble();
	  	double g = vg*0,10;

	  	System.out.println("Gorjeta: "+g);
  	} 
}