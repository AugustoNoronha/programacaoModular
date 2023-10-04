package Models.Classes;

import java.util.List;

public class Trabalho {
    private int Id;
    private String Titulo;
    private String Resumo;

    private List<Estudante> Estudantes;

    public Trabalho() {
    }

    public Trabalho(int id, String titulo, String resumo) {
        Id = id;
        Titulo = titulo;
        Resumo = resumo;
    }

    public Trabalho(String titulo, String resumo) {
        Titulo = titulo;
        Resumo = resumo;
    }

    public Trabalho(String titulo, String resumo, List<Estudante> estudantes) {
        Titulo = titulo;
        Resumo = resumo;
        Estudantes = estudantes;
    }

    public Trabalho(int id, String titulo, String resumo, List<Estudante> estudantes) {
        Id = id;
        Titulo = titulo;
        Resumo = resumo;
        Estudantes = estudantes;
    }

    public int getId() {
        return Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getResumo() {
        return Resumo;
    }

    public List<Estudante> getEstudantes() {
        return Estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        Estudantes = estudantes;
    }
}
