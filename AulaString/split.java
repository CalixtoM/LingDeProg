/**
 * 
 */
package AulaString;
import java.util.Scanner;


/**
 * @author Matheus
 *
 */
public class split {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite qualquer coisa: ");
		String str = in.nextLine();
		String[] array = str.split(" ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
