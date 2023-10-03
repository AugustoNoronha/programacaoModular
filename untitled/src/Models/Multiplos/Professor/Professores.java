package Models.Multiplos.Professor;

import Models.Multiplos.Estudante.Estudante;

import java.util.ArrayList;
import java.util.List;

public class Professores {
    private static Professor intancia;
    private List<Professor> professores;

    public Professores(){
        this.professores = new ArrayList<>();
        carregarProfessores();
    }

    public static Professor getIntancia(){
        return intancia;
    }

    public void addProfessor(Professor professor){
        professores.add(professor);
    }

    public void carregarProfessores(){
        //sla pode fazedr algo
    }
}
