package AulasEtemb;

import java.util.Scanner;

/**
 * Created by luisportugal on 25/11/14.
 */
public class CPF {

    public static void main(String[] a){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua mascara: ");
        String mascaraValor = scanner.nextLine();

        System.out.print("Digite seu valor: ");
        String valor = scanner.nextLine();

        System.out.print(Mascara.mascaraValor(valor, mascaraValor));
    }

}
