import java.io.IOException;
import java.util.Map;


public class Sistema {

    private Map<String, Animal> dictAnimais;

    public Sistema() throws IOException{
        this.dictAnimais = ManipulaArquivo.lerArquivo();
    }
    public void adicionaAnimal(Animal animal){
        this.dictAnimais.put(animal.getNome(), animal);
    }

    public void removeAnimal(Animal animal){
        this.dictAnimais.remove(animal);
    }
    public void atualizaAnimal(Animal animal){
        this.dictAnimais.replace(animal.getNome(), animal);
    }
    public void listaAnimaisArmazenados(){
        for(Animal animal : this.dictAnimais.values()) {
            System.out.println(animal.getNome());
        }
    }
    public Map<String, Animal> getDictAnimais() {
        return dictAnimais;
    }

}
