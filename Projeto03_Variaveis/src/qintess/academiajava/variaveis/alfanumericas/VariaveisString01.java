package qintess.academiajava.variaveis.alfanumericas;

import javax.swing.JOptionPane;

public class VariaveisString01 {
	public static void main(String[] args) {
		// dados pessoais
		String nome = "Luiz Carlos";
		int idade = 34;
		double peso = 78;
		double altura = 1.82;
		
		//criando uma variavel para representar um relatório com os dados pessoais
		String resultado = "Dados Pessoais\n\n" +
				"Nome: " + nome +
				"\nIdade: " + idade + " anos"+
				"\nPeso: " + peso + " Kg" + 
				"\nAltura: " + altura + " metros";
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, resultado);
			
		
	}

}
