package TrabalhosAlvaro;

import java.util.Scanner;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0504 {
    public static void main(String[] a){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nomeUm = new String(s.nextLine());

        System.out.println("Digite o nome para comparação: ");
        String nomeDois = new String(s.nextLine());

        System.out.println("\n" + nomeUm.equalsIgnoreCase(nomeDois));

    }
}
