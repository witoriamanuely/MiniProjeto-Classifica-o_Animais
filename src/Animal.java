public class Animal {
    private String nome, habitat;
    private int peso;

    public Animal(){
        return;
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
