package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Curso;
import qintess.academiajava.enumeracoes.Sexo;

public class AppAluno {
	public static void main(String[] args) {

		// Definindo o objeto Curso.
		Curso curso = new Curso(110, "Fundamentos Java", 100, 1200);

		 //Definindo o objeto Aluno.
		Aluno aluno1 = new Aluno("Luiz Carlos",25, Sexo.MASCULINO, 1234);
		aluno1.setNome("Osvaldo Cardoso");
		aluno1.setIdade(25);
		aluno1.setSexo(Sexo.MASCULINO);
		JOptionPane.showMessageDialog(null, aluno1.mostrar());

		Aluno aluno2 = new Aluno("Paulo Gustavo", 52, Sexo.MASCULINO, 3361, curso);
		aluno2.setNome("Marta Madalena");
		aluno2.setIdade(36);
		aluno2.setSexo(Sexo.FEMININO);
		
		JOptionPane.showMessageDialog(null, aluno2.mostrar());
		
		Aluno aluno3 = new Aluno("Mariana Soares", 30, Sexo.FEMININO, 2215, 
				new Curso(999, "Psicologia", 4000, 2000));
		aluno3.setNome("Feliciano Rodrigues");
		aluno3.setIdade(36);
		aluno3.setSexo(Sexo.MASCULINO);
		
		
		JOptionPane.showMessageDialog(null, aluno3.mostrar());
		
	}

}
