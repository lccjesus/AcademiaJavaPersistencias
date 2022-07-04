package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.DocumentoCnpj;
import qintess.academiajava.classes.DocumentoCpf;
import qintess.academiajava.interfaces.Documento;

public class AppDocumentos {
	public static void main(String[] args) {
		
		Documento cpf = new DocumentoCpf("98041347568");
		System.out.println(cpf.getNumero());
		
		Documento cnpj = new DocumentoCnpj("01032420000106");
		System.out.println(cnpj.getNumero());
		
		
		
		
		
	}
	

}
