package models.pessoa;

import models.prontuario.Prontuario;

public final class Paciente extends Pessoa {
    private long idPaciente;
    private Prontuario prontuario;

    public Paciente(String nome, String dataNacimento, String cpf, String email, long idPaciente) {
        super(nome, dataNacimento, cpf, email);
        this.idPaciente = idPaciente;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void indicarSatisfacao(int nivel){
        System.out.println("Indicar nivel de satisfação");
    }

    @Override
    public String toString() {
        return "Paciente:\n"
                +"Id Paciente: "
                + this.getIdPaciente()
                +", Nome: "
                + this.getNome()
                +", Data Nacimento: "
                + this.getDataNacimento()
                +", CPF: "
                + this.getCpf()
                +", Email: "
                + this.getEmail();
    }
}
