package Models;

public abstract class Instituicao {
    public String Nome;
    public String AreaAtuacao;
    public String Local;

    public Instituicao() {
    }

    public Instituicao(String nome, String areaAtuacao, String local) {
        Nome = nome;
        AreaAtuacao = areaAtuacao;
        Local = local;
    }
}
