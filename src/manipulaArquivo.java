import java.io.*;
import java.util.HashMap;
import java.util.Map;



public class manipulaArquivo {
	
	public static void escreverArquivo(Map<String, Animal> valores) {
		OutputStream arquivoEscrita = null;
		ObjectOutputStream objGravar = null;

		try {
			arquivoEscrita = new FileOutputStream("arquivo.txt");
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



	public static Map<String, Animal> lerArquivo() {
		Map<String, Animal> temp = new HashMap<String, Animal>();
		InputStream arq = null;
		InputStreamReader leitor = null;
		BufferedReader lerArq = null;

		try {
			arq = new FileInputStream("ARQUIVO.txt");
			leitor = new InputStreamReader(arq);
			lerArq = new BufferedReader(leitor);
		} catch (FileNotFoundException e ) {
			System.out.print("ERRO" + e);
		}
		try {
			String linha = "";
			linha = lerArq.readLine();
			while (linha != null) {
				temp.put(linha, new Animal(linha));
				linha = lerArq.readLine();

			}
		} catch (IOException e) {
			System.out.print("Erro ao ler arquivo");

		} finally {
			try {
				lerArq.close();
				leitor.close();
				arq.close();
			} catch (IOException e) {
				System.out.print("Erro ao fecha arquivo");
			}

		}
		return temp;
	}
}

