package qintess.academiajava.aplicacao;

import qintess.academiajava.figuras.Circulo;
import qintess.academiajava.figuras.Figura;
import qintess.academiajava.figuras.Retangulo;

public class AppFiguras {
	public static void main(String[] args) {

		// Definindo Retangulos

		Retangulo retangulo1 = new Retangulo(10, 5);
		System.out.println("Area do retangulo " + retangulo1.calcArea());

		Figura figura1 = new Retangulo(1, 1);
		figura1 = new Circulo(25);

		/*
		 * Determinando a classe do objeto nstanciado a partir da variavel do metodo
		 * getClass() esta definido na classe Object, e retorna a classe correspondente
		 * aá instancia referenciada pela variavel.
		 */

		String classe = figura1.getClass().getSimpleName();

		System.out.println("Área do Objeto " + classe + ": " + figura1.calcArea());

	}

}
