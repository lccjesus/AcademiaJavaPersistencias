package entidade;

import java.io.Serializable;

import util.Data;

public class ManutencaoPneu extends Servico implements Serializable {

	private static final long serialVersionUID = 1L;

	public ManutencaoPneu(int numero, String mecanico, Data data) {
		super(numero, mecanico, data);
		// TODO Auto-generated constructor stub
	}

	private boolean novo;
	private int tamanho_aro;

	public ManutencaoPneu(int numero, String mecanico, Data data, boolean novo, int tamanho_aro) {
		super(numero, mecanico, data);
		this.numero = numero;
		this.tamanho_aro = tamanho_aro;
	}

	public boolean isNovo() {
		return novo;
	}

	public int getTamanho_aro() {
		return tamanho_aro;
	}

	private String toStringNovo() {
		if (!novo)
			return "Pneu usado";
		return "Pneu novo";
	}

	@Override
	public String toString() {
		String dados_pneu = " Ordem de serviço " + " N: " + numero + " Mecanico: " + mecanico + " Data: " + data
				+ " Estado do Pneu : " + toStringNovo() + " Tamanho do Aro : " + getTamanho_aro();
		return dados_pneu + "\n";
	}

}
