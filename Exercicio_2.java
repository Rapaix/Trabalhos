package AulasEtemb;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by luisportugal on 14/11/14.
 */
public class Exercicio_2 {
    public static void main(String[] a){
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(localeBR);

        String nomeCompleto = JOptionPane.showInputDialog("Digite seu nome completo: ");

        char sexo = JOptionPane.showInputDialog("Digite seu sexo (M ou F): ").charAt(0);

        double rendaFamiliar = Double.parseDouble(JOptionPane.showInputDialog("Digite sua renda familiar: "));

        String message =    "DADOS GRAVADOS\n\n" +
                            "Nome: " + nomeCompleto + "\n" +
                            "Sexo: " + sexo + "\n" +
                            "Renda Familiar: " + nf.format(rendaFamiliar);

        JOptionPane.showMessageDialog(null, message);
    }
}
