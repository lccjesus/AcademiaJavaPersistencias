package qintess.academiajava.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {
	public static void main(String[] args) {
		Set<String> pessoas = new HashSet<String>();
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
