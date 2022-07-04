package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Automovel;

public class AppAutomovel {
	public static void main(String[] args) {
		Automovel auto1 = new Automovel();
		auto1.marca = "Ford";
		auto1.modelo = "Fusion";
		auto1.ano = 2020;

		Automovel auto2 = new Automovel();
		auto2.marca = "Nissan";
		auto2.modelo = "350z";
		auto2.ano = 2008;
		
		auto1 = new Automovel();
		auto1.marca = "Toyota";
		auto1.modelo = "Corolla";
		auto1.ano = 2021;
		
		System.out.println(auto1.marca);
		System.out.println(auto1.modelo);
		System.out.println(auto1.ano);
		System.out.println("---------------------");
		System.out.println(auto2.marca);
		System.out.println(auto2.modelo);
		System.out.println(auto2.ano);
		
	}

}
