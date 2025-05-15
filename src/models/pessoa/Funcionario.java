package models.pessoa;

import enums.Perfil;


public final class Funcionario extends Pessoa {
    private long idFuncionario;
    private String login;
    private String senha;
    private Perfil perfil;

    public Funcionario(String nome, String dataNacimento, String cpf, String email, long idFuncionario, String login, String senha, Perfil perfil) {
        super(nome, dataNacimento, cpf, email);
        this.idFuncionario = idFuncionario;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

}
