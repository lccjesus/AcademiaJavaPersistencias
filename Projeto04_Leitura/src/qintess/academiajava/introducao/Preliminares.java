package qintess.academiajava.introducao;

public class Preliminares {
	public static void main(String[] args) {

		// variavel recebendo um valor fixo.
		double valor1 = 100;

		// variavel recebendo o valro de outra variavel.
		double valor2 = valor1;

		// variavel recebendo o valor da soma de outras duas variaveis.
		double valor3 = valor1 + valor2;

		// variavel recebendo o valor proveniente de uma constante definida no JRE.
		double valor4 = Math.PI;

		// varivel recebendo o valor de retorno de um método.
		double valor5 = Math.random();
		
		// a variavel valor6 recebe um número como resoltado da conversão de um String
		String s = "123";
		double valor6 = Double.parseDouble(s);
		
		// apresentando cada variavel na tela
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		System.out.println(valor4);
		System.out.println(valor5);
		System.out.println(valor6);
	}
}
