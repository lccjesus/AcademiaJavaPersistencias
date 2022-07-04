package projeto.qintess.classe.dal;

import java.util.ArrayList;
import java.util.Collection;

import projeto.qintess.classe.entidades.Usuario;

public class UsuarioDAO extends Dao<Usuario> {
	
	@Override
	public void incluir(Usuario usuario) throws Exception {
		try {
			abrirConexao();

			String sql = "INSERT INTO TB_USUARIO (NOME, CPF, EMAIL, TELEFONE)" + " VALUES (?,?,?,?)";
			stmt = cn.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getCpf());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getTelefone());
			stmt.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
	}

	@Override
	public Usuario buscar(int pk) throws Exception {
		Usuario usuario = null;
		try {
			abrirConexao();
			String sql = "SELECT * FROM TB_USUARIO WHERE ID = ? ";

			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, pk);

			rs = stmt.executeQuery();

			if (rs.next()) {
				usuario = new Usuario();
				usuario.setId(pk);
				usuario.setNome(rs.getString("NOME"));
				usuario.setCpf("CPF");
				usuario.setEmail("EMAIL");
				usuario.setTelefone("TELEFONE");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		return usuario;
	}

	@Override
	public Collection<Usuario> listar() throws Exception {
		Collection<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			abrirConexao();
			String sql = "SELECT * FROM TB_USUARIO";
			stmt = cn.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("ID"));
				usuario.setNome(rs.getString("NOME"));
				usuario.setCpf(rs.getString("CPF"));
				usuario.setEmail(rs.getString("EMAIL"));
				usuario.setTelefone(rs.getString("TELEFONE"));
				usuarios.add(usuario);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		return usuarios;
	}

	public int excluir(int pk) throws Exception {
		int registros = 0;
		try {
			abrirConexao();
			String sql = "DELETE FROM TB_USUARIO WHERE ID = ? ";
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, pk);
			registros = stmt.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		return registros;
	}
}