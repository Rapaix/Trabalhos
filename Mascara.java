package AulasEtemb;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;

/**
 * Created by luisportugal on 25/11/14.
 */
public class Mascara {

    public static String mascaraValor(String valor, String mascara){
        String novoValor = "";
        int countValor = 0;

        for ( int i = 0; i < mascara.length(); i++ ){
            char letraAtual = mascara.charAt(i);
            if(letraAtual == "#".charAt(0)){
                novoValor += valor.charAt(countValor);
                countValor++;
            }else{
                novoValor += letraAtual;
            }
        }
        return novoValor;
    }

}
