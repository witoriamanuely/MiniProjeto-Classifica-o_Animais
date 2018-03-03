public class Mamifero extends Animal implements Caracteristica {

    public Mamifero(String nome){
        super(nome);
    }
    @Override
    public String getNome() {
        return super.getNome();
    }

    public void caracteristicaPricipal() {
        System.out.print("Mama");
    }

}
