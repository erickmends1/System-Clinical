package controller;

import models.pessoa.Funcionario;
import services.CadastroPacienteService;

public class CadastroPacienteController {
        private Funcionario funcionario;
        private CadastroPacienteService cadastroPacienteService;

    public CadastroPacienteController(Funcionario funcionario){
        this.funcionario = funcionario;
        this.cadastroPacienteService = new CadastroPacienteService(funcionario);
    }

    public void iniciarCadastro(String nome, String dataNacimento, String cpf, String email, long idPaciente) throws Exception {

        cadastroPacienteService.CadastrarFuncionario(nome, dataNacimento, cpf, email, idPaciente);

    }
}
