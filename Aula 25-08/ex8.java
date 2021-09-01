import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		double n = 0;
  		double p = 0;
		System.out.print("Digite um número: ");
		n = in.nextDouble();
		System.out.print("Digite um número para potência: ");
		double k = in.nextDouble();
		for(int i = 2; i<=k; i++){
			if(p == 0){
				p = n * n;

			}
			else{
				p = p * n;	
			}
		}
		System.out.println(p);
	} 
}