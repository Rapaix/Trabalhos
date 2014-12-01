package AulasEtemb;

import javax.swing.*;

/**
 * Created by luisportugal on 14/11/14.
 */
public class Exercicio_3 {

    public static void main(String[] a){

        char entradaUser = JOptionPane.showInputDialog("Digite um Caracter:").charAt(0);
        int character = entradaUser + 1;
        char desejado = (char) character;

        JOptionPane.showMessageDialog(null, "Proximo character é " + desejado);

    }
}
