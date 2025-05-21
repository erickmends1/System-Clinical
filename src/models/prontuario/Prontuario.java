package models.prontuario;

import models.consulta.Consulta;
import models.pessoa.Paciente;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Prontuario {
    private long idProntuario;
    private LocalDateTime dataCriacao;
    private Paciente paciente;
    private List<Consulta> consultas = new ArrayList<>();


    public Prontuario(long idProntuario) {
        this.idProntuario = idProntuario;
        this.dataCriacao = LocalDateTime.now();
    }

    public long getIdProntuario() {
        return idProntuario;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
