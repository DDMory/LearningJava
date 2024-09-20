package src.desafiosCodigos.banco.models;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, double valor) {
        super(cliente);
        super.setSaldo(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA PUPANÇA ===");
        super.imprimirInfo();
    }
}
