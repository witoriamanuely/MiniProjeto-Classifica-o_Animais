import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Ave extends Animal implements Caracteristica {

    public Ave(String nome){
        super(nome);
    }
    @Override
    public void caracteristicaPricipal() {
        System.out.print("Bico");
    }
}
