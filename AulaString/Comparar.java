/**
 * 
 */
package AulaString;

import java.util.Scanner;

/**
 * @author oi
 *
 */
public class Comparar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite qualquer coisa: ");
		String str1 = in.nextLine();
		System.out.println("Digite qualquer coisa2: ");
		String str2 = in.nextLine();
		System.out.print("Comparação: " + str1.compareToIgnoreCase(str2));
	}

}
