package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Cliente;

import java.sql.Connection;
import java.util.List;

public class ClienteDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Cliente cliente) {
        return false;
    }

    public boolean alterar(Cliente cliente) {
        return false;
    }

    public boolean remover(Cliente cliente) {
        return false;
    }

    public Cliente buscar(Cliente cliente) {
        return null;
    }

    protected List<Cliente> listar() {
        return null;
    }
}
