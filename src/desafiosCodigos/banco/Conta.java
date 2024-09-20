package src.desafiosCodigos.banco;

public abstract class Conta implements ContaContrato{

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo = 0.0;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    @Override
    public void sacar(double valor) {
        if(valor > saldo){
            System.out.println("SALDO INSIFICIENTE!!");
        } else{
            saldo -=valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       if(this.saldo < valor){
           System.out.println("SALDO INSIFICENTE PARA TRANSFERENCIA");
       }else {
           this.sacar(valor);
           contaDestino.depositar(valor);
       }
    }

    protected void imprimirInfo(){
        System.out.printf("Nome cliente: %s", this.cliente);
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Numero: %d\n", this.numero);
        System.out.printf("Saldo: %.2f\n",this.saldo);
    }
}
