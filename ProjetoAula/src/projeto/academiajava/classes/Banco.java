package projeto.academiajava.classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Banco {

	private List<ContaPessoa> contas = new ArrayList<>();
	private ExtratoBancario extratoBancario = new ExtratoBancario();

	public Banco() {
		criarClientes();
	}

	private void criarClientes() {
		ContaPessoa cliente = new ContaPessoa("JOSE CARLOS ALBUQUERQUE", "9999999999", 123, 1234567);
		contas.add(cliente);

		ContaPessoa cliente2 = new ContaPessoa("CLAUDIA RIBEIRO SENA", "88888888888", 123, 123456);
		contas.add(cliente2);
	}
	
	
	public ContaPessoa buscarConta(int agencia, int conta) {
		for (ContaPessoa contaPessoa : contas) {
			if (contaPessoa.getConta() == conta && contaPessoa.getAgencia() == agencia) {
				return contaPessoa;
			}
		}
		JOptionPane.showMessageDialog(null, "Agência não encontrada....");
		return null;
	}

	public void saque(int agencia, int conta, double valor) {
		ContaPessoa contaEncontrada = buscarConta(agencia, conta);
		if (contaEncontrada == null) {
			return;
		}
		if (!contaEncontrada.sacar(valor)) {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente....");
			return;
		}
		extratoBancario.comprovanteSaque(contaEncontrada, valor);
	}

	public void deposito(int agencia, int conta, double valor) {
		ContaPessoa contaEncontrada = buscarConta(agencia, conta);
		if (contaEncontrada == null) {
			return;
		}
		contaEncontrada.depositar(valor);
		extratoBancario.comprovanteDeposito(contaEncontrada, valor);
	}

	public static String selecionarOperacao() {
		String[] values = { "Saque", "Deposito" };

		Object selected = JOptionPane.showInputDialog(null, "ESCOLHA UMA OPERAÇÃO: ", "OPERAÇÃO",
				JOptionPane.QUESTION_MESSAGE, null, values, null);
		if (selected == null) {
			return null;
		} else {
			return selected.toString();
		}
	}

	public static Integer entradaValorPane(String mensagem) {
		Integer valor = null;
		while (valor == null) {
			String valorString = JOptionPane.showInputDialog(mensagem);
			try {
				valor = Integer.parseInt(valorString);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return valor;
		
	}
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
