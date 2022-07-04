package qintess.academiajava.aplicacao;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AppNumeros {
	public static void main(String[] args) {
		
		// Variaveis double: apresentando formatações.
		double valor = 1234.5;
		
		
		//Formatação para moeda
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // R$ 1.234,50
		String s = nf.format(valor);
		System.out.println(s);
		
		//Formatação numerica
		nf = NumberFormat.getNumberInstance(); // 1.234,5
		System.out.println(nf.format(valor));

		// A Classe DecimalFormat
		DecimalFormat df = new DecimalFormat("0.##"); // 1234,5
		System.out.println(df.format(valor));
		
		df = new DecimalFormat("0.00"); // 1234,50
		System.out.println(df.format(valor));
		
		df = new DecimalFormat(",##0.00"); // 1.234,50
		System.out.println(df.format(valor));
		
	}

}
