package dao;

import enums.Perfil;
import models.pessoa.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO implements DAO<Funcionario>{

    private List<Funcionario> funcionarios = new ArrayList<>();

    public FuncionarioDAO() {
    }

    @Override
    public void salvar(Funcionario obj) {
        this.funcionarios.add(obj);
    }

    @Override
    public void alterar(int id, Funcionario obj) {
        this.funcionarios.set(id, obj);
    }

    public Funcionario buscarPorLogin(String login) {
        Funcionario funcionario = null;
        for (int i = 0; i < this.funcionarios.size(); i++) {
            if (funcionarios.get(i).getLogin().equals(login)) {
                funcionario = funcionarios.get(i);
            }
        }
        return funcionario;
    }

    @Override
    public List<Funcionario> listarTodos() {
        return funcionarios;
    }

    @Override
    public void remover(int id) {
        this.funcionarios.remove(id);
    }
}
