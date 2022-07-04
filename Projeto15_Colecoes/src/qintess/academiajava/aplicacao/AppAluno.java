package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Curso;
import qintess.academiajava.enumeracoes.Sexo;

public class AppAluno {
	public static void main(String[] args) {
		try {
			//Instancia da classe aluno
			Aluno aluno = new Aluno("Getulio Vargas", 45, Sexo.MASCULINO, 4321);
			
			//Lista de cursos
			List<Curso> cursos = new ArrayList<Curso>();
			cursos.add(new Curso("PHP Basico", 150, 1200));
			cursos.add(new Curso("React Avançado", 60, 1550));
			
			//Atribuindo a lista de cursos para o aluno.
			aluno.setCursos(cursos);
			
			//Apresentando a lista de cursos.
			System.out.println(aluno.listarCursos());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
