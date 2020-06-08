package servico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class Recebe {

	public static void main(String[] args) throws IOException {
		lerArquivo();
		
		splitando();
	
	}
		
		
	public static void lerArquivo() throws IOException {	
		
		
		
		System.out.println("Iniciando Importação");
		String nomeArquivo= "C:\\integracao\\recebe\\produtoslista.CSV";
		File arq = new File(nomeArquivo);
		
		
		
		if(arq.exists()) {
			System.out.println("arquivo existe");
		
			FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            while ((s = br.readLine()) != null) {
            	System.out.println(s);
            }
            }
		}
	
	public static void splitando() throws IOException {
        File file = new File("C:\\integracao\\recebe\\produtoslista.CSV");
        String texto = new String(Files.readAllBytes(file.toPath()));
        String[] splitados = texto.split(";");
        for (String col : splitados) {
            
            System.out.print(col+ " ");
        }

    }
	
	
	
	
}




