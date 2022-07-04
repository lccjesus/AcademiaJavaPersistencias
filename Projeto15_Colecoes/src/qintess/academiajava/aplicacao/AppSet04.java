package qintess.academiajava.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import qintess.academiajava.classes.Produto;

public class AppSet04 {
	public static void main(String[] args) {
		
		// Só poderemos adicionar elementos a uma coleção TreeSet se a classe destes elementos implemantar Comparable.
		// Set<Produto> produtos = new TreeSet<Produto>();
		
		Set<Produto> produtos = new LinkedHashSet<Produto>();
		produtos.add(new Produto("Camisa", "Vestuario", 100));
		produtos.add(new Produto("Bicicleta", "Esportivo", 1000));
		produtos.add(new Produto("Computador", "Informática", 3200));
		produtos.add(new Produto("bicicleta", "esportivo", 1000));
		produtos.add(new Produto("BICICLETA", "esportivo", 1000));
		
		produtos.forEach(s-> System.out.println(s.mostrar() + "\n"));
		
	}

}
