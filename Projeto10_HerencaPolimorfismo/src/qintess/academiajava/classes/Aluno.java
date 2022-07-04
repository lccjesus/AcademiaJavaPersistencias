package qintess.academiajava.classes;

import qintess.academiajava.enumeracoes.Sexo;

public class Aluno extends Pessoa {
	private int matricula;
	private Curso curso;

	public Aluno(String nome, int idade, Sexo sexo, int matricula) {
		super(nome, idade, sexo);
		this.setMatricula(matricula);
	}

	public Aluno(String nome, int idade, Sexo sexo, int matricula, Curso curso) {
		this(nome, idade, sexo, matricula);
		this.setCurso(curso);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String mostrar() {
		String resposta = super.mostrar() + "\nMatricula: " + this.getMatricula();

		if (this.getCurso() != null) {
			resposta += "\n\nDADOS DO CURSO:\n" + this.getCurso().mostrar();
		} else {
			resposta += "\n\nMatricula em aberto";
		}

		return resposta;

	}

}
