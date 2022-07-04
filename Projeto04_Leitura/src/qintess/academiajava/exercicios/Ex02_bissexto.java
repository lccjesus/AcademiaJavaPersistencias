package qintess.academiajava.exercicios;

import javax.swing.JOptionPane;

public class Ex02_bissexto {
	public static void main(String[] args) {
		/*
		 * Programa solicita o ano ao usuário.
		 * Com base no valor informado verificar 
		 * se o ano é bissexto ou não.
		 * 
		 * Obs.: Para o ano ser bissexto ele deve ser divisivel por 4.
		 */
		
/*
 * 10 / 3 = 3 (Divisor)
 * 10 % 3 = 1 (Resto)
 * >  Maior
 * <  Menor
 * >= Mais igual á...
 * <= Menos igual á...
 * == Igual
 * != Diferente
 * 	
 * 	int x = 2; (atribuição)
 *  x == 2 ? (true)
 *  x > 0 ? (true)
 *  x <= 2 ? (true)
 *  x != 2 ? (false)
 *  
 *  
 */
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o ANO: "));
		
		// Resposta 1 -> Operador Ternário: 
		String resposta = ano % 4 == 0 ? "O ano é bissexto" : "O ano não é bissexto";
		System.out.println(resposta);
		//JOptionPane.showMessageDialog(null, resposta);
		
		//Resposta 2 -> Operador Ternário:
		System.out.println(ano%4==0 ? "O ano é bissexto" : "O ano não é bisexto");
					
	}

}
