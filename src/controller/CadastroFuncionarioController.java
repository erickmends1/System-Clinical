package controller;

import dao.FuncionarioDAO;
import enums.Perfil;
import models.pessoa.Funcionario;
import services.CadastroFuncionarioService;

public class CadastroFuncionarioController {
    private Funcionario funcionario;
    private FuncionarioDAO funcionarioDAO;
    private CadastroFuncionarioService cadastroFuncionarioService;

    public CadastroFuncionarioController(FuncionarioDAO funcionarioDAO, Funcionario funcionario){
        this.funcionarioDAO = funcionarioDAO;
        this.funcionario = funcionario;
        this.cadastroFuncionarioService = new CadastroFuncionarioService(funcionarioDAO, funcionario);
    }

    public void iniciarCadastro(String nome, String dataNacimento, String cpf, String email, long idFuncionario, String login, String senha, Perfil perfil) throws Exception {

        cadastroFuncionarioService.cadastrarFuncionario(nome, dataNacimento, cpf, email, idFuncionario, login, senha, perfil);

    }
}
