import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		int [] n = new int[10];

		for(int i = 0; i<10; i++){
			System.out.println("digite um numero: ");
			n[i] = in.nextInt();
		}
		for(int i = 0; i<=9; i--){
			System.out.println(n[i]);

			if(n[i] % 2 = 0){
				System.out.println("Par");
			}
			else{
				System.out.println("Impar");
			}
		}
	} 
}