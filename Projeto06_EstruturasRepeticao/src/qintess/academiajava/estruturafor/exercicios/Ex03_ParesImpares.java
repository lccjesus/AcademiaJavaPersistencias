package qintess.academiajava.estruturafor.exercicios;

import javax.swing.JOptionPane;

public class Ex03_ParesImpares {
	public static void main(String[] args) {
		/*
		 * Neste programa o usuário informa uma quantidade de números. Em será
		 * solicitado a quantidade de números que o usuário deverá digitar. - contar a
		 * quantidade de números pares; - contar a quantidade de números impares; -
		 * apresentar a porcentagem de números pares em relação aos impares.
		 */

		//JOptionPane.showMessageDialog(null, "*** Números Impares e Pares ***");
		int quant = Integer.parseInt(JOptionPane.showInputDialog("Informa a quantidade que será digitada? "));
		int par = 0, imp = 0;
		for (int i = 0; i < quant; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + (i + 1)));
			if (num % 2 == 0) {
				par++;
			} else {
				imp++;
			}
		}
		double porc = (par / (double) quant) * 100;
		JOptionPane.showMessageDialog(null, "Temos " + porc + "% de números pares");
	}

}
