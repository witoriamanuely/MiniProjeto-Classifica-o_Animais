import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;


public class fileManager {
	
	public static void salvarArquivo(Map<String, Animal> valores) {
		OutputStream arquivoEscrita = null;
		OutputStreamWriter escrita = null;
		BufferedWriter escritor = null;
		
		try {
			arquivoEscrita = new FileOutputStream("arquivo.txt");
			escrita = new OutputStreamWriter(arquivoEscrita);
			escritor = new BufferedWriter(escrita);
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel abrir arquivo");
		}
		
		for(Animal animal: valores.values()) {
			try {
				escritor.write(animal.getNome());
				escritor.newLine();
				//escritor.append(animal.getNome());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			escritor.close();
			escrita.close();
			arquivoEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static Map<String, Animal> carregarArquivo() {
		InputStream arquivoLeitura = null;;
		InputStreamReader leitor = null;
		BufferedReader leitura = null;
		String linha;
		Map<String, Animal> temp = new HashMap<String, Animal>();
		
		try {
			arquivoLeitura = new FileInputStream("arquivo.txt");
			leitor = new InputStreamReader(arquivoLeitura);
			leitura = new BufferedReader(leitor);
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel abrir arquivo");
		}
		
		try {
			while((linha = leitura.readLine()) != null) {
				temp.put(linha, new SerHumano(linha));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				leitura.close();
				leitor.close();
				arquivoLeitura.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return temp;
	}
}

