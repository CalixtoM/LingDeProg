import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String st1 = in.nextLine();
        String st2 = in.nextLine();

        int res = st1.compareToIgnoreCase(st2);

        if (res < 0) {
            System.out.println("\n"+st1);
            System.out.println(st2);
        } else {

            System.out.println("\n"+st2);
            System.out.println(st1);
        }
    }

}