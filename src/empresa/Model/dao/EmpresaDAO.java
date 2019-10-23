package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Empresa;

import java.sql.Connection;
import java.util.List;

public class EmpresaDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Empresa empresa) {
        return false;
    }

    public boolean alterar(Empresa empresa) {
        return false;
    }

    public boolean remover(Empresa empresa) {
        return false;
    }

    public Empresa buscar(Empresa empresa) {
        return null;
    }

    protected List<Empresa> listar() {
        return null;
    }
}
