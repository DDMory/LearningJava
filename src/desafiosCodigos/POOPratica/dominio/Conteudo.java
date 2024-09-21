package src.desafiosCodigos.POOPratica.dominio;

public abstract class Conteudo {

    //constantes
    protected static final double XP_PADRAO = 10;

    //variaveis
    private String titulo;
    private String descricao;

    //metodos
    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
