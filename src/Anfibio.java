import java.io.Serializable;

public class Anfibio extends Animal implements Caracteristica, Serializable {

    public Anfibio(){
        return;
    }
    public Anfibio(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public void caracteristicaPricipal() {
        System.out.print("Pele lisa");
    }
}
