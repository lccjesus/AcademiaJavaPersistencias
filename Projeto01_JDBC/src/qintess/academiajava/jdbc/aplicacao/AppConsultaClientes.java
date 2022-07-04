package qintess.academiajava.jdbc.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.JOptionPane;

public class AppConsultaClientes {
	public static void main(String[] args) {
		try {
			// Definindo a String e conexão com banco de dados.
			String conexao = "jdbc:mysql://localhost:3306/db_banco?useSSL=false";

			// Habilitando o driver de acesso ao MySQL - Connector JAva
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Objetos de acesso a dados - Data Access Objects (DAO)
			Connection cn;
			PreparedStatement stmt;
			ResultSet rs;

			// Estabelecendo a conexão com o banco de dados.
			cn = DriverManager.getConnection(conexao, "root", "Lu749685@");

			// Escrevendo uma instrução SQL de consulta.
			String cs = "SELECT * FROM TB_CLIENTES";
			stmt = cn.prepareStatement(cs);
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				String cpf = rs.getString("CPF");
				String nome = rs.getString("NOME");
				Date dataNasc = rs.getDate("DATANASC");
				String telefone = rs.getString("TELEFONE");
				String sexo = rs.getString("SEXO");
				
				
				String resposta = "CPF: " + cpf +
						"\nNome: " + nome + 
						"\nData Nasc.: " + dataNasc + 
						"\nTelefone: " + telefone + 
						"\nSexo: " + sexo;
				System.out.println(resposta);
				System.out.println("-".repeat(40));
				
				
				
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());;
		}

	}

}
