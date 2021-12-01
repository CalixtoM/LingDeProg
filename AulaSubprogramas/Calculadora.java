/**
 * 
 */
package AulaSubprogramas;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escolhe a operação que deseja: \n 1) Adição \n 2) Subtração \n 3) Divisão \n 4) Multiplicação");
		int opc = in.nextInt();
		System.out.print("Digite o primeiro número: ");
		float p1 = in.nextFloat();
		System.out.print("Digite o segundo número: ");
		float p2 = in.nextFloat();
		if(opc == 1) {
			float resultado = somar(p1, p2);
			System.out.printf("Soma: %.2f\n", resultado);
			in.close();
		}
		else if(opc == 2) {
			float resultado = subtrair(p1, p2);
			System.out.printf("Subtração: %.2f\n", resultado);
			in.close();
		}
		
		else if(opc == 3) {
			float resultado = dividir(p1, p2);
			System.out.printf("Divisão: %.2f\n", resultado);
			in.close();
		}
		else if(opc == 4) {
			float resultado = multiplicar(p1, p2);
			System.out.printf("Multiplicação: %.2f\n", resultado);
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
