package qintess.academiajava.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {
	public static void main(String[] args) {
		/*
		 * Em uma empresa o funcionário tem um valor descontado de seu salário somente
		 * se o salário for maior que 5.000.00.
		 * 
		 * O descontao ocorre da seguinte forma: - Até 5.000,00: nada é descontado; -
		 * Acima de 5.000,00: desconto de 10% sobre o que passar do valor.
		 * 
		 * Exemplo: Salário de 5.500,00: desconto de 10% sobre o excedente do valor no
		 * caso 500,00.
		 * 
		 */

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário:"));
		double desconto = 0;

		if (salario > 5000) {
			desconto = (salario - 5000) * 0.1;

		}

		// Construindo a resposta
		String resposta = "Salário Bruto: " + salario + "\nDesconto: " + desconto + "\nSalário Liquido: "
				+ (salario - desconto);

		JOptionPane.showMessageDialog(null, resposta);

	}

}
