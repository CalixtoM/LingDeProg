import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		System.out.print("Digite o número de mercadorias: ");
  		int num_merc = in.nextInt();
  		
  		int m10 = 0;
  		int m10m20 = 0;
  		int m20 = 0;

  		double [] compra = new double [num_merc];
  		double [] venda = new double [num_merc];

  		for(int i = 0; i<compra.length; i++) {
  			System.out.print("Insira o valor de compra da mercadoria "+(i+1)+": ");
  			compra[i] = in.nextDouble();
  		}

  		for(int i = 0; i<venda.length; i++) {
  			System.out.print("Insira o valor de venda da mercadoria "+(i+1)+": ");
  			venda[i] = in.nextDouble();
  		}

  		for(int i = 0; i<venda.length; i++) {
  			if(venda[i] < (compra[i] + (compra[i]*0.1))){
  				m10 ++;
  			}
  			else if(venda[i] >= (compra[i] + (compra[i]*0.1)) && venda[i] <= (compra[i] + (compra[i]*0.2))){
  				m10m20 ++;
  			}
  			else{
  				m20 ++;
  			}
  		}

  		System.out.println(m10+", "+ m10m20 +", "+ m20);

	} 
}