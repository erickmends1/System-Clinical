package services;

import dao.AlunoDAO;
import dao.PacienteDAO;
import enums.Perfil;
import models.pessoa.Aluno;
import models.pessoa.Funcionario;
import models.pessoa.Paciente;

public class CadastroAlunoService {
    private AlunoDAO alunoDAO;
    private Funcionario funcionario;

    public CadastroAlunoService(AlunoDAO alunoDAO, Funcionario funcionario){
        this.funcionario = funcionario;
        this.alunoDAO = alunoDAO;
    }

    public void cadastrarAluno(String nome, String dataNacimento, String cpf, String email, long idAluno) throws Exception {
        if(funcionario.getPerfil() == Perfil.ADMIN || funcionario.getPerfil() == Perfil.ATENDENTE ){
            Aluno aluno = new Aluno(nome, dataNacimento, cpf, email, idAluno);
            alunoDAO.salvar(aluno);
        }else {
            throw new Exception("Permissão ou dados incorretos!");
        }
    }
}
