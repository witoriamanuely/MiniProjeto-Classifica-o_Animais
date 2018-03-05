import java.io.Serializable;

public class Mamifero extends Animal implements Caracteristica, Serializable {

    public Mamifero(){
    }
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
