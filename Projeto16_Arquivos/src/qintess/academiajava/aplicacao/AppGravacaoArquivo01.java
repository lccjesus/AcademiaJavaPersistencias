package qintess.academiajava.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

import qintess.academiajava.utils.Utilitarios;

public class AppGravacaoArquivo01 {
	public static void main(String[] args) {
		try {
			// Gerando um arquivo com texto fornecido pelo usuário.
			FileWriter writer = new FileWriter(Utilitarios.CAMINHO_ARQUIVO + "Arquivo2.txt" ,  true);

			// Nome informado será adicionado ao arquivo.
			String nome = JOptionPane.showInputDialog("Digita seu nome: ");
			writer.write(nome + "\n");
			writer.close();
			JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!!");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
