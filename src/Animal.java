import java.io.Serializable;

public class Animal implements Serializable {
    private String nome, habitat;
    private int peso;

    public Animal(){
    }
    public Animal(String nome, int peso, String habitat ){
        this.habitat = habitat;
        this.peso = peso;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
