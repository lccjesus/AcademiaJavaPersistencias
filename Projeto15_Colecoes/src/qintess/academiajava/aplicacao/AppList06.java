package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import qintess.academiajava.classes.OrdenadorCategoria;
import qintess.academiajava.classes.OrdenadorDescricao;
import qintess.academiajava.classes.Produto;

public class AppList06 {
	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("teclado", "informatica", 890));
		produtos.add(new Produto("laptop", "informatica", 5000));
		produtos.add(new Produto("hamburger", "alimentos", 15));
		produtos.add(new Produto("pastel", "alimentos", 7));

		// Ordenação pela Categoria
		Collections.sort(produtos, new OrdenadorCategoria());

		// Ordenação pela descrição.
		Collections.sort(produtos, new OrdenadorDescricao());

		produtos.forEach(s -> System.out.println(s.mostrar() + "\n"));

	}

}
