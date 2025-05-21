package models.consulta;

import enums.ClasseRisco;
import enums.StatusConsulta;
import enums.TipoConsulta;
import models.pessoa.Aluno;
import models.pessoa.Paciente;
import models.pessoa.Funcionario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private long idConsulta;
    private LocalDateTime dataHora;
    private Integer codigoAtendimento;
    private TipoConsulta tipo;
    private StatusConsulta status;
    private String observacao;
    private Integer nivelSatisfacao;
    private Paciente paciente;
    private ClasseRisco classeRisco;
    private Aluno aluno;
    private Funcionario funcionario;

    public Consulta(long idConsulta, String dataHora, Integer codigoAtendimento, TipoConsulta tipo, Paciente paciente, ClasseRisco classeRisco, Aluno aluno, Funcionario funcionario) {
        this.idConsulta = idConsulta;
        this.dataHora = LocalDateTime.parse(dataHora, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        this.codigoAtendimento = codigoAtendimento;
        this.tipo = tipo;
        this.status = StatusConsulta.AGENDADA;
        this.paciente = paciente;
        this.classeRisco = classeRisco;
        this.aluno = aluno;
        this.funcionario = funcionario;


    }

    public long getIdConsulta() {
        return idConsulta;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getCodigoAtendimento() {
        return codigoAtendimento;
    }

    public void setCodigoAtendimento(Integer codigoAtendimento) {
        this.codigoAtendimento = codigoAtendimento;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsulta tipo) {
        this.tipo = tipo;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusConsulta status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getNivelSatisfacao() {
        return nivelSatisfacao;
    }

    public void setNivelSatisfacao(Integer nivelSatisfacao) {
        this.nivelSatisfacao = nivelSatisfacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ClasseRisco getClasseRisco() {
        return classeRisco;
    }

    public void setClasseRisco(ClasseRisco classeRisco) {
        this.classeRisco = classeRisco;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Id: " + this.getIdConsulta()
                + "\nData: " + this.getDataHora()
                + "\nCódigo Atendimento: " + this.getCodigoAtendimento()
                + "\nTipo: " + this.getTipo()
                + "\nStatus: " + this.getStatus()
                + "\nObservação: " + this.getObservacao()
                + "\nNivel de Satisfacao: " + this.getNivelSatisfacao()
                + "\nPaciente: " + this.getPaciente().getNome()
                + "\nClasse de risco: " + this.getClasseRisco()
                + "\nAluno: " + this.getAluno().getNome()
                + "\nDoutor: " + this.getFuncionario().getNome();
    }
}
