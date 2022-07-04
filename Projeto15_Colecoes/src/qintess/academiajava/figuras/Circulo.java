package qintess.academiajava.figuras;

public class Circulo extends Figura{
	
	private double raio;
	
	
	public Circulo(double raio) {
		
	}
	
	
	

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if(raio <= 0) {
			throw new IllegalArgumentException("O raio deve ser positivo.");
		}
		this.raio = raio;
	}


	@Override
	public double calcArea() {
		return Math.PI * Math.pow(this.getRaio(), 2);
	}
		

}
