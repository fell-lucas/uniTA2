package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Estoque;

import java.sql.Connection;
import java.util.List;

public class EstoqueDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Estoque est) {
        return false;
    }

    public boolean alterar(Estoque est) {
        return false;
    }

    public boolean remover(Estoque est) {
        return false;
    }

    public Estoque buscar(Estoque est) {
        return null;
    }

    protected List<Estoque> listar() {
        return null;
    }
}