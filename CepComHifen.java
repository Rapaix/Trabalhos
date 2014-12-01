package TrabalhosAlvaro;
import java.util.Scanner;
/**
 * Created by luisportugal on 26/11/14.
 */
public class CepComHifen {

    public static void main(String args[]){

       Scanner Cep = new Scanner(System.in);
        System.out.print("digite o Cep sem hifen");
        String  cep1 = Cep.nextLine();
        String CEP = cep1.substring(0,5)+"-";
         System.out.print(CEP);
        System.out.print(cep1.substring(5));
    }
}
