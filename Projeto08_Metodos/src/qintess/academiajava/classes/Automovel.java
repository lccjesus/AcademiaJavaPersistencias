package qintess.academiajava.classes;

public class Automovel {
	private String marca;
	private String modelo;
	private int ano;

	// métodos
	public String mostrar() {
		String resposta = "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nAno" + this.getAno();
		return resposta;
	}

	public void receber(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if( ano < 1960) {
			throw new NumberFormatException("O Ano não é permitido menor que 1960");
		}
		this.ano = ano;
	}

	// getters / setters

}
