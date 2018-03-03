public class SerHumano extends Mamifero implements Carnivoros, Herbivoros, Domesticavel {

    public SerHumano(String nome){
        super(nome);
    }

    @Override
    public void caracteristicaPricipal() {
        super.caracteristicaPricipal();
    }

    @Override
    public void comePlanta() {
        System.out.print("Comendo maçã...");
    }

    @Override
    public void comeCarne() {
        System.out.print("Comendo estrogonofe...");
    }

    @Override
    public void sendoDomesticavel() {
        System.out.print("Sentando na cama lendo um livro...");
    }
}
