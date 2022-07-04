package qintess.academiajava.aplicacao.arrays;

import javax.swing.JOptionPane;

public class AppArrays04 {
	public static void main(String[] args) {
		/*
		 * O usuario irá fornecer como dados de entrada: dia, mês e ano.
		 * Com base nessas informações o programa irá apresenta a quantidade de dias para terminar o ano. 
		 */
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia:"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês: "));
		//int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
		int ano = 2022;
		
		int[] meses = { 31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int diasRest = meses [mes - 1] - dia;
		
		for (int i = mes; i < meses.length; i++) {
			diasRest += meses[i];			
		}
		
		String resposta = "Restam " + diasRest + " dias, para termina o ano.";
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
		
		
	}

}
