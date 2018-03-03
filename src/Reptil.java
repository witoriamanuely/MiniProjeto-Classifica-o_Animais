public class Reptil extends Animal implements Caracteristica {

    public Reptil(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public void caracteristicaPricipal() {
        System.out.print("Pele escamosa");
    }
}
