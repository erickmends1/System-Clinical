package controller;

import models.pessoa.Funcionario;
import services.CadastroPacienteService;

public class CadastroPacienteController {
    private CadastroPacienteService cadastroPacienteService;
    private Funcionario funcionario;

    public CadastroPacienteController(Funcionario funcionario){
        this.funcionario = funcionario;
    }

    public boolean iniciarCadastro(String nome, String dataNacimento, String cpf, String email, long idPaciente){
        return cadastroPacienteService.CadastrarFuncionario(nome, dataNacimento, cpf, email, idPaciente);
    }
}
