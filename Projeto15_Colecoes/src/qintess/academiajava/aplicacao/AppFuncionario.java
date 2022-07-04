package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import qintess.academiajava.classes.DocumentoCpf;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.enumeracoes.Sexo;

public class AppFuncionario {
	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			String doc = JOptionPane.showInputDialog("Informe o Documento: ");
			String nome = JOptionPane.showInputDialog("Informe o Nome: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade: "));
			Sexo sexo = (Sexo) JOptionPane.showInputDialog(null, "Selecione o sexo", "Sexo",
					JOptionPane.INFORMATION_MESSAGE, null, Sexo.values(), null);

			String cargo = JOptionPane.showInputDialog("Informe o cargo");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o Sálario"));

			Funcionario funcionario = new Funcionario(new DocumentoCpf(doc), nome, idade, sexo, cargo, salario);
			JOptionPane.showMessageDialog(null, funcionario.mostrar());

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),
					"Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

}
