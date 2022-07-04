package qintess.academiajava.exercicios;

import javax.swing.JOptionPane;

public class Ex01_CaixaEletronico {
	public static void main(String[] args) {
		/*
		 * 
		 * Notas: - 50,00 - 20,00 - 10,00 - 5,00
		 * 
		 */
		// conversão
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do SAQUE: "));

		// coerção = cast
		int valorSaque = (int) valor;

		if (valorSaque % 5 != 0) {
			JOptionPane.showMessageDialog(null, "Valor de ser multiplo de 5 !!!");
			// Interrompe a execução do método em destaque
			return;
			// Interrompe o método main
			// System.exit(0);
		}
		// Se chegar neste bloco é por que o valor é multiplo de 5
		int n50 = 0, n20 = 0, n10 = 0, n05 = 0;
		// Poderiam tbm ser inicializada da seguinte forma:
		// n50 = n20 = n10 = n5 = 0;
		n50 = valorSaque / 50;
		valorSaque = valorSaque % 50;

		n20 = valorSaque / 20;
		valorSaque = valorSaque % 20;

		n10 = valorSaque / 10;
		valorSaque = valorSaque % 10;

		n05 = valorSaque / 5;

		// Resposta
		String resposta = "Valor do SAQUE: " + valor + "\nNotas de 50: " + n50 + "\nNotas de 20: " + n20
				+ "\nNotas de 10: " + n10 + "\nNotas de 05: " + n05;
		JOptionPane.showMessageDialog(null, resposta);

	}

}
