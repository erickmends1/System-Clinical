package dao;

import models.prontuario.Prontuario;

import java.util.ArrayList;
import java.util.List;

public class ProntuarioDAO implements DAO<Prontuario>{
    private List<Prontuario> prontuarios = new ArrayList<>();

    @Override
    public void salvar(Prontuario obj) {
        this.prontuarios.add(obj);
    }

    @Override
    public void alterar(int id, Prontuario obj) {
        this.prontuarios.set(id, obj);
    }

    @Override
    public List<Prontuario> listarTodos() {
        return prontuarios;
    }

    @Override
    public void remover(int id) {
        this.prontuarios.remove(id);
    }
}
