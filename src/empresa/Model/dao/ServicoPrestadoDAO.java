package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.ServicoPrestado;

import java.sql.Connection;
import java.util.List;

public class ServicoPrestadoDAO implements InterfaceDAO {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void setConnection(Connection connection) {

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

    protected List<ServicoPrestado> listar() {
        return null;
    }
}
