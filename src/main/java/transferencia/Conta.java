package transferencia;

public class Conta {

    private String agencia;
    private String numConta;
    private double saldo;
    private Cliente proprietario;



    public Conta(String agencia, String numConta, double saldo, Cliente proprietario) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void realizarDeposito(double valor) {
        saldo += valor;

    }

    public boolean realizarSaque(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public boolean realizarTransferencia(double valor, Conta destino) {
        if (realizarSaque(valor)) {
            destino.realizarDeposito(valor);
            return true;
        }
        return false;
    }
}

