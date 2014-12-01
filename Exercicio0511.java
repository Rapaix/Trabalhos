package TrabalhosAlvaro;

import javax.swing.*;

/**
 * Created by luisportugal on 24/11/14.
 */
public class Exercicio0511 {
    public static void main(String[] a){

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String notaUm= JOptionPane.showInputDialog(nome + " Informe sua primeira nota: (0 - 100)");
        String notaDois= JOptionPane.showInputDialog(nome + " Informe sua segunda nota: (0 - 100)");
        double media = (Double.parseDouble(notaUm) + Double.parseDouble(notaDois)) / 2;

        String resultado = "Resultado final" +
                "\nAluno: " + nome +
                "\nPrimeira nota: " + notaUm +
                "\nSegunda nota: " + notaDois +
                "\nMédia: " + media;

        JOptionPane.showMessageDialog(null, resultado);
    }
}