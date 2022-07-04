package qintess.academiajava.jdbc.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class AppCadastroClientes {
	public static void main(String[] args) {
		try {

			// Definindo a String e conexão com banco de dados.

			String conexao = "jdbc:mysql://localhost:3306/db_banco?useSSL=false";

			// Habilitando o driver de acesso ao MySQL - Connector JAva
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Objetos de acesso a dados - Data Access Objects (DAO)
			Connection cn;
			PreparedStatement stmt;

			// Estabelecendo a conexão com o banco de dados.
			cn = DriverManager.getConnection(conexao, "root", "Lu749685@");

			// Obtendo dados do usuário
			String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
			String nome = JOptionPane.showInputDialog("Digita o Nome:");
			String data = JOptionPane.showInputDialog("Informe a date de nascimento (dd/MM/yyy):");

			Date dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(data);
			String telefone = JOptionPane.showInputDialog("Informe o telefone:");
			String sexo = JOptionPane.showInputDialog("Informe o sexo (M, F ou O):");

			// Escrevendo a instrução SQL para incluir um novo registro na mesma ordem de
			// instrução.
			String sql = "INSERT INTO TB_CLIENTES (CPF, NOME, DATANASC, TELEFONE, SEXO)" + " VALUES (?, ?, ?, ?, ?)";

			stmt = cn.prepareStatement(sql);
			stmt.setString(1, cpf);
			stmt.setString(2, nome);
			stmt.setDate(3, new java.sql.Date(dataNasc.getTime()));
			stmt.setString(4, telefone);
			stmt.setString(5, sexo);

			// Executa a inserção de dados no banco de dados.
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Cliente incluido com sucesso!!!");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
	}

}
