package dao;

import models.consulta.Consulta;

import java.util.ArrayList;
import java.util.List;

public class ConsultaDAO implements DAO<Consulta> {
    private List<Consulta> consultas = new ArrayList<>();
    @Override
    public void salvar(Consulta obj) {
        this.consultas.add(obj);
    }

    @Override
    public void alterar(int id, Consulta obj) {
        this.consultas.set(id, obj);
    }

    @Override
    public List<Consulta> listarTodos() {
        return consultas;
    }

    @Override
    public void remover(int id) {
        this.consultas.remove(id);
    }
}
