/**
 * 
 */
package AulaString;
import java.util.Scanner;

/**
 * @author oi
 *
 */
public class Traspfrente {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Escreva uma frase de tras p frente");
		String str1 = in.nextLine();
		int contStr = str1.length();
		String[] array = str1.split(" ");
		/* Exibir palavra de tras p frente */
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		/* Exibir letra de tras p frente */
		for(int j = contStr - 1; j>= 0; j--) {
			System.out.print(str1.charAt(j));
		}
	}

}
