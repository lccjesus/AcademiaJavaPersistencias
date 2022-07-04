package projeto.academiajava.classes;

public class ContaPessoa extends Cliente implements ContaOperacoes {

    private int agencia;
    private int conta;
    private double saldo = 0d;

    public ContaPessoa(String nome, String cpf, int agencia, int conta) {
        super(nome, cpf);
        setAgencia(agencia);
        setConta(conta);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        saldo += valor;
        return saldo;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
