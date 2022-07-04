package qintess.academiajava.utils;

public class Utilitarios {
	// método que recebe dois parametros numericos e retorna sua soma
	public static double somar(double x, double y) {
		double resultado = x + y;
		return resultado;
	}

	// método que sreceber valor em dolares e retorna este valor em reais.
	// (Tomando come base o dolar do dia 14/04/2022 4.696)
	public static double dolarParaReal(double dolar) {
		return dolar + 4.696;
	}

	// Metodo que recebe uma quantidade de traços que retorna uma string com todos
	// estes traços.
	public static String gerarLinha(int quantidade) {
		// StringBuilder sb = new StringBuilder();
		// for (int i = 0; i < quantidade; i++) {
		// sb.append('-');
		return gerarLinha(quantidade, '-');
	}
	// return sb.toString();

	// }
	public static String gerarLinha(int quantidade, char ch) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < quantidade; i++) {
			sb.append(ch);
		}
		return sb.toString();

	}

	// metodo que recebe uma quantidade variaveis de parametro numerico (double)
	// e retorna a soma destes valores.
	/*
	 * Considerações sobre varargs: 
	 * 1. Somente podemos ter um parametr do tipo
	 * varargs 
	 * 2. Se o metodo tiver mais de um parametro, e um deles for varargs,
	 * este deve ser o ultimo.
	 */

	public static double calcularSoma(double... numeros) {
		double soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;

	}

}
