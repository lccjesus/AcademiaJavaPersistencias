package projeto.academiajava.classes;

import javax.swing.JOptionPane;

public class AppItau extends Banco{
	
	public static void main(String[] args) {
        Banco banco = new Banco();

        Integer agencia = entradaValorPane("Digite a agência:");
        Integer conta = entradaValorPane("Digite a conta:");

        ContaPessoa contaPessoa = banco.buscarConta(agencia, conta);
        if (contaPessoa == null) {
            JOptionPane.showMessageDialog(null, "Conta não encontrada....");
            return;
        }

        while (true) {
            String operacao = selecionarOperacao();
            if (operacao == null) {
                break;
            }
            if (operacao.equals("Saque")) {
                banco.saque(agencia, conta, entradaValorPane("Valor do SAQUE:"));
            } else {
                banco.deposito(agencia, conta, entradaValorPane("Valor do DEPÓSITO:"));
            }
        }
    }

}
