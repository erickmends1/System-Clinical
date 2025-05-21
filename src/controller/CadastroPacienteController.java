package controller;

import dao.PacienteDAO;
import models.pessoa.Funcionario;
import services.CadastroPacienteService;

public class CadastroPacienteController {
    private PacienteDAO pacienteDAO;
    private Funcionario funcionario;
    private CadastroPacienteService cadastroPacienteService;

    public CadastroPacienteController(PacienteDAO pacienteDAO, Funcionario funcionario){
        this.pacienteDAO = pacienteDAO;
        this.funcionario = funcionario;
        this.cadastroPacienteService = new CadastroPacienteService(pacienteDAO, funcionario);
    }

    public void iniciarCadastro(String nome, String dataNacimento, String cpf, String email, long idPaciente) throws Exception {

        cadastroPacienteService.cadastrarPaciente(nome, dataNacimento, cpf, email, idPaciente);

    }
}
