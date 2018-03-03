import java.io.*;
import java.util.HashMap;
import java.util.Map;



public class manipulaArquivo {
	
	public static void escreverArquivo(Map<String, Animal> valores) {
		OutputStream arquivoEscrita = null;
		ObjectOutputStream objGravar = null;

		try {
			arquivoEscrita = new FileOutputStream("/home/witoriamanuely/Downloads/ARQUIVO.txt");
			/*escrita = new OutputStreamWriter(arquivoEscrita);
			escritor = new BufferedWriter(escrita);*/
			objGravar = new ObjectOutputStream(arquivoEscrita);
		} catch (IOException e) {
			System.out.println("Não foi possivel abrir arquivo");
		}

		try {
			objGravar.writeObject(valores);
			//escritor.append(animal.getNome());
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
		InputStream arquivo = null;
		InputStreamReader leitor = null;
		BufferedReader lerArquivo = null;
		ObjectInputStream objLeitura = null;
		File file = new File("/home/witoriamanuely/Downloads/ARQUIVO.txt");
		if(!file.exists()) {
			try {
				arquivo = new FileInputStream("/home/witoriamanuely/Downloads/ARQUIVO.txt");
				objLeitura = new ObjectInputStream(arquivo);
			} catch (IOException e) {
				System.out.print("Erro ao abrir o arquivo");
			}
		}else {
			try {

				Animal linha;
				linha = objLeitura.readObject();
				while (linha != null) {
					temp.put(linha, new Animal(linha));
					linha = objLeitura.readObject();

				}
			} catch (ClassNotFoundException e) {
				System.out.print("Erro ao ler arquivo");

			} finally {
				try {
					lerArquivo.close();
					leitor.close();
					arquivo.close();
				} catch (IOException e) {
					System.out.print("Erro ao fechar arquivo");
				}

			}
		}
		return temp;
	}
}

