package Models.Multiplos.Estudante;

import java.util.ArrayList;
import java.util.List;

public class Estudantes {
    private static Estudante intancia;
    private List<Estudante> estudantes;

    public Estudantes(){
        this.estudantes = new ArrayList<>();
        carregarEstudante();
    }

    public static Estudante getIntancia(){
        return intancia;
    }

    public void addEstudante(Estudante estudante){
        estudantes.add(estudante);
    }

    public void carregarEstudante(){
        //sla pode fazedr algo
    }
}
