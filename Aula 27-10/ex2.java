import java.util.Scanner;

public class calc {

	public static void main(String[] args){

		Scanner in = new Scanner (System.in);
		System.out.print("informe o valor antigo: ");
		double a = in.nextDouble();
		System.out.print("informe o valor novo: ");
		double n = in.nextDouble();

		calc(a, n);

	}

	public static void calc(int a, int b) {

		int aux = a;
		a = b;
		b = aux;
	}
}