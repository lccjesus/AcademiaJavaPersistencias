package qintess.academiajava.classes;

public class Aluno {
	private String nome;
	private int matricula;
	private Curso curso;

	public Aluno(String nome, int matricula) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setCurso(curso);
		
	}

	public Aluno(String nome, int matricula, Curso curso) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	/*
	 * Ao criar um objeto na classe Aluno as informações consideradas obrigatória
	 * são: - nome - matricula
	 * 
	 * O curso não é obrigatório por que é possivel que este aluno ainda não tenha
	 * escolhido o curso que deseja fazer.
	 */

	public String mostrar() {
		String resposta = "Nome: " + this.getNome() + "\nMatricula: " + this.getMatricula();
		if (this.getCurso() != null) {
			resposta += "\n\nDADOS DO CURSO:\n" + this.getCurso().mostrar();
		} else {
			resposta += "\n\nMatricula em aberto";
		}

		return resposta;

	}

}
