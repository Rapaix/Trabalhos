package TrabalhosAlvaro;

import java.util.Scanner;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0509 {
    public static void main(String[] a){

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o diametro da Circuferencia: ");
        double diametro = s.nextDouble();

        double raio = diametro / 2;
        double circunferencia = diametro * Math.PI;
        double area = Math.PI * Math.pow(raio, 2);

        String resultado = "\nDados do Circulo" +
                "\n\t- Raio: " + raio +
                " metros\n\t- Circunferencia: " + circunferencia +
                " metros\n\t- Área: " + area + " metros²";

        System.out.println(resultado);
    }
}
