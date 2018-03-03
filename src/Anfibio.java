public class Anfibio extends Animal implements Caracteristica {

    public Anfibio(String nome){
        super(nome);
    }
    @Override
    public void caracteristicaPricipal() {
        System.out.print("Pele lisa");
    }
}
