import java.util.ArrayList;
import java.util.List;


public class Sistema {
    private List lista = new ArrayList();


    public void adicionaAnimal(Animal animal){
        lista.add(animal);
    }

    public void removeAnimal(Animal animal){
        lista.remove(animal);
    }
    public void atualizaAnimal(Animal animal){

    }
    public void listaAnimaisArmazenados(){
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i));
        }
    }

}
