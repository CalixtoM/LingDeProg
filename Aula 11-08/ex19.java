import java.util.Scanner;

class Main {  
  public static void main(String[] args) { 
    Scanner in = new Scanner (System.in);
        System.out.println("Informe o peso: ");
        double p = in.nextDouble();
        System.out.println("Informe a altura: ");
        double a = in.nextDouble();
        double imc = p/(a*a);
        if(imc<20) {
            System.out.println("Abaixo");
        }
        else if(imc>=20 && imc<=25) {
            System.out.println("Normal");
        }
        else if(imc>25 && imc<=30) {
            System.out.println("Excesso");
        }
        else if(imc>30 && imc<=35) {
            System.out.println("Obesidade");
        }
        else{
            System.out.println("Obesidade Mórbida");
        }
    } 
}