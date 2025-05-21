package views;

import controller.LoginController;
import models.pessoa.Funcionario;

import java.util.Scanner;

public class LoginView {
    private Scanner scanner = new Scanner(System.in);
    private Funcionario fun = null ;
    private LoginController loginController = new LoginController();


    public void exibirLogin(){
        while (fun == null){
            System.out.println();
            System.out.println("===== LOGIN =====");
            String login = solicitarLogin();
            String senha = solicitarSenha();

            fun = loginController.iniciarLogin(login, senha);

            if (fun == null){
                System.out.println("❌ Erro: Login ou senha inválidos!");
                continue;
            } else {
                System.out.println("✅ Bem-vindo, " + fun.getNome() + "!");
            }
        }
        switch (fun.getPerfil()){
            case ADMIN:
                System.out.println("Usuario: "+ fun.getPerfil());
                System.out.println("Menu...");
                break;
            case ATENDENTE:
                System.out.println("Usuario: "+ fun.getPerfil());
                System.out.println("Menu...");
                break;
            case NUTRICIONISTA:
                System.out.println("Usuario: "+ fun.getPerfil());
                System.out.println("Tela de Nutricionista em MANUTENÇÃO");
                break;
            case PSICOLOGO:
                System.out.println("Usuario: "+ fun.getPerfil());
                System.out.println("Tela de Psicologo em MANUTENÇÃO");
                break;
            default:
                System.out.println("Usuário inválido. Tente novamente.\n");
        }

    }

    public String solicitarLogin() {
        System.out.print("Login: ");
        return scanner.nextLine();
    }

    public String solicitarSenha() {
        System.out.print("Senha: ");
        return scanner.nextLine();
    }
}
