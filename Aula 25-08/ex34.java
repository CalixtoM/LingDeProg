import java.util.Scanner;
class Main {  
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int f = 0;
        int r = 0;

        System.out.print("digite a area de abertura: ");
        a = in.nextInt();
        System.out.print("digite as estrelas a serem estudadas: ");
        n = in.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print("digite o fluxo de fotons: ");
            f = in.nextInt();

            if ((a * f) >= 40000000) {
                r += 1;
            }
        }
        System.out.print(r);
    } 
}