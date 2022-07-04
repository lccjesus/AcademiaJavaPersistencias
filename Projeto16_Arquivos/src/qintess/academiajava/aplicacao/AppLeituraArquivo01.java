package qintess.academiajava.aplicacao;

import java.io.FileReader;

import qintess.academiajava.utils.Utilitarios;

public class AppLeituraArquivo01 {
	public static void main(String[] args) {
		try {
		//Lendo arquivo texto
			// Forma 1: por caracter
			FileReader reader = 
					new FileReader(Utilitarios.CAMINHO_ARQUIVO + "funcionarios.txt");
			
			StringBuilder sb = new StringBuilder();
			while(true) {
				int ch = reader.read();
				if(ch == -1) { //EOF - End Of File
					break;
				}
				sb.append((char)ch); 
								
			}
			reader.close();
			System.out.println(sb.toString());
						
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
