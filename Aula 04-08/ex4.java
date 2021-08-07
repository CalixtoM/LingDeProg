import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);

	  	System.out.print("Informe o raio da base do cone: ");
	  	double r = in.nextDouble();
	  	System.out.print("Informe a altura: ");
	  	double h = in.nextDouble();

	  	double v = (Math.PI * Math.pow(r, 2) * h)/3;

	  	System.out.println("Volume: "+v);
  	} 
}