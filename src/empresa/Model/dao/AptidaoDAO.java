package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Apto;

import java.sql.Connection;
import java.util.List;

public class AptidaoDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Apto apto) {
        return false;
    }

    public boolean alterar(Apto apto) {
        return false;
    }

    public boolean remover(Apto apto) {
        return false;
    }

    public Apto buscar(Apto apto) {
        return null;
    }

    protected List<Apto> listar() {
        return null;
    }


}
