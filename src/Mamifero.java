public class Mamifero extends Animal implements Caracteristica {

    public Mamifero(String nome, int peso, String habitat){
        super(nome, peso, habitat);
    }
    @Override
    public String getNome() {
        return super.getNome();
    }

    public void caracteristicaPricipal() {
        System.out.print("Mama");
    }

}
