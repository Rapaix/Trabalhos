package AulasEtemb;

import javax.swing.*;

/**
 * Created by luisportugal on 21/11/14.
 */
public class Interrupcao {
    public static void main(String[] a){

        String nome = JOptionPane.showInputDialog("Digite Seu Nome;");
        if ( nome.isEmpty() ) System.exit(0);
        JOptionPane.showMessageDialog(null, "BemVindo Sir, " + nome, "Sir's", JOptionPane.PLAIN_MESSAGE);

    }
}
