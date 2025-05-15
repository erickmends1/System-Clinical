package dao;

import java.util.List;

public interface DAO<T>{
    public abstract void salvar(T obj);
    public abstract void alterar(int id, T obj);
    public abstract List<T> listarTodos();
    public abstract void remover(int id);
}
