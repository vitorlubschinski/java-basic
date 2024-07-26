public class App {
    public static void main(String[] args)  {
        //----------aritméticos-----------
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) * (20 / 4);

        //---------unários---------------
        int x = 5;
        int y = -x; // y é -5

        boolean a = true;
        boolean b = !a; // b é false

        int c = 3;
        int d = ++c; // c é incrementado para 4, d é 4

        int e = 3;
        int f = e++; // f é 3, e é incrementado para 4

        //---------ternário-------------------
        int idade = 20;
        String categoria = (idade >= 18) ? "Adulto" : "Menor";
        System.out.println(categoria);  // Saída: Adulto

        //---------relacionais-----------------
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é IGUAL a numeroDois" + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é DIFERENTE a numeroDois" + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é MAIOR a numeroDois" + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numeroUm é MAIOR OU IGUAL a numeroDois" + simNao);

        simNao = numero1 < numero2;
        System.out.println("numeroUm é MENOR a numeroDois" + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numeroUm é MENOR OU IGUAL a numeroDois" + simNao);


        //-------Lógicos-----------
        boolean condicao1 = true;
        boolean condicao2 = true;
        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        } //retorna true

        boolean condicao1 = true;
        boolean condicao2 = false;
        if(condicao1 || condicao2){
            System.out.println("uma das duas condições são verdadeiras");
        } //retorna true
    }
    }
}
