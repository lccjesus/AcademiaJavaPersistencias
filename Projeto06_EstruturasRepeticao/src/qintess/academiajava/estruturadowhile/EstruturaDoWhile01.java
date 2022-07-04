package qintess.academiajava.estruturadowhile;

public class EstruturaDoWhile01 {
	public static void main(String[] args) {
		int numero = (int) (Math.random() * 10);

		do {
			System.out.println(numero);
			numero++;

		} while (numero < 5);
		System.out.println("--- FIM DO PROGRAMA ---");

	}

}
