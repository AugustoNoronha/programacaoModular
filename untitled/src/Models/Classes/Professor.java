package Models.Classes;

import Models.Abstratas.Pessoa;

public class Professor extends Pessoa {
    public Professor(String nome, String email){
        super(nome, email);
    }
    private Long Matricula;

    public Professor(String nome, String email, Long matricula) {
        super(nome, email);
        Matricula = matricula;
    }

    public Long getMatricula() {
        return Matricula;
    }

    public void setMatricula(Long matricula) {
        Matricula = matricula;
    }
}
