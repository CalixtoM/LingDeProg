import java.util.Scanner;
class Main {  
  	public static void main(String args[]) { 
  		Scanner in = new Scanner (System.in);
  		int disco = 0;
  		int dia = 0;
  		int mqntd = 0;

		for(int i = 1; i<=31; i++){
			System.out.println("dia "+i);
			System.out.print("Digite a qntd de discos: ");
			disco = in.nextInt();

			if(disco > mqntd){
				mqntd = disco;
				dia = i;
			}
		}
		System.out.print("Dia com mais vendas: "+dia+". Quantidade vendida no dia: "+mqntd);
	} 
}