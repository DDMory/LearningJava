package src.desafiosCodigos.banco;

public interface ContaContrato {
    abstract void sacar(double valor);
    abstract void depositar(double valor);
    abstract void transferir(double valor, Conta contaDestino);
    abstract void imprimirExtrato();
}
