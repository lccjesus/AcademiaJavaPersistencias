package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Curso;

public class AppAluno {
	public static void main(String[] args) {

		// Definindo o objeto Curso.
		Curso curso = new Curso(110, "Fundamentos Java", 100, 1200);

		 //Definindo o objeto Aluno.
		Aluno aluno1 = new Aluno("Gerson", 1234);
		JOptionPane.showMessageDialog(null, aluno1.mostrar());

		Aluno aluno2 = new Aluno("Osvaldo", 3361, curso);
		JOptionPane.showMessageDialog(null, aluno2.mostrar());
		
		Aluno aluno3 = new Aluno("Ana Maria", 2215, new Curso(999, "Psicologia", 4000, 2000));
		
		JOptionPane.showMessageDialog(null, aluno3.mostrar());
		
	}

}
