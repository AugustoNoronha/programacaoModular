package Models.Classes;

import Models.Abstratas.Pessoa;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class SessaoTecnica {
    private Date Data;
    private Time HoraInicio;
    private Time HoraFIm;

    private List<Pessoa> Pessoas;

    public SessaoTecnica() {
    }

    public SessaoTecnica(Date data, Time horaInicio, Time horaFIm) {
        Data = data;
        HoraInicio = horaInicio;
        HoraFIm = horaFIm;
    }

    public SessaoTecnica(Date data, Time horaInicio, Time horaFIm, List<Pessoa> pessoas) {
        Data = data;
        HoraInicio = horaInicio;
        HoraFIm = horaFIm;
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

    public Time getHoraFIm() {
        return HoraFIm;
    }

    public void setHoraFIm(Time horaFIm) {
        HoraFIm = horaFIm;
    }

    public List<Pessoa> getPessoas() {
        return Pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        Pessoas = pessoas;
    }
}
