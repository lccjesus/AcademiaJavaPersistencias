package qintess.academiajava.classes;

public class Curso {
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;
	
	// Getters / Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String mostrar() {
		String resultado = "Código do curso: " + this.getCodigo() + 
				"\nDescrição: " + this.getDescricao() +
				"\nCarga Horária: " + this.getCh() +
				"\nPreço: " + this.getPreco();
		return resultado;
	}
	
	

}
