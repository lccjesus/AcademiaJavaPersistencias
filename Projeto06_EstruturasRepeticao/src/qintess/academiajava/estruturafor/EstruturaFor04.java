package qintess.academiajava.estruturafor;

public class EstruturaFor04 {
	public static void main(String[] args) {
		for (int i = 0, j = 20; i < j; i++, j -= 2) {
			System.out.println("I = " + i + " J = " + j);

			
			/* Resultado
			 * I = 0 J = 20
			 * I = 1 J = 18
			 * I = 2 J = 16
			 * I = 3 J = 14
			 * I = 4 J = 12
			 * I = 5 J = 10
			 * I = 6 J = 8
			 */
			
		}

	}

}
