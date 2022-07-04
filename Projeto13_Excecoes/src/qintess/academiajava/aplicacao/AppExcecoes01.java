package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes01 {
	public static void main(String[] args) {
		try {
			String nome = JOptionPane.showInputDialog("Informe seu nome: ");

			// Apresentando o nome em Maiusculo
			JOptionPane.showMessageDialog(null, "Seu nome: " + nome.toUpperCase());
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			JOptionPane.showMessageDialog(null, "Sua idade: " + nome);

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());

		} catch (ExceptionInInitializerError ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());

		}

	}

}
