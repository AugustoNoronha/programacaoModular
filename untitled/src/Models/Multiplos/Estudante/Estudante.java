package Models.Multiplos.Estudante;

import Models.Pessoa;

public class Estudante extends Pessoa {
    public Estudante(String nome, String email){
        super(nome, email);
    }
    private Long Matricula;

    public Estudante(Long matricula) {
        Matricula = matricula;
    }

    public Estudante(String nome, String email, Long matricula) {
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
