package AulasEtemb;

/**
 * Created by luisportugal on 05/11/14.
 */
public class CasaTeste {
    public static void main(String[] a){
        Casa luisEnrique = new Casa();

        luisEnrique.pintaCasa("Preta");
        luisEnrique.adicionarPortas(5);

        Porta quartoEnrique = luisEnrique.getPortas().get(0);
        luisEnrique.pintarPorta(quartoEnrique, "Azul");
        luisEnrique.mudarStatusPorta(quartoEnrique, true);

        Porta sala = new Porta();
        sala.setAberta(false);
        luisEnrique.adicionarPorta(sala);

        System.out.println(luisEnrique.quantasAbertas());
    }
}
