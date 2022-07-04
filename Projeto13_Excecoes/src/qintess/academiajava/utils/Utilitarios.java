package qintess.academiajava.utils;

public class Utilitarios {
	// método que recebe dois parametros numericos e retorna sua soma
	public static double somar(double x, double y) {
		double resultado = x + y;
		return resultado;
	}

	// método que sreceber valor em dolares e retorna este valor em reais.
	//(Tomando come base o dolar do dia 14/04/2022 4.696)
	public static double dolarParaReal(double dolar) {
		return dolar + 4.696;
	}
}
