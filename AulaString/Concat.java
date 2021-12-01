/**
 * 
 */
package AulaString;
import java.util.Scanner;

/**
 * @author Matheus
 *
 */
public class Concat {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String str1 = in.nextLine();
		System.out.println("Digite seu sobrenome: ");
		String str2 = in.nextLine();
		System.out.println("Digite sua cidade: ");
		String str3 = in.nextLine();
		System.out.println("Nome completo e Cidade: " .concat(str1) .concat(" ") .concat(str2) .concat(" ") .concat(str3));
	}

}
