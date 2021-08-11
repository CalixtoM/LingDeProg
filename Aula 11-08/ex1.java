import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);
        System.out.println("digite a primeira nota: ");
        double n1 = in.nextDouble();
        System.out.print("digite a segunda nota: ");
        double n2 = in.nextDouble();
        double m = (n1+n2)/2;
        
        if(m >= 6){
            System.out.print("aprovado");
        }
        else{
            System.out.print("Reprovado");
        }
    } 
}