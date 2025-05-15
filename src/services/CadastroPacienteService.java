package services;


import dao.PacienteDAO;
import enums.Perfil;
import models.pessoa.Funcionario;
import models.pessoa.Paciente;


public class CadastroPacienteService {
    private PacienteDAO pacienteDAO;
    private Funcionario funcionario;

    public CadastroPacienteService(Funcionario funcionario){
        this.funcionario = funcionario;
        this.pacienteDAO = new PacienteDAO();
    }

    public Boolean CadastrarFuncionario(String nome, String dataNacimento, String cpf, String email, long idPaciente){
         if(funcionario.getPerfil() == Perfil.ADMIN || funcionario.getPerfil() == Perfil.ATENDENTE ){
             Paciente paciente = new Paciente(nome, dataNacimento, cpf, email, idPaciente);
             pacienteDAO.salvar(paciente);
             return true;
         }else {
             return false;
         }
    }
}
