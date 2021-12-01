/**
 * 
 */
package AulaString;
import java.util.Scanner;

/**
 * @author Matheus
 *
 */
public class comprimento {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite qualquer coisa: ");
		String str = in.nextLine();
		System.out.println("Comprimento: " +str.length());
	}

}
