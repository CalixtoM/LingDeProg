import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);
        System.out.println("Informe a idade: ");
        int id = in.nextInt();
        if(id < 16){
            System.out.println("Não pode votar");
        }
        else if(id >= 16 && id<18){
            System.out.println("Facultativo");
        }
        else {
            System.out.println("Obrigatório");
        }
    } 
}