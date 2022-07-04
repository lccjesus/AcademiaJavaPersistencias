package qintess.academiajava.classes;

import qintess.academiajava.enumeracoes.Sexo;

public abstract class Pessoa{
	private String nome;
	private int idade;
	private Sexo sexo;

	/*
	 * Classes Abstratas: não podem ser instanciadas. São usadas
	 * apenas como SuperClasses.
	 * 
	 * 
	 */
	
	
	public Pessoa(String nome) {
		super();
		this.setNome(nome);
	}

	public Pessoa(String nome, int idade) throws IllegalAccessException {
		// super();
		this(nome);
		this.setIdade(idade);
	}

	public Pessoa(String nome, int idade, Sexo sexo) throws IllegalAccessException {
		this(nome, idade);
		this.setSexo(sexo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws IllegalAccessException {
		if(idade < 0) {
			throw new IllegalAccessException("A idade não pode ser negativa.");
		}
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String mostrar() {
		String resposta = "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo();
		return resposta;
	}

}
