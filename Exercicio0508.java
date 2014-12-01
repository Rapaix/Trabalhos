package TrabalhosAlvaro;

import java.util.Scanner;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0508 {
    public static void main(String[] a){

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = s.nextDouble();

        System.out.print("Digite um expoente: ");
        double expoente = s.nextDouble();

        double resultado = Math.pow(numero, expoente);
        System.out.println("Resultado: " + resultado);
    }
}
