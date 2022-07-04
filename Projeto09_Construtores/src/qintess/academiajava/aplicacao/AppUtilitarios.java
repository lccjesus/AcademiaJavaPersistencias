package qintess.academiajava.aplicacao;

import qintess.academiajava.utils.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		// método somar
		double soma = Utilitarios.somar(2, 3);
		System.out.println("Soma: " + soma);

		// método doalr para real
		double dolar = 20.50;
		double reais = Utilitarios.dolarParaReal(dolar);
		System.out.println(dolar + " Dolares valem: " + reais + "reais");

	}

}
