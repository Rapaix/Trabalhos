package AulasEtemb;

/**
 * Created by luisportugal on 03/11/14.
 */
public class Pessoa {
    private String nome = null;
    private int idade = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void fazAniversario(){
        int idadeAniversario = this.getIdade() + 1;
        this.setIdade(idadeAniversario);

        System.out.println("\nFeliz Aniversário: " + this.getNome() +"... :-) Hehehehehe :-p ");
        System.out.println("Sua idade é " + this.getIdade() + ((this.getIdade() == 1) ? " ano" : " anos"));
    }

    public Pessoa(String nome){
        this.setNome(nome);
    }
}
