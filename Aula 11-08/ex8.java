import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);
        System.out.println("digite um número: ");
        int n1 = in.nextInt();
        System.out.println("digite um número: ");
        int n2 = in.nextInt();
        System.out.println("digite um número: ");
        int n3 = in.nextInt();
        if(n1 < 0 && n2<0 && n3<0){
            System.out.println("Todos são negativos");
        }
        else if(n1 < 0 && n2>0 && n3>0){
            System.out.println(n1+ " é negativo");
        }
        else if(n2 < 0 && n1>0 && n3>0){
            System.out.println(n2+ " é negativo");
        }
        else if(n3 < 0 && n2>0 && n1>0){
            System.out.println(n3+ " é negativo");
        }
        else if(n1 < 0 && n2<0 && n3>0){
            System.out.println(n1+"e "+n2+" são negativos");
        }
        else if(n1 < 0 && n2>0 && n3<0){
            System.out.println(n1+"e "+n3+" são negativos");
        }
        else if(n1 > 0 && n2<0 && n3<0){
            System.out.println(n2+"e "+n3+" são negativos");
        }
    } 
}