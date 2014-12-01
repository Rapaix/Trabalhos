package AulasEtemb;

import java.util.Scanner;

/**
 * Created by luisportugal on 25/11/14.
 */
public class CEP {
    public static void main(String[] a){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um CEP...");
        String cep = scanner.nextLine();
        String novoCep = "";

        for(int x = 0; x < 8; x++){
            if(x == 5){ novoCep += "-"; }
            novoCep += cep.charAt(x);
        }
        System.out.print("Seu novo Cep: " + novoCep);
    }
}
