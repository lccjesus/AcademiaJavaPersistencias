package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import qintess.academiajava.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			Curso curso = new Curso("Java", 0, 0);
			JOptionPane.showMessageDialog(null, curso.mostrar());
		}  catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}


}
