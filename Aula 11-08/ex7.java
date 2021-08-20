import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);
        System.out.println("digite um número: ");
        int n1 = in.nextInt();
        System.out.println("digite um número: ");
        int n2 = in.nextInt();
        if(n1 == n2){
            System.out.println("Iguais");
        }
        else if(n1 > n2){
            System.out.println(n1+", "+n2);
        }
    } 
}