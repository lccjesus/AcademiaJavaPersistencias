package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPolimorfismo {
	public static void main(String[] args) {
		Pessoa pessoa;
		
		// pessoa referenciando uma instancia de Pessoa
		pessoa = new Pessoa("Luciana", 35, Sexo.FEMININO);
		JOptionPane.showMessageDialog(null, pessoa.mostrar());
		
		
		// pessoa referenciando uma instancia de Funcionario
		Funcionario funcionario = new Funcionario("Manoel", 45, Sexo.MASCULINO,"Motorista", 4000);
		pessoa = funcionario;
		JOptionPane.showMessageDialog(null, pessoa.mostrar());
		
		// pessoa referenciando uma instancia de Aluno
		Aluno aluno = new Aluno("Luana", 30, Sexo.FEMININO,1234);
		pessoa = aluno;
		JOptionPane.showMessageDialog(null, pessoa.mostrar());
			
		
	}
	
	
		
		
		
		
	
}
