package qintess.academiajava.classes.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class GenericDao {
	protected Connection cn;
	protected PreparedStatement stmt;
	protected ResultSet rs;

	private String conexao = "jdbc:mysql://localhost:3306/db_eventos?useSSL=false";

	// Método para abrir conexão com o banco de dados.
	protected void abrirConexao() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection(conexao, "root", "Lu749685@");
		
	}

	// Método para fechar a conexão.
	protected void fecharConexao() throws Exception {
		if (cn != null && !cn.isClosed()) {
			cn.close();
		}

	}

}
