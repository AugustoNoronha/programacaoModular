package Models.Classes;

import Models.Abstratas.Instituicao;

public class Empresa extends Instituicao {
    public Empresa() {
    }

    public Empresa(String nome, String areaAtuacao, String local) {
        super(nome, areaAtuacao, local);
    }

    private String Interesses;
}
