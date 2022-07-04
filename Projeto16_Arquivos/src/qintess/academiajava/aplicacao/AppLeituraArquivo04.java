package qintess.academiajava.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.enumeracoes.Sexo;
import qintess.academiajava.utils.Utilitarios;

public class AppLeituraArquivo04 {
	public static void main(String[] args) {
		/*
		 * Neste programa um arquivo contendo informações de alunos será aberto. Cada
		 * linha do arquivopossui a seguinte estrutura: - nome;idade;sexo;matricula
		 * Escreve o programa de forma a ler cada linha deste arquivo e usar as
		 * informaçoes desta linha para produzirobjetos da classe Aluno. Cada onjetos
		 * deverá ser adicionado em uma lista.
		 */

		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			// Abrindo o arquivo uma linha por vez.
			FileReader reader = new FileReader(Utilitarios.CAMINHO_ARQUIVO + "listaAlunos.csv");
			BufferedReader buffer = new BufferedReader(reader);

			while (true) {
				String linha = buffer.readLine();
				if (linha == null || linha.trim().length() == 0) {
					break;
				}//Fim do IF
				// Metodo Split() será usado para quebrar a linha de string tomando como base o
				// testo informado como parametro (;).
				String[] itens = linha.split(";");

				// Usaremos cada item do array resultante como atributos para um novo objeto da
				// classe Aluno.
				Aluno aluno = new Aluno(itens[0].trim(), Integer.parseInt(itens[1]),
						itens[2].trim().equals("M") ? Sexo.MASCULINO : Sexo.FEMININO, Integer.parseInt(itens[3].trim()));
				alunos.add(aluno);

			} // Fim While
			buffer.close();
			reader.close();

			System.out.println("Apresentando os dados dos alunos:");
			for (Aluno aluno : alunos) {
				System.out.println(aluno.mostrar());
				System.out.println();
			} // Fim do For

		} // Fim do Try
		catch (Exception e) {
			e.printStackTrace();
		} // Fim do Catch

	}// Fim do Main
}// Fim da Classe
