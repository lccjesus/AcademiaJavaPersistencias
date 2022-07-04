package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.DocumentoCnpj;
import qintess.academiajava.classes.DocumentoCpf;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPessoas {
	public static void main(String[] args) {
		Pessoa p1 = new Funcionario(new DocumentoCpf("98041347568"), "Luiz", 28, Sexo.MASCULINO, "Mecanico", 1300);

		Pessoa p2 = new Funcionario(new DocumentoCnpj("01236345000106"), "Maria Clara", 35, Sexo.FEMININO,
				"Professora", 2500);

		JOptionPane.showMessageDialog(null, p1.mostrar());
		JOptionPane.showMessageDialog(null, p2.mostrar());
	}

}
