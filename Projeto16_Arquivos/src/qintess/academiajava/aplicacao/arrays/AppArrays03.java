package qintess.academiajava.aplicacao.arrays;

import javax.swing.JOptionPane;

public class AppArrays03 {
	public static void main(String[] args) {
		/*
		 * Neste exercicio o programa pede para o usuario informar um mês (1 a 12). De
		 * acordo co o mês informado o programa mostra o número de dias daquele mês.
		 * Obs.: vamos também perguntar o ano para determinar a quatidade de dias do mês
		 * de fevereiro.
		 */

		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));

		int[] meses = { 31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		String resposta = "O mês informado possui: " + meses[mes - 1] + " dias.";
		JOptionPane.showMessageDialog(null, resposta);

	}

}
