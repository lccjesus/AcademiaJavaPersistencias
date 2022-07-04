package qintess.academiajava.classes;

import qintess.academiajava.enumeracoes.Sexo;

public class Pessoa{
	private String nome;
	private int idade;
	private Sexo sexo;

	public Pessoa(String nome) {
		super();
		this.setNome(nome);
	}

	public Pessoa(String nome, int idade) {
		// super();
		this(nome);
		this.setIdade(idade);
	}

	public Pessoa(String nome, int idade, Sexo sexo) {
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

	public void setIdade(int idade) {
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
