import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		System.out.print("Informe a quantidade de números: ");
  		int n = in.nextInt();
  		int [] nums = new int[n];
  		for(int i = 0; i < nums.length; i++) {
  			System.out.print("Insira um número: ");
  			nums[i] = in.nextInt();
  		}

  		for(int x : nums){
  			if(x > 0){
  				System.out.println(x);  				
  			}
  		}

		
	} 
}