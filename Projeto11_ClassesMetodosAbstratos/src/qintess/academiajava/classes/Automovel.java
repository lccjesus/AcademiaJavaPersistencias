package qintess.academiajava.classes;

public class Automovel {
	// 1. Atributos
	private String marca;
	private String modelo;
	private int ano;
	private final String tipoMotor;

	// 2. Construtores
	public Automovel(String marca, String motor) {
		this.setMarca(marca);
		this.tipoMotor = motor;

	}

	public Automovel(String marca, String modelo, String motor) {
		this(marca, motor);
		this.setModelo(modelo);

	}

	public Automovel(String marca, String modelo, int ano, String motor) {
		this(marca, modelo, motor);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}

	// 3. Getters & Setters

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		if (ano < 1960) {
			throw new NumberFormatException("O Ano minimo é 1960");
		}
		this.ano = ano;
	}

	// 5. Métodos
	public String mostrar() {
		String resposta = "Marca: " + this.getMarca();

		if (this.getModelo() != null) {
			resposta += "\nModelo: " + this.getModelo();
		}
		if (this.getAno() != 0) {
			resposta += "\nAno: " + this.getAno();
		}
		resposta += "\nTipo Motor: " + this.getTipoMotor();
		return resposta;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Automovel) {
			Automovel auto = (Automovel) obj;
			if (this.getMarca().equals(auto.getMarca()) && this.getModelo().equals(auto.getModelo())
					&& this.getAno() == auto.getAno() && this.getTipoMotor().equals(auto.getTipoMotor())) {
				return true;
			}

		}
		return false;

	}

	@Override
	public String toString() {
		return "(" + this.getMarca() + ", " + this.getModelo() + ", " + this.getAno() + ")"; 
		
		
	}

	@Override
	public int hashCode() {
		return this.getMarca().hashCode() + this.getModelo().hashCode() + this.getAno();
		
	}
	
	
	
	

}
