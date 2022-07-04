package qintess.academiajava.classes;

public class ProdutoImport extends Produto {

	private String paisOrigem;

	public ProdutoImport(String descricao, String categoria, double preco, String pais) {
		super(descricao, categoria, preco);
		this.setPaisOrigem(pais);

	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	@Override
	public String mostrar() {
		return super.mostrar() + "\nPais de Origem: " + this.getPaisOrigem();
	}

}
