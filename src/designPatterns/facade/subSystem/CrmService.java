package src.designPatterns.facade.subSystem;

public class CrmService {

    public CrmService() {}

    public static void gravrCliente
            (String nome, String cep, String cidade, String estado){
        System.out.println("Cliente slavo no sistema CRM!");
        System.out.println("NOME: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("CIDADE: " + cidade);
        System.out.println("ESTADO: " + estado);
    }
}
