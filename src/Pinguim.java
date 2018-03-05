import java.io.Serializable;

public class Pinguim extends Ave implements Carnivoros, Selvagem, Serializable {
    public Pinguim(){
    }
    public Pinguim(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public void caracteristicaPricipal() {
        super.caracteristicaPricipal();
    }

    @Override
    public void comeCarne() {
        System.out.print("Comendo peixinho...");
    }

    @Override
    public void sendoSelvagem() {
        System.out.print("Nadando em alto mar...");
    }
}
