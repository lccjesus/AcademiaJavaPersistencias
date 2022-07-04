package qintess.academiajava.estruturafor;

public class EstruturaFor05 {
	public static void main(String[] args) {

		// Não exibe os multiplos de 3.
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	/*
	 * Resultado: 1 2 4 5 7 8
	 */

}
