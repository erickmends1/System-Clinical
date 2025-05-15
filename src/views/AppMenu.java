package views;

import models.pessoa.Funcionario;

import java.util.Scanner;

public class AppMenu {
    private Scanner scanner;
    private Funcionario funcionario = null;
    private CadastroMenuView cadastroMenuView;

    public AppMenu(Funcionario funcionario) {
        this.scanner = new Scanner(System.in);
        this.funcionario = funcionario;
    }

    public void exibirMenuAdministrador() {
        int opcaoMenu = -1;

        while (opcaoMenu != 0) {
            System.out.println("===== CLINICAL SYSTEM =====");
            System.out.println("1 - Cadastros");
            System.out.println("2 - Consulta");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");

            try {
                opcaoMenu = Integer.parseInt(scanner.nextLine());

                switch (opcaoMenu) {
                    case 1:
                        System.out.println("Você escolheu: Cadastros\n");
                        cadastroMenuView = new CadastroMenuView(funcionario);
                        cadastroMenuView.exibirMenuAdministrador();
                        break;
                    case 2:
                        System.out.println("Você escolheu: Consultas\n");
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.\n");
            }
        }

        scanner.close();
    }
    public void exibirMenuAtendente() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("===== CLINICAL SYSTEM =====");
            System.out.println("1 - Cadastros");
            System.out.println("2 - Consulta");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu: Cadastros\n");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Consultas\n");
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.\n");
            }
        }

        scanner.close();
    }

}
