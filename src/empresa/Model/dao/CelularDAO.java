package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Celular;

import java.sql.Connection;
import java.util.List;

public class CelularDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Celular celular) {
        return false;
    }

    public boolean alterar(Celular celular) {
        return false;
    }

    public boolean remover(Celular celular) {
        return false;
    }

    public Celular buscar(Celular celular) {
        return null;
    }

    public List<Celular> listar() {
        return null;
    }


}
