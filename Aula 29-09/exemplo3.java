import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        String [] nomes = st.split(" ");

        for(int i = nomes.length - 1; i >= 0; i--){
            if(i == nomes.length - 1){
                System.out.println(nomes[i]+", "+ nomes[0]);
            }
        }

    }

}