package TrabalhosAlvaro;

import java.util.Scanner;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0506 {
    public static void main(String[] a){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String[] nomeCompleto = s.nextLine().split("\\s");

        for(int x = 0; x < 2; x++){ System.out.print(nomeCompleto[x].charAt(0)); }

    }
}
