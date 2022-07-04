package qintess.academiajava.estruturawhile;

public class EstruturaWhile01 {
	public static void main(String[] args) {
		
		int numero = (int)(Math.random() * 10);
		
		System.out.println(numero);
		
		while(numero < 5) {
			System.out.println(numero);
			numero++;
		}
		System.out.println("---- FIM DO PROGRAMA ----");
	}

}
