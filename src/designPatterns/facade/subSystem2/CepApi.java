package src.designPatterns.facade.subSystem2;

public class CepApi {
    private static CepApi instancia = new CepApi();

    public CepApi() {}

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "CIDADE: XXX";
    }

    public String recuperarEstado(String cep){
        return "ESTADO: ZZZZ";
    }
}
