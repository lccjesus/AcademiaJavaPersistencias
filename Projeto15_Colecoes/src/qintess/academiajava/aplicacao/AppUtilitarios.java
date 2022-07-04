package qintess.academiajava.aplicacao;

import qintess.academiajava.utils.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		//Metodo gerarLinha: executando as duas versões.
		System.out.println(Utilitarios.gerarLinha((20)));
		System.out.println(Utilitarios.gerarLinha(56, 'A'));
		
		
		//Metodo calcularSoma.
		double soma1 = Utilitarios.calcularSoma();
		double soma2 = Utilitarios.calcularSoma(1,6,8,9,4,7,8,12,56,65);
		double soma3 = Utilitarios.calcularSoma(5,5,5,5,5,5);
		
		double[] numeros = {17,85,92};
		double soma4 = Utilitarios.calcularSoma(numeros);
		System.out.println("Soma1 " + soma1);
		System.out.println("Soma2 " + soma2);
		System.out.println("Soma3 " + soma3);
		System.out.println("Soma4 " + soma4 + "\n");
		
		System.out.printf("Soma1 %.2f%n", soma1);
		System.out.printf("Soma2 %.2f%n", soma2);
		System.out.printf("Soma3 %.2f%n", soma3);
		System.out.printf("Soma4 %.2f%n", soma4);
		
		
		
	}

}
