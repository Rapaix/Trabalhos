package TrabalhosAlvaro;

import java.util.Scanner;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0507 {
    public static void main(String[] a){

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = s.nextDouble();

        System.out.println("Raiz Quadrada de" + numero + " = " + Math.sqrt(numero));

    }
}
