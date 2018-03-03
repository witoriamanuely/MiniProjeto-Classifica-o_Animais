import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Ave extends Animal implements Caracteristica {

    public Ave(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public void caracteristicaPricipal() {
        System.out.print("Bico");
    }
}
