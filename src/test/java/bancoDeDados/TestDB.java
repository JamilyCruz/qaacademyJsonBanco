package bancoDeDados;

import bancoDados.OracleDb;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class TestDB {
    @Test
    public void testeSelect() throws SQLException {
        OracleDb oracleDb = new OracleDb();
        oracleDb.createConnection();
        String valor = oracleDb.executeSelect("SELECT *FROM dados_users WHERE ID_USER = 2");
        Assert.assertEquals("Jamily Cruz", valor);
    }

    @Test
    public void testeInsert() throws SQLException {
        OracleDb oracleDb = new OracleDb();
        oracleDb.createConnection();
        oracleDb.insertQuery("INSERT INTO DADOS_USERS (ID_USER, NOME,CPF,ENDERECO)\n" +
                "VALUES (3, 'Tiago', '32870919815', 'Rua 3')");
        String valor = oracleDb.executeSelect("SELECT *FROM dados_users WHERE ID_USER = 3");
        Assert.assertEquals("Tiago", valor);
    }


}
