package Empresa.model;

import java.sql.Connection;
import java.util.List;

public interface InterfaceDAO {
    public Connection getConnection();
    public void setConnection(Connection connection);
}
