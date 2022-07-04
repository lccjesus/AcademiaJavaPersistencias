package qintess.academiajava.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf03 {
	public static void main(String[] args) {

		/*
		 * Em um clube o valor do ingresso é cobrado de acordo com a idade. Com base nas
		 * seginte regras:
		 * 
		 * - Até 17 anos: R$50,00 - Entre 18 e 59 anos: R$70,00 - A partir de 60 anos:
		 * R$25,00
		 *
		 * Escreva um programa que solicite a idade e apresente o valor a ser pago.
		 */

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade: "));
		double ingresso;

		if (idade < 18) {
			ingresso = 50;
		} else if (idade > 59) {
			ingresso = 25;
		} else {
			ingresso = 70;
		}
		String resposta = "Idade: " + idade + "\nValor do ingresso: " + ingresso;
		JOptionPane.showMessageDialog(null, resposta);

	}

}
