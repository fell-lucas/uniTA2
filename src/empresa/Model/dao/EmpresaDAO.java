package Empresa.model.dao;

import Empresa.model.InterfaceDAO;
import Empresa.model.domain.Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpresaDAO implements InterfaceDAO {
    private Connection connection;

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean inserir(Empresa empresa) {
        String sql = "INSERT INTO empresa(nome, email, senha) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, empresa.getNome());
            stmt.setString(2, empresa.getEmail());
            stmt.setString(3, empresa.getSenha());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterar(Empresa empresa) {
        return false;
    }

    public boolean remover(Empresa empresa) {
        return false;
    }

    public Empresa buscar(Empresa empresa) {
        return null;
    }

    public List<Empresa> listar() {
        String sql = "SELECT * FROM empresa";
        List<Empresa> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Empresa empresa = new Empresa();
                empresa.setId(resultado.getInt("id"));
                empresa.setNome(resultado.getString("nome"));
                //cliente.setCpf(resultado.getString("cpf"));
                //cliente.setTelefone(resultado.getString("telefone"));
                retorno.add(empresa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
