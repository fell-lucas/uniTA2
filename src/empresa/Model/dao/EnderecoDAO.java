package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Endereco;

import java.sql.Connection;
import java.util.List;

public class EnderecoDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Endereco end) {
        return false;
    }

    public boolean alterar(Endereco end) {
        return false;
    }

    public boolean remover(Endereco end) {
        return false;
    }

    public Endereco buscar(Endereco end) {
        return null;
    }

    protected List<Endereco> listar() {
        return null;
    }
}
