package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppList04 {
	public static void main(String[] args) {

		// Criar lista de pessoas

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try {
			pessoas.add(new Aluno("Miguel", 10, Sexo.MASCULINO, 12356));
			pessoas.add(new Aluno("Marieta", 22, Sexo.FEMININO, 54686));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
