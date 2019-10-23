package Empresa.model.dao;

import Empresa.model.InterfaceDAO;

import java.sql.Connection;
import java.util.List;

public class ServicoDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(ServicoDAO serv) {
        return false;
    }

    public boolean alterar(ServicoDAO serv) {
        return false;
    }

    public boolean remover(ServicoDAO serv) {
        return false;
    }

    public ServicoDAO buscar(ServicoDAO serv) {
        return null;
    }

    protected List<ServicoDAO> listar() {
        return null;
    }
}