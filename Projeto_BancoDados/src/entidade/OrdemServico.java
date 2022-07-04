package entidade;

import java.io.Serializable;
import java.util.ArrayList;

public class OrdemServico implements Serializable {

	private static final long serialVersionUID = 1L;
	public static ArrayList<OrdemServico> listaOrdemServico = new ArrayList<OrdemServico>();

	public static void addOrdemServico(OrdemServico ordemservico) {
		listaOrdemServico.add(ordemservico);
	}

	public static ArrayList<OrdemServico> getOrdemServico() {
		return OrdemServico.listaOrdemServico;
	}

	public static void setOrdemServico(ArrayList<OrdemServico> ordemservico) {
		OrdemServico.listaOrdemServico = ordemservico;
	}

	private Cliente cliente;
	private Servico servico;

	public OrdemServico(Cliente cliente, Servico servico) {
		this.cliente = cliente;
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Servico getServico() {
		return servico;
	}

	@Override
	public String toString() {
		return cliente.toString() + servico.toString() + "\n";
	}
}
