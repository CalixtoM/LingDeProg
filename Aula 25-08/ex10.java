import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		double n;
  		System.out.print("Digite um número: ");
  		n = in.nextDouble();
		for(double i = n; i>=0; i--){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
	} 
}