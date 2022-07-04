package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Curso;

public class AppAluno {
	public static void main(String[] args) {
		
		// Definindo o objeto Curso.
		Curso curso = new Curso();
		curso.setCodigo(110);
		curso.setDescricao("Funcamentos do Java");
		curso.setCh(100);
		curso.setPreco(1200);
		
		// Definindo o objeto Aluno.
		Aluno aluno = new Aluno()	;
		aluno.setNome("Luiz Carlos");
		aluno.setMatricula(1234);
		aluno.setCurso(curso);
		
		JOptionPane.showMessageDialog(null, aluno.mostrar());
		
		
	}

}
