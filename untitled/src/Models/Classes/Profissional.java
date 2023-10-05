package Models.Classes;

import Models.Abstratas.Pessoa;;

public class Profissional extends Pessoa {
    public Profissional(String nome, String email){
        super(nome, email);
    }
    private Long Matricula;

    public Profissional(String nome, String email, Long matricula) {
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
