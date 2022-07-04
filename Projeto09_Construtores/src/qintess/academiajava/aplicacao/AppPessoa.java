package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Edvaldo Santos");
		pessoa.setIdade(30);
		pessoa.setSexo(Sexo.MASCULINO);
		
		JOptionPane.showConfirmDialog(null, pessoa.mostrar());
		
		
		
	}

}
