package AulasEtemb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisportugal on 03/11/14.
 */
public class Casa {
    private String cor;
    List<Porta> portas = new ArrayList<Porta>();

    public List<Porta> getPortas() { return portas; }

    public String getCor() { return cor; }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void pintaCasa(String s) { this.setCor(s); }

    public void adicionarPortas(int p){
        for(int i = 0; i < p; i++){
            getPortas().add(new Porta());
        }
    }

    public void adicionarPorta(Porta p){
        getPortas().add(p);
    }

    public void pintarPorta(Porta p, String c){
        p.setCor(c);
    }

    public void mudarStatusPorta(Porta p, boolean status){
        p.setAberta(status);
    }

    public int quantasAbertas(){
        int abertas = 0;
        for(Porta porta : portas){
            if(porta.isAberta()) abertas ++;
        }
        return abertas;
    }

}
