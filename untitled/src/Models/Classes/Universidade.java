package Models.Classes;

import Models.Abstratas.Instituicao;

public class Universidade extends Instituicao {

    public Universidade(String nome, String areaAtuacao, String local) {
        super(nome, areaAtuacao, local);
    }

    private String Cursos;

    public String getCursos() {
        return Cursos;
    }

    public void setCursos(String cursos) {
        Cursos = cursos;
    }
}
