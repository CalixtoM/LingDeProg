import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		double n = 0;
		System.out.print("Digite o limite superior: ");
		n = in.nextDouble();
		for(int i = 0; i<n; i+=2){
			System.out.println(i);
		}
	} 
}