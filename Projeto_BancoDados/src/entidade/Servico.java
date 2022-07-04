package entidade;

import java.io.Serializable;
import java.util.HashMap;

import util.Data;

//ArrayList de serviços = listaServiço;

public class Servico implements Serializable { // classe principal

	private static final long serialVersionUID = 1L;
	private static HashMap<Integer, Servico> listaServico = new HashMap<Integer, Servico>();

	public static void addServico(Servico servico) {
		listaServico.put(servico.getNumero(), servico);
	}

	public static HashMap<Integer, Servico> getServicos() {
		return Servico.listaServico;
	}

	public static void setServicos(HashMap<Integer, Servico> servicos) {
		Servico.listaServico = servicos;
	}

	protected int numero; // protected : posso acessar pela classe e subclasse somente
	protected String mecanico;
	protected Data data;

	public Servico(int numero, String mecanico, Data data) {
		this.numero = numero;
		this.mecanico = mecanico;
		this.data = data;
	}

	public int getNumero() {
		return numero;
	}

	public String getMecanico() {
		return mecanico;
	}

	public Data getData() {
		return data;
	}

	@Override
	public String toString() {
		String dadosServico = "Numero : " + numero + "\n Mecanico : " + mecanico + " Data : " + data + "\n";
		return dadosServico + "\n";
	}

}
