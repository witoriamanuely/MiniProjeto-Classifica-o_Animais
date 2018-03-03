public class Pinguim extends Ave implements Carnivoros, Selvagem {
    public Pinguim(String nome){
        super(nome);
    }

    @Override
    public void caracteristicaPricipal() {
        super.caracteristicaPricipal();
    }

    @Override
    public void comeCarne() {
        System.out.print("Comendo peixinho...");
    }

    @Override
    public void sendoSelvagem() {
        System.out.print("Nadando em alto mar...");
    }
}
