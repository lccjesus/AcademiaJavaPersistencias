package qintess.academiajava.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {

		/*
		 * Escrever o programa de forma a solicitar ao usuário o ano. Com base no ano,
		 * apresentar como resposta se o ano é ou não bissexto.
		 * 
		 * Usar o comando IF para esta tarefa.
		 * 
		 */
		// Resposta: O ano é bissexto
		// Resposta: O ano não é bissexto

		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano para teste: "));
		String resposta;

		if (ano % 4 == 0) {
			resposta = "O ano é BISSEXTO.";
		} else {
			resposta = "O ano não é BISSEXTO.";
		}
		System.out.println(resposta);
		JOptionPane.showMessageDialog(null, resposta);
	}

}
