package projeto.academiajava.classes;


import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class ExtratoBancario {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void comprovanteSaque(ContaPessoa conta, double valor) {
        try {
            FileWriter comprovanteFile = new FileWriter("C:\\AcademiaJAVA\\ExtratoBancario\\comprovanteSaque.txt", true);
            StringBuilder builder = new StringBuilder();
            builder.append("Comprovante de Saque").append('\n')
            .append("Agência: ").append(conta.getAgencia())
            .append(' ').append("Conta: ").append(conta.getConta()).append('\n')
            .append("Nome: ").append(conta.getNome()).append(" - CPF: ").append(conta.getCpf()).append('\n')
            .append("Data: ").append(dateFormat.format(new Date())).append('\n')
            .append("Valor do SACADO: ").append(valor).append('\n')
            .append("Saldo atual: ").append(conta.getSaldo()).append("\n\n");

            comprovanteFile.append(builder.toString());
            comprovanteFile.flush();
            comprovanteFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo");
            e.printStackTrace();
        }
    }

    public void comprovanteDeposito(ContaPessoa conta, double valor) {
        try {
            FileWriter comprovanteFile = new FileWriter("C:\\AcademiaJAVA\\ExtratoBancario\\comprovanteDep.txt", true);
            StringBuilder builder = new StringBuilder();
            builder.append("Comprovante de Depósito").append('\n')
                    .append("Agência: ").append(conta.getAgencia())
                    .append(' ').append("Conta: ").append(conta.getConta()).append('\n')
                    .append("Nome: ").append(conta.getNome()).append(" - CPF: ").append(conta.getCpf()).append('\n')
                    .append("Data: ").append(dateFormat.format(new Date())).append('\n')
                    .append("Valor do DEPOSITADO: ").append(valor).append('\n')
                    .append("Saldo atual: ").append(conta.getSaldo()).append("\n\n");

            comprovanteFile.append(builder.toString());
            comprovanteFile.flush();
            comprovanteFile.close();
        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo");
            e.printStackTrace();
        }
    }
}
