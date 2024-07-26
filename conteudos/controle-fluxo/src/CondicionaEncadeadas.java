import java.util.Scanner;

public class CondicionaEncadeadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua nota:");
        int nota = sc.nextInt();

        if (nota >=7) 
            System.out.println("APROVADO");
        else if(nota >= 5 && nota <7)
            System.out.println("RECUPERAÇÃO");
        else 
            System.out.println("REPROVADO");

        
    }
}
