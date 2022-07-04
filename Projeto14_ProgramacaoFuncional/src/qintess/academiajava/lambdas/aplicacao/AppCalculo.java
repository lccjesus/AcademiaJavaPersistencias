package qintess.academiajava.lambdas.aplicacao;

import qintess.academiajava.lambdas.interfaces.Calculo;

public class AppCalculo {

	// double calcular(double x, double y)
	public static void main(String[] args) {

		Calculo c1 = (x, y) -> x + y;
		double resultado = c1.calcular(2, 3);
		System.out.println("c1: " + resultado);

		Calculo c2 = (a, b) -> 2 * a + 3 * b;
		System.out.println("c2: " + c2.calcular(2, 3));

	}

}
