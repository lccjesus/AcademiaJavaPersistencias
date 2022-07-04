package qintess.academiajava.classes;

public class Produto {

	private final int codigo;
	private String descricao;
	private String categoria;
	private double preco;

	private static int CONTADOR = 1;

	// Construtor: Todos os atributos do produto devem ser informados.
	public Produto(String descricao, String categoria, double preco) {
		super();
		this.codigo = CONTADOR++;

		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setPreco(preco);
	}

	// Getters & Setters
	public String getDescricao() {
		return descricao;
	}

	public int getCodigo() {
		return codigo;
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
	public String mostrar() {
		return "Código: " + this.getCodigo() + "\nDescrição: " + this.getDescricao() + "\nCategoria: "
				+ this.getCategoria() + "\nPreço: " + this.getPreco();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Produto) {
			Produto produto = (Produto) obj;
			if (this.getDescricao().equals(produto.getDescricao()) && this.getCategoria().equals(produto.getCategoria())
					&& this.getPreco() == produto.getPreco()) {
				return true;
			}
		}
		return false;

	}

	@Override
	public String toString() {
		return this.getCodigo() + " - " + this.getDescricao();
	}
	

}
