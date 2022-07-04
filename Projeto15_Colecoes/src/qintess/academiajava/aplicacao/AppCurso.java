package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {

		try {
			Curso curso1 = new Curso("PHP Basico", 50, 1200);
			Curso curso2 = new Curso("React Avançado", 60, 1550);
			

			System.out.println(curso1);
			System.out.println(curso2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
