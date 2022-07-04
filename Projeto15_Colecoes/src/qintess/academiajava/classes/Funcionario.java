package qintess.academiajava.classes;

import java.text.NumberFormat;

import qintess.academiajava.enumeracoes.Sexo;
import qintess.academiajava.interfaces.Documento;

public class Funcionario extends Pessoa {

	private Documento documento;
	private String cargo;
	private double salario;
	private double irpf;

	public Funcionario(Documento documento, String nome, String cargo, double salario) {
		super(nome);
		this.atribuirDados(documento, cargo, salario);
	}

	public Funcionario(Documento documento, String nome, int idade, String cargo, double salario)
			throws IllegalAccessException {
		super(nome, idade);
		this.atribuirDados(documento, cargo, salario);
	}

	public Funcionario(Documento documento, String nome, int idade, Sexo sexo, String cargo, double salario)
			throws IllegalAccessException {
		super(nome, idade, sexo);
		this.atribuirDados(documento, cargo, salario);
	}

	// Método Auxiliar para o construtor Funcionario
	private void atribuirDados(Documento documento, String cargo, double salario) {
		this.setDocumento(documento);
		this.setCargo(cargo);
		this.setSalario(salario);
	}

	// Setters e Getters

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
		
	}

	public void setSalario(double salario) {
		this.salario = salario;
		this.irpf = this.calcularIRPF(); // passo 3: (encapsulamento): ao atribuir o salario
	}									// já teremos o IRPF.	
	// passo 4: getter para o IRPF
	public double getIrpf() {
		return irpf;
	}

	@Override
	public String mostrar() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		
		
		// Poderá ser utilizado dessa forma ou;
		return new StringBuilder()
				.append(super.mostrar())
				.append("\n")
				.append(this.getDocumento().getNumero())
				.append("\nCargo: ")
				.append(this.getCargo())
				.append("\nSalário: ")
				.append(nf.format(this.getSalario()))
				.append("\nIRPF: ")
				.append(nf.format(this.getIrpf())).toString();

		// Dessa forma
		/*
		 * StringBuilder sb = new StringBuilder() .append(super.mostrar()) .append("\n")
		 * .append(this.getDocumento().getNumero()) .append("\nCargo: ")
		 * .append(this.getCargo()) .append("\nSalário: ") .append(this.getSalario());
		 * 
		 * return sb.toString();
		 */
	}

	// passo 2: Calculo do imposto de renda
	private double calcularIRPF() {
		double[] aliquotas = { 0, 7.5, 15, 22.5, 27.5 };
		double[] valores = { 0, 1903.98, 2826.65, 3751.05, 4664.68 };

		double baseCalculo = this.getSalario();
		double imposto = 0;

		for (int i = aliquotas.length - 1; i >= 0; i--) {
			if (baseCalculo > valores[i]) {
				imposto += (baseCalculo - valores[i]) * aliquotas[i] / 100;
				baseCalculo = valores[i];
			}
		}
		return imposto;

	}
}
