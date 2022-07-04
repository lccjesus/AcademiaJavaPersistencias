package qintess.academiajava.aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class AppSet03 {
public static void main(String[] args) {
	// .
			Set<String> pessoas = new TreeSet<String>();
			pessoas.add("Carlos"); // 0
			pessoas.add("João"); // 1
			pessoas.add("Jeferson");// 2
			pessoas.add("Geraldo"); // 3
			pessoas.add("Amaral"); // 4
			pessoas.add("Miguel"); // 5
			pessoas.add("Peterson"); //6
			
			
			
			pessoas.forEach(s -> System.out.println(s));
			
}
	
	
}
