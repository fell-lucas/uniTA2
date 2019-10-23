package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Produto;

import java.sql.Connection;
import java.util.List;

public class ProdutoDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

    }

    public boolean inserir(Produto prod) {
        return false;
    }

    public boolean alterar(Produto prod) {
        return false;
    }

    public boolean remover(Produto prod) {
        return false;
    }

    public Produto buscar(Produto prod) {
        return null;
    }

    protected List<Produto> listar() {
        return null;
    }
}
