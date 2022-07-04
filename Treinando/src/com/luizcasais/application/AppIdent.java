package com.luizcasais.application;

import javax.swing.JOptionPane;

import com.luizcasais.classes.Identidade;

public class AppIdent {
	public static void main(String[] args) {
		Identidade identidade = new Identidade();
		JOptionPane.showMessageDialog(null, "****** BEM VINDO AO SISTEMA DE GERAÇÃO DE IDENTIDADE ******");
		identidade.receber((int) (Math.random() * 999999999), JOptionPane.showInputDialog("Digite seu nome: "),
				JOptionPane.showInputDialog("Digite nome do PAI: "),
				JOptionPane.showInputDialog("Digite nome da Mãe: "),
				JOptionPane.showInputDialog("Digite Data de Nascimento: "), "São Paulo",
				(int) (Math.random() * 999999999), (int) (Math.random() * 999999999), "16/03/2021");
		// System.out.println(identidade.mostrar());
		JOptionPane.showMessageDialog(null, identidade.mostrar());

	}

}
