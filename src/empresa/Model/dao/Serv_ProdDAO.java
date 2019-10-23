package Empresa.model.dao;

import Empresa.model.InterfaceDAO;

import java.sql.Connection;
import java.util.List;

public class Serv_ProdDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Serv_ProdDAO servprod) {
        return false;
    }

    public boolean alterar(Serv_ProdDAO servprod) {
        return false;
    }

    public boolean remover(Serv_ProdDAO servprod) {
        return false;
    }

    public Serv_ProdDAO buscar(Serv_ProdDAO servprod) {
        return null;
    }

    protected List<Serv_ProdDAO> listar() {
        return null;
    }
}
