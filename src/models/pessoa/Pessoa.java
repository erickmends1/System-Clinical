package models.pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public abstract class Pessoa {
    protected String nome;
    protected LocalDate dataNacimento;
    protected String cpf;
    protected String email;

    public Pessoa(String nome, String dataNacimento, String cpf, String email) {
        this.nome = nome;
        this.dataNacimento = LocalDate.parse(dataNacimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "Nome: "
                + this.getNome()
                + ", Data Nacimento: "
                + this.getDataNacimento()
                + ", CPF: "
                + this.getCpf()
                + ", Email: "
                + this.getEmail();
    }
}
