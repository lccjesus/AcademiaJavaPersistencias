package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

public class AppList01 {
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

		// Exibindo dados na tela.
		System.out.println(nomes);
		System.out.println("---------------Usuando a estrutura FOR ---------------");

		// Somente se soubermos a quantidade exata dos valores utiliza-se o FOR.
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));

		}

		System.out.println("---------------Usuando o FOR Aprimorada (For Each) ---------------");

		for (String nome : nomes) {
			System.out.println(nome);

		}

		System.out.println("---------------Usuando o método (For Each) ---------------");
		
		nomes.forEach(s -> System.out.println(s));

	}

}
