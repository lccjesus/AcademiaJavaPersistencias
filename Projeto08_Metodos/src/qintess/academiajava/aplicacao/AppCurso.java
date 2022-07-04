package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		Curso curso = new Curso();
		
		JOptionPane.showMessageDialog(null, curso.mostrar());
		
		
		
	}
	

}
