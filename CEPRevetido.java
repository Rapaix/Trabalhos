package AulasEtemb;

import java.util.Scanner;

/**
 * Created by luisportugal on 25/11/14.
 */
public class CEPRevetido {
    public static void main(String[] a){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um CEP (Com Hifen)...");
        String cep = scanner.nextLine();
        String novoCep = "";

        for(int x = 0; x < 9; x++){
            if(x == 5){ continue; }
            novoCep += cep.charAt(x);
        }
        System.out.print("Seu novo Cep: " + novoCep);

    }
}
