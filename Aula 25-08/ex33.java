import java.util.Scanner;
class Main {  
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in);
        int leitura = 0;
        int maximo = 0;
        int pessoas = 0;
        String r = "N";

        System.out.print("digite o limite de pessoas: ");
        maximo = in.nextInt();
        System.out.print("digite o numero de leituras realizadas: ");
        leitura = in.nextInt();

        for(int i = 1; i<=leitura; i++){
            System.out.print("quantas pessoas sairam: ");
            int s = in.nextInt();
            System.out.print("quantas pessoas entraram: ");
            int e = in.nextInt();

            pessoas = (pessoas-s) + e;

            if(pessoas > maximo){
                r = "S";
            }
        }
        System.out.print(r);

    } 
}