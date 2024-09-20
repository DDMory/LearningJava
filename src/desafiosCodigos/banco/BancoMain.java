package src.desafiosCodigos.banco;

import src.desafiosCodigos.banco.models.*;

import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        Banco oBanco = new Banco();

        Cliente cliente;
        Conta conta;
        String nome;
        double valor;
        int op;

        do {
            System.out.println("""
                    \tSELECIONAR OPÇÃO DESEJADA:
                     1- criar conta corrente no banco
                     2- criar conta poupança no banco
                     3- deletar conta do banco
                     4- listar contas
                     5- Buscar Conta
                     6- sair da aplicação""");

            op = terminal.nextInt();
            switch (op){
                case 1:
                    System.out.println("DIGITE UM NOME PARA A CONTA:");
                    nome = terminal.next() + terminal.nextLine();
                    cliente = new Cliente(nome);
                    System.out.println("DIGITER UM VALOR INICIAL:");
                    valor = terminal.nextDouble();
                    conta = new ContaCorrente(cliente, valor);
                    oBanco.adicionarConta(conta);
                    break;
                case 2:
                    System.out.println("DIGITE UM NOME PARA A CONTA:");
                    nome = terminal.next() + terminal.nextLine();
                    cliente = new Cliente(nome);
                    System.out.println("DIGITER UM VALOR INICIAL:");
                    valor = terminal.nextDouble();
                    conta = new ContaPoupanca(cliente, valor);
                    oBanco.adicionarConta(conta);
                    break;
                case 3:
                    System.out.println("NOME DA CONTA A SER DELETADA:");
                    nome = terminal.next() + terminal.nextLine();
                    oBanco.deletarConta(nome);
                    break;
                case 4:
                    oBanco.imprimirContas();
                    break;
                case 5:
                    System.out.println("NOME DA CONTA A SER BUSCADA:");
                    nome = terminal.next() + terminal.nextLine();
                    oBanco.imprimirContaEspecifica(nome);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!!\n");
            }

        }while(op != 6);

    }
}
