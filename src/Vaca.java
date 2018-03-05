import java.io.Serializable;

public class Vaca extends Mamifero implements Herbivoros, Selvagem, Serializable{
    public Vaca(){
    }
    public Vaca(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public void caracteristicaPricipal() {
        super.caracteristicaPricipal();
    }

    @Override
    public void comePlanta() {
        System.out.print("Comendo planta...");
    }

    @Override
    public void sendoSelvagem() {
        System.out.print("Correndo junto com a manada...");
    }
}
