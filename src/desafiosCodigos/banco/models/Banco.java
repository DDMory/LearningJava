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
            if(contaEncontrada == false){
                System.out.printf("CONTA %s NÃO ENCONTRADA", nome);
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
