package services;

import dao.ConsultaDAO;
import enums.ClasseRisco;
import enums.Perfil;
import enums.TipoConsulta;
import models.consulta.Consulta;
import models.pessoa.Aluno;
import models.pessoa.Funcionario;
import models.pessoa.Paciente;

public class ConsultaService {
    private ConsultaDAO consultaDAO;
    private Funcionario funcionario;

    public ConsultaService(ConsultaDAO consultaDAO, Funcionario funcionario) {
        this.consultaDAO = consultaDAO;
        this.funcionario = funcionario;
    }

    public void marcarConsulta(long idConsulta, String dataHora, Integer codigoAtendimento, TipoConsulta tipo, Paciente paciente, ClasseRisco classeRisco, Aluno aluno, Funcionario funcionario) throws Exception {
        if(funcionario.getPerfil() == Perfil.ADMIN || funcionario.getPerfil() == Perfil.ATENDENTE ) {
            Consulta consulta = new Consulta(idConsulta, dataHora, codigoAtendimento, tipo, paciente, classeRisco, aluno, funcionario);
            consultaDAO.salvar(consulta);
        }else {
            throw new Exception("Permissão ou dados incorretos!");
        }
    }

    public void EditarConsulta(){

    }

}
