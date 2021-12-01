/**
 * 
 */
package AulaString;

import java.util.Scanner;

/**
 * @author oi
 *
 */
public class Nomevirgula {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String pnome = "";
		String unome = "";
		System.out.println("Digite seu nome completo: ");
		String nome = in.nextLine();
		String[] array = nome.split(" ");
		for(int i = 0; i <= array.length - 1; i++) {
			if(i == 0) {
				pnome = array[i];
			}
			else if(i == array.length - 1) {
				unome = array[i];
			}
		}
		System.out.println("resultado: " .concat(unome) .concat(", ") .concat(pnome));
	}

}
