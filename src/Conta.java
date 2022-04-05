public abstract class Conta implements IntConta {

    private static final int AGENCIA_PADRAO = 14;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldoInicial = 50;
    protected double saldoFinal;
    protected Cliente cliente;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldoFinal = this.saldoInicial -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldoFinal = this.saldoInicial += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
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

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println("------EXTRAT0------");
        System.out.println(String.format("AGENCIA: %d", agencia));
        System.out.println(String.format("CONTA: %d", conta));
        System.out.println(String.format("SALDO: %.2f", saldoFinal));
        System.out.println("--FINALIZADO COM SUCESSO--");
    }
}
