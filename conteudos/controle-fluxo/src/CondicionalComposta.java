import java.util.Scanner;

public class CondicionalComposta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua nota:");
        int nota = sc.nextInt();

        if (nota >=7) 
            System.out.println("APROVADO");
        else 
            System.out.println("REPROVADO");
        
    }
}
