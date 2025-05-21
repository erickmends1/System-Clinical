package application;

import controller.CadastroPacienteController;
import dao.PacienteDAO;
import enums.Perfil;
import models.pessoa.Funcionario;
import services.CadastroPacienteService;

public class Program {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Administrador", "01/01/2000", "11122233300", "admin@clinical.org", 1, "admin", "admin", Perfil.ADMIN);

       CadastroPacienteController cadPaciente = new CadastroPacienteController(funcionario);

        try {
            cadPaciente.iniciarCadastro("Erick Mendes", "16/07/2004", "61108519300", "erickmendes126@gmail.com", 1);
        }
        catch (Exception e){
            System.out.println("Erro:  " + e.getMessage());
        }
    }
}
