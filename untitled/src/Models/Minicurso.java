package Models;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class Minicurso {
    private Date Data;
    private Time HoraInicio;
    private Time HoraFim;

    private List<Pessoa> Pessoas;

    public Minicurso() {
    }

    public Minicurso(Date data, Time horaInicio, Time horaFim) {
        Data = data;
        HoraInicio = horaInicio;
        HoraFim = horaFim;
    }

    public Minicurso(Date data, Time horaInicio, Time horaFim, List<Pessoa> pessoas) {
        Data = data;
        HoraInicio = horaInicio;
        HoraFim = horaFim;
        Pessoas = pessoas;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public Time getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        HoraInicio = horaInicio;
    }

    public Time getHoraFim() {
        return HoraFim;
    }

    public void setHoraFim(Time horaFim) {
        HoraFim = horaFim;
    }

    public List<Pessoa> getPessoas() {
        return Pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        Pessoas = pessoas;
    }
}
