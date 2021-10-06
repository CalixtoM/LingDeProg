import java.util.Scanner;

class Main {  
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();

        for(int i = st.length(); i >= 0; i--){
            System.out.print(st.charAt(0));
        }
    } 
}