package qintess.academiajava.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppSet02 {
	public static void main(String[] args) {
		
		
		// LinkedHashSet mantém a ordem das inserções.
		Set<String> pessoas = new LinkedHashSet<String>();
		pessoas.add("Carlos"); // 0
		pessoas.add("João"); // 1
		pessoas.add("Jeferson");// 2
		pessoas.add("Geraldo"); // 3
		pessoas.add("Amaral"); // 4
		pessoas.add("Miguel"); // 5
		pessoas.add("Peterson");
		
		
		
		pessoas.forEach(s -> System.out.println(s));
		
		
	}

}
