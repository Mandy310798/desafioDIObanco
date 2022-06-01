public abstract class Conta {

    protected static final int agencia_padrao = 1;

    private static int sequencial = 1;
    protected int agencia;
    protected  int numero;
    protected  double saldo;

    public Conta() {
        this.agencia = Conta.agencia_padrao;
        this.numero = sequencial++;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}