package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Automovel;

public class AppAutomovel {
	public static void main(String[] args) {
		Automovel auto1 = new Automovel("Ford", "1.0");
		Automovel auto2 = new Automovel("Ford", "Fiesta", "1.5");
		Automovel auto3 = new Automovel("Ford", "Fiesta", 2008, "1.8");
		
		System.out.println(auto1.mostrar());
		System.out.println("------------------");
		System.out.println(auto2.mostrar());
		System.out.println("------------------");
		System.out.println(auto3.mostrar());
		
	}

}
