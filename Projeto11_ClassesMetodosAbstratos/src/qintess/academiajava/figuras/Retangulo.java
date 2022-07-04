package qintess.academiajava.figuras;

public class Retangulo extends Figura {
	private double base;
	private double altura;

	// Construtor

	public Retangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (base <= 0) {
			throw new IllegalArgumentException("A base devem ser positivas.");
		}
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("A altura devem ser positivas.");
		}
		this.altura = altura;
	}

	@Override
	public double calcArea() {
		return this.getBase() * this.getAltura();
	}

}
