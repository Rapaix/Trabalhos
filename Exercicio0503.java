package TrabalhosAlvaro;

import java.util.Scanner;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0503 {
    public static void main(String[] a){

        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu CPF (Somente números): ");
        String cpf = s.next();
        String pattern = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})";

        String cpfComHifen = cpf.replaceAll(pattern, "$1.$2.$3-$4");
        System.out.println("Seu Novo CPF é: " + cpfComHifen);

    }
}
