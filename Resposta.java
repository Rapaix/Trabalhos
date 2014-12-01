package AulasEtemb;

import javax.swing.*;

/**
 * Created by luisportugal on 21/11/14.
 */
public class Resposta {
    public static void main(String[] a){

        String nome = JOptionPane.showInputDialog("Digite seu nome;");
        if ( nome == null ) {
            JOptionPane.showMessageDialog(null, "Error: 400", "Resposta", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if ( nome.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Error: 404", "Resposta", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "BemVindo Sir, " + nome, "Resposta", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
