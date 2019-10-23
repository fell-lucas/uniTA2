package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Funcionario;

import java.sql.Connection;
import java.util.List;

public class FuncionarioDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Funcionario func) {
        return false;
    }

    public boolean alterar(Funcionario func) {
        return false;
    }

    public boolean remover(Funcionario func) {
        return false;
    }

    public Funcionario buscar(Funcionario func) {
        return null;
    }

    protected List<Funcionario> listar() {
        return null;
    }
}
