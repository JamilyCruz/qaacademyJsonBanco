package bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class OracleDb {
    Connection connection;
    public void createConnection() throws SQLException {
        try {
            System.out.println("Iniciando conexão com o banco");
            String serverName = "192.168.1.217";
            String portNumber = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
            String username = "system";
            String password = "Mari@2005";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }


}
