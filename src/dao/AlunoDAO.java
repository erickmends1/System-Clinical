package dao;

import models.pessoa.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO implements DAO<Aluno>{

    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void salvar(Aluno obj) {
        this.alunos.add(obj);
    }

    @Override
    public void alterar(int id, Aluno obj) {
        this.alunos.set(id, obj);
    }

    @Override
    public List<Aluno> listarTodos() {
        return alunos;
    }

    @Override
    public void remover(int id) {
        this.alunos.remove(id);
    }
}
