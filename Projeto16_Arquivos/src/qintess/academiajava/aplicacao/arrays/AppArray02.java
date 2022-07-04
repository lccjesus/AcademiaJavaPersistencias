package qintess.academiajava.aplicacao.arrays;

import javax.swing.JOptionPane;

public class AppArray02 {
	public static void main(String[] args) {

		/*
		 * Neste exercicio o usuario pergunta a quantidade de alunos presentes. Em
		 * seguida fornece o nome de cada aluno. 
		 * No final apresenta os nomes.
		 */

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos? "));
		String[] nomes = new String[quantidade];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe o nome: " + (i + 1));
		}

		// Apresentando os nomes informados.
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}

}
