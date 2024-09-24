package one.digitalinnovation;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        System.out.println("INICIOU CONEXÃO!!");
    }

    public static void finalizarConexao(){
        System.out.println("CONEXÃO FINALIZADA..!");
    }

    public static void insereDado(Pessoa pessoa){
        System.out.println("Inseriu dados");
    }

    public static void removeDado(Pessoa pessoa){
        System.out.println("Removel dados");
    }
}
