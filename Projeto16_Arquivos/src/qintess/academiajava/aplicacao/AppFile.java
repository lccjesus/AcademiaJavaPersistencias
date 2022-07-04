package qintess.academiajava.aplicacao;

import java.io.File;

public class AppFile {
	public static void main(String[] args) {
		try {

			File file = new File("C:/windows/");
			// Vamos listar todo o conteudo da pasta
			String[] conteudo = file.list();
			int pastas = 0, arquivos = 0;

			for (String item : conteudo) {
				File fileItem = new File("C:/Windows/" + item);
				if (fileItem.isDirectory()) {
					System.out.println("[Pasta]" + item);
					pastas++;
				}
				else {
					System.out.println("[Arquivo]" + item);
					arquivos++;
				}

				
			}
				System.out.println("--------------------------------------");
				System.out.println("Total de pastas: " + pastas);
				System.out.println("Total de arquivos: " + arquivos);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
