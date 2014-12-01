package TrabalhosAlvaro;

import javax.swing.*;
import java.util.Random;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0512 {
    public static void main(String[] a){

        Random r = new Random();
        double numeroSorteado = r.nextDouble() * 10;
        char sorteio = (char) ((numeroSorteado * (90 - 65)) + 65);

        System.out.println("Numero sorteado é " + numeroSorteado);
        System.out.print("Proximo character é " + sorteio);

    }
}
