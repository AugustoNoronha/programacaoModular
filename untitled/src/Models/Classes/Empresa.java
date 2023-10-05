package Models.Classes;

import Models.Abstratas.Instituicao;

public class Empresa extends Instituicao {

    public Empresa(String nome, String areaAtuacao, String local) {
        super(nome, areaAtuacao, local);
    }

    private String Interesses;

    public String getInteresses() {
        return Interesses;
    }

    public void setInteresses(String interesses) {
        Interesses = interesses;
    }

    public String toString() {
        return  "Empresa: " + Nome + '\'' +
                "Interesses: '" + Interesses + '\'' +
                "AreaAtuação: '" + AreaAtuacao + '\'' +
                "Local: " + Local + '\'';
    }
}
