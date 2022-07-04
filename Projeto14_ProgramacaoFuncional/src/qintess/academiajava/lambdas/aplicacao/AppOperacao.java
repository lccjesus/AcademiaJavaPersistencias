package qintess.academiajava.lambdas.aplicacao;

import qintess.academiajava.lambdas.interfaces.Operacao;

public class AppOperacao {

	// int executar(String s)
	public static void main(String[] args) {

		Operacao p1 = x -> x.length();
		System.out.println(p1.executar("Academia Java da Qintess"));

	}

}
