package controller;


import models.pessoa.Funcionario;
import services.LoginService;

public class LoginController {

    private LoginService loginService = new LoginService();

    public Funcionario iniciarLogin(String login, String senha){
        return loginService.autenticar(login, senha);
    }
}
