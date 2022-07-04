package qintess.academiajava.classes.dal;

import java.util.ArrayList;
import java.util.Collection;

import qintess.academiajava.classes.viewmodels.EventosConvidadosVM;

public class EventoConvidadosDao extends GenericDao{

	public Collection<EventosConvidadosVM> listar() throws Exception {
		Collection<EventosConvidadosVM> lista = new ArrayList<EventosConvidadosVM>();

		try {
			abrirConexao();
			StringBuilder sb = new StringBuilder()
					.append("SELECT")
					.append(" C.NOME AS NOME,")
					.append(" C.EMAIL AS EMAIL,")
					.append(" E.DESCRICAO AS EVENTO")
					.append(" FROM")
					.append(" TB_EVENTOS E, TB_CONVIDADOS C")
					.append(" WHERE")
					.append(" E.ID = C.IDEVENTO");
			
			stmt = cn.prepareStatement(sb.toString());
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				EventosConvidadosVM vm = new EventosConvidadosVM();
				vm.setNome(rs.getString("NOME"));
				vm.setEmail(rs.getString("EMAIL"));
				vm.setEvento(rs.getString("EVENTO"));
				
				lista.add(vm);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		return lista;
	}

}
