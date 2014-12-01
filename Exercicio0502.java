package TrabalhosAlvaro;

import java.util.Scanner;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0502 {
    public static void main(String[] a){

        Scanner s = new Scanner(System.in);
        String cepHifen;

        System.out.print("Digite seu CEP (Com hifen): ");
        String cep = s.next();
        String pattern = "(\\d{5})+[-]+(\\d{3})";

        String cepComHifen = cep.replaceAll(pattern, "$1$2");
        System.out.println("Seu Novo CEP é: " + cepComHifen);

    }

}
