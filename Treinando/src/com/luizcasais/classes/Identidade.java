package com.luizcasais.classes;

public class Identidade {
	private int reg;
	private String nome;
	private String filiacaoP;
	private String filiacaoM;
	private String dataNasc;
	private String naturalidade;
	private int cpf;
	private int pis;
	private String dataExpd;

	public float getReg() {
		return reg;
	}

	public String getFiliacaoP() {
		return filiacaoP;
	}

	public void setFiliacaoP(String filiacaoP) {
		this.filiacaoP = filiacaoP;
	}

	public String getFiliaçãoM() {
		return filiacaoM;
	}

	public void setFiliaçãoM(String filiaçãoM) {
		this.filiacaoM = filiaçãoM;
	}

	public void setReg(int reg) {
		this.reg = reg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public float getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public float getPis() {
		return pis;
	}

	public void setPis(int pis) {
		this.pis = pis;
	}

	public String getDataExpd() {
		return dataExpd;
	}

	public void setDataExpd(String dataExpd) {
		this.dataExpd = dataExpd;
	}

	public void receber(int reg, String nome, String filiacaoP, String filiacaoM, String dataNasc, String naturalidade,
			int cpf, int pis, String dataExpd) {
		this.setReg(reg);
		this.setNome(nome);
		this.setFiliacaoP(filiacaoP);
		this.setFiliaçãoM(filiacaoM);
		this.setDataNasc(dataNasc);
		this.setNaturalidade(naturalidade);
		this.setCpf(cpf);
		this.setPis(pis);
		this.setDataExpd(dataExpd);

	}

	public String mostrar() {
		return "RG: " + reg + "\nNome: " + nome + "\nNome do Pai: " + filiacaoP + "\nNome da Mãe: " + filiacaoM
				+ "\nData de Nasc.: " + dataNasc + "\nNatural: " + naturalidade + "\nCPF: " + cpf + "\nPIS: " + pis
				+ "\nData de Expedição: " + dataExpd;

	}

}
