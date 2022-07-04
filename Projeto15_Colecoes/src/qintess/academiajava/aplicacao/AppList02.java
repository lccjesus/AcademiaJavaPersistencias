package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

public class AppList02 {
	public static void main(String[] args) {

		// Lista de pessoas
		List<String> nomes = new ArrayList<>();
		nomes.add("Carlos"); // 0
		nomes.add("João"); // 1
		nomes.add("Jeferson");// 2
		nomes.add("Geraldo"); // 3
		nomes.add("Amaral"); // 4
		nomes.add("Miguel"); // 5
		nomes.add("Mario");
		nomes.add("Joana");
		nomes.add("Romario");
		nomes.add("Sonia");
		nomes.add("Elaine");

		// Adicionando um item no começo da lista
		nomes.add(0, "Luiz");

		// Removendo elementos da lista:
		// 1- pelo index.
		nomes.remove(1);
		// 2- pelo objeto.
		nomes.remove("João");
		// 3. removendo de acordo com uma condição.
		nomes.removeIf(s -> s.contains("e"));
		//Mostras na tela o que sobrou.
		nomes.forEach(nome -> System.out.println(nome));
		
		

	}

}
