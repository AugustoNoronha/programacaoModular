package Models.Abstratas;

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

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getAreaAtuacao() {
        return AreaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        AreaAtuacao = areaAtuacao;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }
}
