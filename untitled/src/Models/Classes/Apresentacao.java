package Models.Classes;

import java.sql.Time;

public class Apresentacao {
    private Time HoraApresentacao;

    public Apresentacao(Time horaApresentacao) {
        HoraApresentacao = horaApresentacao;
    }

    public Time getHoraApresentacao() {
        return HoraApresentacao;
    }

    public void setHoraApresentacao(Time horaApresentacao) {
        HoraApresentacao = horaApresentacao;
    }
    public String toString() {
        return "HoraApresentacao: " + HoraApresentacao;
    }
}
