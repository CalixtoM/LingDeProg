import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);
        System.out.println("Informe o lado 1: ");
        double l1 = in.nextDouble();
        System.out.println("Informe o lado 2: ");
        double l2 = in.nextDouble();
        System.out.println("Informe o lado 3: ");
        double l3 = in.nextDouble();
        if(l1 < (l2+l3) || l2< (l3+l1) || l3 < (l1+l2)){
            if(l1 == l2 && l2 == l3){
                System.out.println("Equilátero");
            }
            else if(l1 == l2 && l2 != l3 || l3 == l2 && l2 != l1){
                System.out.println("Isoceles");   
            }
            else if(l1 != l2 && l2 != l3 && l3 != l1){
                System.out.println("Escaleno");   
            }
        }
        else{
            System.out.println("Não é triangulo");
        }
        
    } 
}