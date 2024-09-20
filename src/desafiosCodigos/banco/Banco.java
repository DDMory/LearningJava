package src.desafiosCodigos.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        Banco oBanco = new Banco();

        Conta conta = null;
        Cliente cliente = null;
        int op;

        do {
            System.out.println("\tSELECIONAR OPÇÃO DESEJADA:\n 1- criar conta corrente no banco\n 2- criar conta poupança no banco \n" +
                    " 3- deletar conta do banco\n 4- listar contas");
            op = terminal.nextInt();
            switch (op){
                case 1:
                    System.out.println("DIGITE UM NOME PARA A CONTA:");
                    cliente = new Cliente(terminal.nextLine());
                    conta = new ContaCorrente(cliente);
                    oBanco.adicionarConta(conta);
                    break;
                case 2:
                    System.out.println("DIGITE UM NOME PARA A CONTA:");
                    cliente = new Cliente(terminal.nextLine());
                    conta = new ContaPoupanca(cliente);
                    oBanco.adicionarConta(conta);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!!");
            }

        }while(op != 4);

    }
}
