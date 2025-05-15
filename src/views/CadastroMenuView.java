package views;

import models.pessoa.Funcionario;

import java.util.Scanner;

public class CadastroMenuView {

    private Scanner scanner;
    private Funcionario funcionario = null;

    public CadastroMenuView(Funcionario funcionario){
        this.scanner = new Scanner(System.in);
        this.funcionario = funcionario;
    }

    public void exibirMenuAdministrador() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("===== CLINICAL SYSTEM =====");
            System.out.println("1 - Pacientes");
            System.out.println("2 - Alunos");
            System.out.println("3 - Funcionarios");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu: Paciente\n");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Alunos\n");
                        break;
                    case 3:
                        System.out.println("Você escolheu: Funcionários\n");
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
