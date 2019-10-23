package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.ServicoPrestado;

import java.sql.Connection;
import java.util.List;

public class ServicoPrestadoDAO implements InterfaceDAO {
    private Connection connection;
    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean inserir(ServicoPrestado servP) {
        return false;
    }

    public boolean alterar(ServicoPrestado servP) {
        return false;
    }

    public boolean remover(ServicoPrestado servP) {
        return false;
    }

    public ServicoPrestado buscar(ServicoPrestado servP) {
        return null;
    }

    public List<ServicoPrestado> listar() {
        return null;
    }
}
