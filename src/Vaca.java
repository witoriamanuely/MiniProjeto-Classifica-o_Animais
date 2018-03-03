public class Vaca extends Mamifero implements Herbivoros, Selvagem {

    public Vaca(String nome){
        super(nome);
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
