package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import qintess.academiajava.classes.Curso;

public class AppList05 {
	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			// Definindo uma lista de cursos
			List<Curso> cursos = new ArrayList<Curso>();
			// Solicitando a quantidade de cursos.
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de cursos: "));

			if (quantidade <= 0) {
				throw new Exception("A quantidade deve ser no minimo igual a 1. ");
			}
			// Obtendo os dados do curso, criando o objeto Curso com estes dados e
			// adicionando o objeto criado na lista.
			for (int i = 0; i < quantidade; i++) {
				String descricao = JOptionPane.showInputDialog("Informe a descrição: " + (i + 1));
				int ch = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária: " + (i + 1)));
				double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: " + (i + 1)));

				Curso curso = new Curso(descricao, ch, preco);

				cursos.add(curso);

			}
			
			
			// Ordenando a lista de cursos.
			Collections.sort(cursos);
			
			// Apresentando os dados para o usuário.
			cursos.forEach(s -> System.out.println(s.mostrar() + "\n"));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

		}
	}
}
