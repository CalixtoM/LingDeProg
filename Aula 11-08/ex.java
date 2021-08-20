import java.util.Scanner;
public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println("Informe o dia de nascimento: ");
            int d = in.nextInt();
            System.out.println("Informe o mês de nascimento: ");
            int m = in.nextInt();
            System.out.println("Informe o ano de nascimento: ");
            int a = in.nextInt();
            string res;
            switch (m) {
                case '1':
                    string res = d+"/janeiro/"+ano;
                    break;
                case '2':
                    string res = d+"/fevereiro/"+ano;
                    break;
                case '3':
                    string res = d+"/março/"+ano;
                    break;
                case '4':
                    string res = d+"/abril/"+ano;
                    break;
                case '5':
                    string res = d+"/maio/"+ano;
                    break;
                case '6':
                    string res = d+"/junho/"+ano;
                    break;
                case '7':
                    string res = d+"/julho/"+ano;
                    break;
                default:
                    string res = "Inválido";
            }
                System.out.println("Dia da semana: " + res);
    }
}
    