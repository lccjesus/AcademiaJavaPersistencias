package qintess.academiajava.estruturawhile.exercicios;

import javax.swing.JOptionPane;

public class Ex01_Notas2 {
	public static void main(String[] args) {
		/*
		 * Em uma curso os alunos realizam uma prova. A nota da prova deve estar entre 0
		 * e 10. Escrever este programa de forma a perguntar para o usuário quantos
		 * alunos tem no curso. Em seguida, perguntar a nota de cada aluno. Na medida em
		 * que a nota for sendo informada, fazer a soma e no final apresentar: - Maior
		 * nota da turma; - Menor nota da turma; - Média da turma.
		 * 
		 */

		int quant = Integer.parseInt(JOptionPane.showInputDialog("Quanto alunos na turma?"));
		double maior = 0, menor = 0, media, soma = 0;

		for (int i = 0; i < quant; i++) {
			double nota;

			do {
				nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 0" + (i + 1)));
			} while (nota < 0 || nota > 10);

			soma += nota;

			// na primeira vez as variaveis maior e menor recebe a nota informada.
			if (i == 0) {
				maior = menor = nota;
			} else {
				if (nota < menor) {
					menor = nota;
				}
				if (nota > maior) {
					maior = nota;
				}
			}
		}
		media = soma / quant;
		String resposta = "Média: " + media + "\nMenor: " + menor + "\nMaior: " + maior;
		JOptionPane.showMessageDialog(null, resposta);

	}

}
