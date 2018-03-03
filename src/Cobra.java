public class Cobra extends Anfibio implements Carnivoros, Selvagem {

    public Cobra(String nome){
        super(nome);
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
