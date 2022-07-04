package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		Produto produto = new Produto("Bicicleta", "transporte", 1000);
				
		
		System.out.println(produto.mostrar());
		JOptionPane.showMessageDialog(null, produto.mostrar());
		JOptionPane.showMessageDialog(null, produto.mostrar(), "Dados do produtos", JOptionPane.ERROR_MESSAGE);
		
		
	}

}
