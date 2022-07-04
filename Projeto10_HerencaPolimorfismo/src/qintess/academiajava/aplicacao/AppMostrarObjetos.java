package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Automovel;
import qintess.academiajava.classes.Produto;

public class AppMostrarObjetos {
	public static void main(String[] args) {
		String curso = "Fundamentos Java";
		System.out.println(curso);
		
		Automovel automovel = new Automovel("VW", "Gol", 2015, "1.5 ");
		System.out.println(automovel);
		System.out.println("--------------------------------------------");
		
		Produto produto1 = new Produto("Monitor de 21 Pol.", "Informática", 1500);
		Produto produto2 = new Produto("Panela de Aço Inox", "UD", 200);
		System.out.println(produto1);
		System.out.println(produto2);
		
		
	}
}
