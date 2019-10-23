package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Pessoa;

import java.sql.Connection;
import java.util.List;

public class PessoaDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Pessoa pess) {
        return false;
    }

    public boolean alterar(Pessoa pess) {
        return false;
    }

    public boolean remover(Pessoa pess) {
        return false;
    }

    public Pessoa buscar(Pessoa pess) {
        return null;
    }

    protected List<Pessoa> listar() {
        return null;
    }
}
