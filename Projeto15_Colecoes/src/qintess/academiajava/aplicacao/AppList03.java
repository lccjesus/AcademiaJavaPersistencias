package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class AppList03 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();

		while (true) {
			String nome = JOptionPane.showInputDialog("Informe um nome: ");
			nomes.add(nome);

			int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar? ", "Confirmação",
					JOptionPane.YES_NO_OPTION);

			if (opcao == JOptionPane.NO_OPTION) {
				break;
			}

		}
		// Colocando a lista de nomes em ordem alfabetica.
		Collections.sort(nomes);
		
		nomes.forEach(nome -> System.out.println(nome));

	}

}
