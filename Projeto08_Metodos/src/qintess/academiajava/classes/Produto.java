package qintess.academiajava.classes;

public class Produto {

	private String descricao;
	private String categoria;
	private double preco;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new NumberFormatException("O preço não pode ser negativo");
		}
		this.preco = preco;
	}

	// Metodos adicionais
	public void receber(String descricao, String categoria, double preco) {
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setPreco(preco);

	}
	// Sobrecarga de Métodos (Overloading) - quando 2 oi mais métodos possuirem
	// o mesmo nome, o mesmo retorno e lista de parametros diferentes, dizemos que estes
	// método estão sobrecarregados.
	//null - ausência de parametro.
	public void receber(String descricao, String categoria) {
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		
	}
	public void receber(String descricao) {
		this.setDescricao(descricao);
				
	}

	public String mostrar() {
		return "Descrição: " + this.getDescricao() + 
				"\nCategoria: " + this.getCategoria() + 
				"\nPreço: "
				+ this.getPreco();

	}

}
