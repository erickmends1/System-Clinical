package services;

import dao.FuncionarioDAO;
import models.pessoa.Funcionario;

public class LoginService {
    private FuncionarioDAO funcionarioDAO= new FuncionarioDAO();

    public Funcionario autenticar(String login, String senha) {
        Funcionario funcionarioLogado = funcionarioDAO.buscarPorLogin(login);
        if (funcionarioLogado == null || !funcionarioLogado.getSenha().equals(senha)){
            return null;
        }
        else {
            return funcionarioLogado;
        }
    }
}
