import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);
        System.out.print("informe o valor do saldo: ");
        double s = in.nextDouble();
        if(s <= 1000){
            double c = s*0.75;
            System.out.print("Credito: "+c);
        }
        else if(s > 1000 && s <= 3000){
            double c = s;
            System.out.print("Credito: "+c);
        }
        else if(s > 3000 && s <= 5000){
            double c = s*1.5;
            System.out.print("Credito: "+c);
        }
        else{
            double c = s*2;
            System.out.print("Credito: "+c);
        }
        
    } 
}