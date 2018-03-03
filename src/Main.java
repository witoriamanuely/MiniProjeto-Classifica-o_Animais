import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Sistema c = new Sistema();
        c.adicionaAnimal(new Cobra("Sucuri", 2, "terrestre/aquatico"));
        c.adicionaAnimal(new Vaca("Nelore",500, "terrestre"));
        c.adicionaAnimal(new Pinguim("Pinguim",50, "aquatico/polos"));
        c.adicionaAnimal(new SerHumano("Witória", 63, "terrestre"));
        c.adicionaAnimal(new Tartaruga("Tartaruga", 7, "terrestre"));
        c.listaAnimaisArmazenados();
        manipulaArquivo.escreverArquivo(c.getDictAnimais());

    }
}
