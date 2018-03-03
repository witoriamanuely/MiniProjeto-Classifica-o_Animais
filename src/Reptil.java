public class Reptil extends Animal implements Caracteristica {

    public Reptil(String nome){
        super(nome);
    }
    @Override
    public void caracteristicaPricipal() {
        System.out.print("Pele escamosa");
    }
}
