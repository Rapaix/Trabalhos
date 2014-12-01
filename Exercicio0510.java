package TrabalhosAlvaro;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0510 {
    public static void main(String[] a){

        Scanner s = new Scanner(System.in);

        System.out.print("informe o limite do sorteio: ");
        int numero = s.nextInt();

        Random r = new Random();
        System.out.println("Numero sorteado: " + r.nextInt(numero));

    }
}
