import java.io.Serializable;

public class Reptil extends Animal implements Caracteristica, Serializable {
    public Reptil(){

    }
    public Reptil(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public void caracteristicaPricipal() {
        System.out.print("Pele escamosa");
    }
}
