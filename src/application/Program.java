package application;

import controller.CadastroAlunoController;
import controller.CadastroFuncionarioController;
import controller.CadastroPacienteController;
import dao.AlunoDAO;
import dao.FuncionarioDAO;
import dao.PacienteDAO;
import enums.Perfil;
import models.pessoa.Aluno;
import models.pessoa.Funcionario;
import models.pessoa.Paciente;

public class Program {
    public static void main(String[] args) {
        //Lista de Funcionarios
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        PacienteDAO pacienteDAO = new PacienteDAO();
        AlunoDAO alunoDAO = new AlunoDAO();

        Funcionario admin = new Funcionario("Administrador", "01/01/2000", "11122233300", "admin@clinical.org", 1, "admin", "admin", Perfil.ADMIN);

        CadastroPacienteController cadPaciente = new CadastroPacienteController(pacienteDAO, admin);
        CadastroFuncionarioController cadFuncionario = new CadastroFuncionarioController(funcionarioDAO, admin);
        CadastroAlunoController cadAluno = new CadastroAlunoController(alunoDAO, admin);
        try {
            cadPaciente.iniciarCadastro("Erick Mendes", "16/07/2004", "61108519300", "erickmendes126@gmail.com", 1);
            cadFuncionario.iniciarCadastro("Nathaly Gusmão", "18/11/2006", "12345678901", "nathaly.gusmao@clinical.org", 2, "nathaly18", "naty18", Perfil.ATENDENTE);
            cadAluno.iniciarCadastro("Marcos Rodrigues", "19/04/2005", "15975312300", "marcos.rodrigues@gmail.com", 1);

            System.out.println("Funcionarios: " );
            for (Funcionario funcionario: funcionarioDAO.listarTodos()){
                System.out.println(funcionario.toString());
            }

            System.out.println();
            System.out.println("Alunos: " );
            for (Aluno aluno: alunoDAO.listarTodos()){
                System.out.println(aluno.toString());
            }

            System.out.println();
            System.out.println("Pacientes: " );
            for (Paciente paciente: pacienteDAO.listarTodos()){
                System.out.println(paciente.toString());
            }
        }
        catch (Exception e){
            System.out.println("Erro:  " + e.getMessage());
        }

    }
}
