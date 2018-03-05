import java.io.*;
import java.util.HashMap;
import java.util.Map;



public class ManipulaArquivo {

	public static void escreverArquivo(Map<String, Animal> valores) {
		OutputStream arquivoEscrita = null;
		ObjectOutputStream objGravar = null;

		try {
			arquivoEscrita = new FileOutputStream(new File("Arquivo.txt"));
			objGravar = new ObjectOutputStream(arquivoEscrita);
		} catch (IOException e) {
			System.out.println("Não foi possivel abrir arquivo");
		}

		try {
			for (Animal valor : valores.values()){
				objGravar.writeObject(valor);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		try {
			objGravar.close();
			arquivoEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}



	public static Map<String, Animal> lerArquivo() throws IOException{
		Map<String, Animal> temp = new HashMap<String, Animal>();
		ObjectInputStream objLeitura = null;
		Animal linha;
		FileInputStream arquivo = null;
		File file = new File("Arquivo.txt");

		if(!file.exists()){
			file.createNewFile();
		}

		try {
			arquivo = new FileInputStream(file);
			objLeitura = new ObjectInputStream(arquivo);

			while (true) {
				try {
					linha = (Animal) objLeitura.readObject();
					temp.put(linha.getNome(), linha);
				} catch (EOFException e){
					break;
				}
			}
			objLeitura.close();
			arquivo.close();
		} catch (IOException e) {
			System.out.print("");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		}


		return temp;
	}
}

