public class Tartaruga extends Reptil implements Herbivoros, Domesticavel{
    public Tartaruga(String nome){
        super(nome);
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
