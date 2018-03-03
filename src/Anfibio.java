public class Anfibio extends Animal implements Caracteristica {

    public Anfibio(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public void caracteristicaPricipal() {
        System.out.print("Pele lisa");
    }
}
