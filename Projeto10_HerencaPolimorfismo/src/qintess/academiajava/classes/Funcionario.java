package qintess.academiajava.classes;

import qintess.academiajava.enumeracoes.Sexo;

public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;

	public Funcionario(String nome, String cargo, double salario) {
		super(nome);
		this.atribuirDados(cargo, salario);
	}

	public Funcionario(String nome, int idade, String cargo, double salario) {
		super(nome, idade);
		this.atribuirDados(cargo, salario);
	}

	public Funcionario(String nome, int idade, Sexo sexo, String cargo, double salario) {
		super(nome, idade, sexo);
		this.atribuirDados(cargo, salario);
	}
	
	//Método Auxiliar para o construtor Funcionario
	private void atribuirDados(String cargo, double salario) {
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	
	//Setters e Getters
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
		return super.mostrar() + "\nCargo: " + this.getCargo() + "\nSalário: " + this.getSalario();
	}

}
