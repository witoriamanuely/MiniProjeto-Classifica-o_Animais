import java.io.Serializable;

public class Ave extends Animal implements Caracteristica, Serializable {
    public Ave(){

    }
    public Ave(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public void caracteristicaPricipal() {
        System.out.print("Bico");
    }
}
