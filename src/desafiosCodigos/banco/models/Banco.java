package src.desafiosCodigos.banco.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void deletarConta(String nome) {
        if (!contas.isEmpty()) {
            Conta contaDeletada = null;
            for (Conta c : contas) {
                if (c.cliente.getNome().equalsIgnoreCase(nome)) {
                    contaDeletada = c;
                    contas.remove(c);
                    System.out.println("CONTA DELETADA!!");
                    c.imprimirExtrato();
                    System.out.println("\n");
                    break;
                }
            }
            if (contaDeletada == null) {
                System.out.println("CONTA NÃO ENCONTRADA!!\n");
            }
        } else {
            System.out.println("NENHUMA CONTA NO BANCO!!\n");
        }
    }

    public void imprimirContas() {
        if (!contas.isEmpty()) {
            for (Conta c : contas) {
                c.imprimirExtrato();
            }
            System.out.println("\n");
        } else {
            System.out.println("NENUHMA CONTA NO BANCO");
        }
    }

    public void imprimirContaEspecifica(String nome){
        if(!contas.isEmpty()){

            boolean contaEncontrada = false;
            for(Conta c:contas){
                if(c.cliente.getNome().equalsIgnoreCase(nome)){
                    contaEncontrada=true;
                    c.imprimirExtrato();
                    break;
                }
            }
            if(!contaEncontrada){
                System.out.printf("CONTA %s NÃO ENCONTRADA", nome);
            }
        }else{
            System.out.println("NENGUMA CONTA NO BANCO");
        }
    }

    public void sacarDaConta(String nome, double valor){
        if(!contas.isEmpty()){

            boolean contaEncontrada = false;
            for(Conta c:contas){
                if(c.cliente.getNome().equalsIgnoreCase(nome)){
                    contaEncontrada=true;
                    c.sacar(valor);
                    break;
                }
            }
            if(!contaEncontrada){
                System.out.printf("CONTA %s NÃO ENCONTRADA", nome);
            }
        }else{
            System.out.println("NENGUMA CONTA NO BANCO");
        }
    }

    public void depositarNaConta(String nome, double valor){
        if(!contas.isEmpty()){

            boolean contaEncontrada = false;
            for(Conta c:contas){
                if(c.cliente.getNome().equalsIgnoreCase(nome)){
                    contaEncontrada=true;
                    c.depositar(valor);
                    break;
                }
            }
            if(!contaEncontrada){
                System.out.printf("CONTA %s NÃO ENCONTRADA", nome);
            }
        }else{
            System.out.println("NENGUMA CONTA NO BANCO");
        }
    }

    public void transferirSaldo(String nomeContaOrigem,String nomeContaDestino, double valor){
        if(!contas.isEmpty()){
            Conta origem = null;
            Conta destino = null;
            boolean contaDestinoEncontrada = false;
            boolean contaOrigemEncontrada = false;

            for(Conta c:contas){
                if(c.cliente.getNome().equalsIgnoreCase(nomeContaOrigem)){
                    contaOrigemEncontrada=true;
                    origem = c;
                }
                if(c.cliente.getNome().equalsIgnoreCase(nomeContaDestino)){
                    contaDestinoEncontrada=true;
                    destino = c;
                }
                if(destino != null && origem !=null)
                    break;
            }

            if(!contaDestinoEncontrada){
                System.out.printf("CONTA %s NÃO ENCONTRADA", nomeContaOrigem);
            } else if(!contaOrigemEncontrada){
                System.out.printf("CONTA %s NÃO ENCONTRADA", nomeContaDestino);
            } else{
                origem.transferir(valor,destino);
            }

        }else{
            System.out.println("NENGUMA CONTA NO BANCO");
        }
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
}
