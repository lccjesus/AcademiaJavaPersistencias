package qintess.academiajava.estruturafor.exercicios;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ex01_ContarPares {
	public static void main(String[] args) {
		/*
		 * Neste programa o usuario escolha um número valor mínimo e máximo. O programa
		 * apresenta a quantidade de número pares existentes entre o minimo e o máximo
		 * informados.
		 */
		int min = Integer.parseInt(JOptionPane.showInputDialog("Valor Mínimo: "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Valor Máximo: "));
		// Validação do valor minimo que deverá ser menor que o máximo.
		if (min >= max) {
			JOptionPane.showMessageDialog(null, "O valor de Máximo deverá ser maior que o valor Mínimo");
			return;
		}
		int quant = 0; // Variavel que irá verificar os números pares.
		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				quant++;
			}
		}
		// Gerando a resposta
		String resposta = "Entre " + min + " e o " + max + "\nexistem " + quant + " números pares";
		JOptionPane.showMessageDialog(null, resposta);
	}
}
