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
                     6- sacar da conta
                     7- depositar da conta
                     8- transferir da conta
                     9- sair da aplicação""");

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
                    System.out.println("NOME DA CONTA A SER BUSCADA:");
                    nome = terminal.next() + terminal.nextLine();
                    System.out.println("DIGITE O VALOR QUE DESEJA SACAR:");
                    valor = terminal.nextDouble();
                    oBanco.sacarDaConta(nome,valor);
                    break;
                case 7:
                    System.out.println("NOME DA CONTA A SER BUSCADA:");
                    nome = terminal.next() + terminal.nextLine();
                    System.out.println("DIGITE O VALOR QUE DESEJA DEPOSITAR:");
                    valor = terminal.nextDouble();
                    oBanco.depositarNaConta(nome,valor);
                    break;
                case 8:
                    System.out.println("NOME DA CONTA DE ORIGEM: ");
                    String nomeOrigem = terminal.next() + terminal.nextLine();
                    System.out.println("NOME DA CONTA DE DESTINO:");
                    String nomeDestino = terminal.next() + terminal.nextLine();
                    System.out.println("DIGITE O VALOR QUE DESEJA TRANSFERIR:");
                    valor = terminal.nextDouble();
                    oBanco.transferirSaldo(nomeOrigem,nomeDestino,valor);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!!\n");
            }

        }while(op != 9);

    }
}
