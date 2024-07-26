import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INSIRA O TAMANHO:");
        String sigla = sc.next();

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
            break;
            case "G":
            System.out.println("Grande");
            break;
        
            default:
                System.out.println("Indefinido");
                break;
        }
    }
}
