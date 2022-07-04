package qintess.academiajava.aplicacao;

import java.util.HashMap;
import java.util.Map;

public class AppMap01 {
	public static void main(String[] args) {
		Map<String, String> pessoas = new HashMap<>();
		pessoas.put("01677466340", "Gustavo");
		pessoas.put("62426258225", "Patricia");
		pessoas.put("56125317617", "Renata");
		pessoas.put("38717407214", "Renata");
		pessoas.put("62426258225", "Ana Paula");

		// Listando os elementos usando foreach
		for (Map.Entry<String, String> item : pessoas.entrySet()) {
			System.out.println(item.getKey() + " - " + item.getValue());

		}
		
		System.out.println("------------------------------------------------\n");
		
		// Listando os elementos usando expressão lambda.
		
		pessoas.forEach((k, v) -> System.out.println(k + " - " + v));

	}

}
