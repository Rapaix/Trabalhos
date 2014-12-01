package TrabalhosAlvaro;

import javax.swing.*;

/**
 * Created by luisportugal on 25/11/14.
 */
public class Exercicio0801 {
    public static void main(String[] a){

        while ( true ){
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            if ( nome == null ) System.exit(0);

            if (!nome.matches("[a-zA-Z\\s]{5,50}")) {
                JOptionPane.showMessageDialog(null, "Digite um Valor entre 5 a 50 caracter sem números;", "", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            JOptionPane.showMessageDialog(null, "Nome informado: " + nome);
            System.exit(0);
        }
    }
}


