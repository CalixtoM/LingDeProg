/**
 * 
 */
package AulaSubprogramas;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escolhe a opera��o que deseja: \n 1) Adi��o \n 2) Subtra��o \n 3) Divis�o \n 4) Multiplica��o");
		int opc = in.nextInt();
		System.out.print("Digite o primeiro n�mero: ");
		float p1 = in.nextFloat();
		System.out.print("Digite o segundo n�mero: ");
		float p2 = in.nextFloat();
		if(opc == 1) {
			float resultado = somar(p1, p2);
			System.out.printf("Soma: %.2f\n", resultado);
			in.close();
		}
		else if(opc == 2) {
			float resultado = subtrair(p1, p2);
			System.out.printf("Subtra��o: %.2f\n", resultado);
			in.close();
		}
		
		else if(opc == 3) {
			float resultado = dividir(p1, p2);
			System.out.printf("Divis�o: %.2f\n", resultado);
			in.close();
		}
		else if(opc == 4) {
			float resultado = multiplicar(p1, p2);
			System.out.printf("Multiplica��o: %.2f\n", resultado);
			in.close();
		}
	}
	
	private static float somar(float p1, float p2) {
		float resultado = (p1 + p2);
		return resultado;
	}
	
	private static float subtrair(float p1, float p2) {
		float resultado = (p1 - p2);
		return resultado;
	}
	
	private static float dividir(float p1, float p2) {
		float resultado = (p1 / p2);
		return resultado;
	}
	
	private static float multiplicar(float p1, float p2) {
		float resultado = (p1 * p2);
		return resultado;
	}

}
