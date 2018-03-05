import java.io.Serializable;

public class Cobra extends Anfibio implements Carnivoros, Selvagem, Serializable {
    public Cobra(){

    }
    public Cobra(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }

    @Override
    public void caracteristicaPricipal() {
        super.caracteristicaPricipal();
    }

    @Override
    public void comeCarne() {
        System.out.print("Comendo passarinho...");
    }

    @Override
    public void sendoSelvagem() {
        System.out.print("Caçando préas...");
    }
}
