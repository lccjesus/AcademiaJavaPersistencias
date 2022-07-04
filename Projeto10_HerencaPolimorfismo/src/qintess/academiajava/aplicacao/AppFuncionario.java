package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.enumeracoes.Sexo;

public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Julio Pereira", 32, Sexo.MASCULINO, "Motoboy", 3000);
		JOptionPane.showMessageDialog(null, funcionario.mostrar());

	}

}
