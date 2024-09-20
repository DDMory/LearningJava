package src.desafiosCodigos.banco.models;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente, double valor) {
        super(cliente);
        super.setSaldo(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.imprimirInfo();
    }
}
