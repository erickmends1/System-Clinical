package dao;

import models.pessoa.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteDAO implements DAO<Paciente> {

    private List<Paciente> pacientes = new ArrayList<>();

    @Override
    public void salvar(Paciente obj) {
        this.pacientes.add(obj);
    }

    @Override
    public void alterar(int id, Paciente obj) {
        this.pacientes.set(id, obj);
    }

    @Override
    public List<Paciente> listarTodos() {
        return pacientes;
    }

    @Override
    public void remover(int id) {
        this.pacientes.remove(id);
    }
}
