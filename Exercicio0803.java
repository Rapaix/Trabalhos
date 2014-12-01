package TrabalhosAlvaro;

import AulasEtemb.Mascara;

import javax.swing.*;

/**
 * Created by luisportugal on 25/11/14.
 */

public class Exercicio0803 {
    public static void main(String[] a){

        while ( true ){
                String cpf = JOptionPane.showInputDialog("Digite seu fatorial: ");
            if ( cpf == null ) System.exit(0);

            if (!cpf.matches("")) {
                JOptionPane.showMessageDialog(null, "Digite seu cpf com 11 digitos, somente números;", "", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            JOptionPane.showMessageDialog(null, "CPF informado: " + Mascara.mascaraValor(cpf, "###.###.###-##"));
            System.exit(0);
        }
    }
}


