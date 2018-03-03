public class Vaca extends Mamifero implements Herbivoros, Selvagem {
    public Vaca(){
        return;
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
