import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade de numeros: ");
        int n = in.nextInt();
        int [] ti = new int [n];
        int [] ult = new int [n];
        int result = 0;
        for(int i = 0; i < ti.length; i++){
            System.out.print("Digite um numero: ");
            ti[i] = in.nextInt();
            ult[i] = ti[i]%10;
            ti[i] = ti[i] - ult[i];
            ti[i] = ti[i] / 10;
            ti[i] = (int) Math.pow(ti[i] , ult[i]);
        }
		for(int i = 0; i < ti.length; i++){
            result = result+ti[i];
        }
        System.out.print(result);
    }
}