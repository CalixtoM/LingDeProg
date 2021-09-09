import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		System.out.print("Informe a quantidade de números");
  		int n = in.nextInt();
  		int [] num = new int[n];

		for(int i = 0; i<n; i++){
			System.out.println("digite um numero: ");
			num[i] = in.nextInt();
		}
		for(int i = n-1; i<=0; i--){
			System.out.println(num[i]);
		}
	} 
}