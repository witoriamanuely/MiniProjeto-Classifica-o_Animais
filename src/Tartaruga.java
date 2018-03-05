import java.io.Serializable;

public class Tartaruga extends Reptil implements Herbivoros, Domesticavel, Serializable{
    public Tartaruga(){
    }
    public Tartaruga(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public void caracteristicaPricipal() {
        super.caracteristicaPricipal();
    }

    @Override
    public void comePlanta() {
        System.out.print("Comendo plantinha...");
    }

    @Override
    public void sendoDomesticavel() {
        System.out.print("Brincando com o humano...");
    }
}
