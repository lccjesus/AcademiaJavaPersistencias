package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPessoas {
	public static void main(String[] args) {
		Pessoa p1 =	new 
				Funcionario("Luiz", 28, Sexo.MASCULINO, "Mecanico", 1300);
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		
		
	}

}
