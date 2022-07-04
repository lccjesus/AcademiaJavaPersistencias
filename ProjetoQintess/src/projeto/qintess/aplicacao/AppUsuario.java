package projeto.qintess.aplicacao;

import javax.swing.JOptionPane;

import projeto.qintess.classe.dal.UsuarioDAO;
import projeto.qintess.classe.entidades.Usuario;

public class AppUsuario {
	public static void main(String[] args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setNome(JOptionPane.showInputDialog("Informe o NOME"));
		usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF"));
		usuario.setEmail(JOptionPane.showInputDialog("Informe o EMAIL"));
		usuario.setTelefone(JOptionPane.showInputDialog("Informe o TELEFONE"));

		UsuarioDAO dao = new UsuarioDAO();
		dao.incluir(usuario);
		JOptionPane.showMessageDialog(null, "Sucesso na inclusão....");
		

	}

}
