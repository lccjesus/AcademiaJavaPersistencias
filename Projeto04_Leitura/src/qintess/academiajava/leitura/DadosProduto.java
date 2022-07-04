package qintess.academiajava.leitura;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class DadosProduto {
	public static void main(String[] args) {
		/*
		 * Solicitar os seguintes dados do produto:
		 * 
		 * - Marca (String) - Descrição (String) - Categoria (String) - Ano de
		 * Fabricação (int) - Preço do Produto (double) - Quantidade (double) - Valor
		 * Total (double)
		 * 
		 * Exemplo: Adidas, Camiseta, 2021, 45.0, 2.0, 90.0
		 */
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			String marca = JOptionPane.showInputDialog("Informe a marca do Produto:");
			String descricao = JOptionPane.showInputDialog("Informe a descricao do Produto:");
			String categoria = JOptionPane.showInputDialog("Informe a categoria do Produto:");
			int anoFab = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do Produto:"));
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do Produto:"));
			double quant = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do Produto:"));
			double total = preco * quant;

			// Gerando a resposta
			String resposta = "Marca: " + marca + "\nDescrição: " + descricao + "\nCategoria: " + categoria
					+ "\nAno de Fabricação: " + anoFab + "\nPreço: " + preco + "\nQuantidade: " + quant
					+ "\nTotal das compras:" + total;
			JOptionPane.showMessageDialog(null, resposta);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
