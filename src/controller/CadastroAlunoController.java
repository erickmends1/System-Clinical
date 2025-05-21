package controller;

import dao.AlunoDAO;
import dao.PacienteDAO;
import models.pessoa.Funcionario;
import services.CadastroAlunoService;
import services.CadastroPacienteService;

public class CadastroAlunoController {
    private AlunoDAO alunoDAO;
    private Funcionario funcionario;
    private CadastroAlunoService cadastroAlunoService;

    public CadastroAlunoController(AlunoDAO alunoDAO, Funcionario funcionario){
        this.alunoDAO = alunoDAO;
        this.funcionario = funcionario;
        this.cadastroAlunoService = new CadastroAlunoService(alunoDAO, funcionario);
    }

    public void iniciarCadastro(String nome, String dataNacimento, String cpf, String email, long idAluno) throws Exception {

        cadastroAlunoService.cadastrarAluno(nome, dataNacimento, cpf, email, idAluno);

    }
}
