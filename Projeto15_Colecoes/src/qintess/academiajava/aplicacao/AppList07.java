package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

import qintess.academiajava.classes.Produto;

public class AppList07 {
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("teclado", "informatica", 890));
		produtos.add(new Produto("laptop", "informatica", 5000));
		produtos.add(new Produto("hamburger", "alimentos", 15));
		produtos.add(new Produto("pastel", "alimentos", 7));
		
		//Ordenando pela Descrição
		produtos.sort((p1, p2)-> p1.getDescricao().compareTo(p2.getDescricao()) );
		
		produtos.forEach(s -> System.out.println(s.mostrar() + "\n"));
		
	}

}
