package src.desafiosCodigos.banco.contracts;

import src.desafiosCodigos.banco.models.Conta;

public interface ContaContrato {
    abstract void sacar(double valor);
    abstract void depositar(double valor);
    abstract void transferir(double valor, Conta contaDestino);
    abstract void imprimirExtrato();
}
