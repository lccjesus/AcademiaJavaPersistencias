package qintess.academiajava.classes;

import qintess.academiajava.enumeracoes.Sexo;
import qintess.academiajava.interfaces.Documento;

public class Funcionario extends Pessoa {

	private Documento documento;
	private String cargo;
	private double salario;

	public Funcionario(Documento documento, String nome, String cargo, double salario) {
		super(nome);
		this.atribuirDados(documento, cargo, salario);
	}

	public Funcionario(Documento documento, String nome, int idade, String cargo, double salario) throws IllegalAccessException {
		super(nome, idade);
		this.atribuirDados(documento, cargo, salario);
	}

	public Funcionario(Documento documento, String nome, int idade, Sexo sexo, String cargo, double salario) throws IllegalAccessException {
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
	}

	@Override
	public String mostrar() {
		return super.mostrar() + "\n" + this.getDocumento().getNumero() + "\nCargo: " + this.getCargo() + "\nSalário: "
				+ this.getSalario();
	}

}
