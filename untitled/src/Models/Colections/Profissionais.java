package Models.Colections;

import Models.Classes.Profissional;

import java.util.ArrayList;
import java.util.List;

public class Profissionais {
    private static Profissional intancia;
    private List<Profissional> proficionais;

    public Profissionais(){
        this.proficionais = new ArrayList<>();
        carregarProfissional();
    }

    public static Profissional getIntancia(){
        return intancia;
    }

    public void addProfissional(Profissional profissional){
        proficionais.add(profissional);
    }

    public void carregarProfissional(){
        //sla pode fazedr algo
    }
}
