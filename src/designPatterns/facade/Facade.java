package src.designPatterns.facade;

import src.designPatterns.facade.subSystem.CrmService;
import src.designPatterns.facade.subSystem2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravrCliente(nome,cep,cidade,estado);
    }
}
