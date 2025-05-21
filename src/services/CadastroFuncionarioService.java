package services;

import dao.FuncionarioDAO;
import enums.Perfil;
import models.pessoa.Funcionario;
import models.pessoa.Paciente;

public class CadastroFuncionarioService {
    private FuncionarioDAO funcionarioDAO;
    private Funcionario funcionarioLogado;

    public CadastroFuncionarioService(FuncionarioDAO funcionarioDAO, Funcionario funcionario) {
        this.funcionarioLogado = funcionario;
        this.funcionarioDAO = funcionarioDAO;
    }

    public void cadastrarFuncionario(String nome, String dataNacimento, String cpf, String email, long idFuncionario, String login, String senha, Perfil perfil) throws Exception {
        if (funcionarioLogado.getPerfil() == Perfil.ADMIN) {
            Funcionario funcionario = new Funcionario(nome, dataNacimento, cpf, email, idFuncionario, login, senha, perfil);
            funcionarioDAO.salvar(funcionario);
        } else {
            throw new Exception("Permissão ou dados incorretos!");
        }
    }
}
