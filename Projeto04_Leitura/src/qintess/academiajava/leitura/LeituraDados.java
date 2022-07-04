package qintess.academiajava.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso? "));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? "));

		// Gerando a resposta
		String resposta = "Nome Informado: " + nome +
				"\nPeso: " + peso + 
				"\nIdade: " + idade;
						
		// System.out.println("Nome informado: " + nome);
		// JOptionPane.showMessageDialog(null, "Qual o seu nome? " + nome + "\nQual o
		// seu peso? " + peso + "\nQual a sua idade? " + idade );
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
		

	}

}
