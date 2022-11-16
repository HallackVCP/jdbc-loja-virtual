package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemove {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory =new ConnectionFactory();

        Connection connection = connectionFactory.recuperaConexao();

        Statement stm = connection.createStatement();

        stm.execute("DELETE FROM PRODUTO WHERE ID > 2");

        Integer linhasModificadas = stm.getUpdateCount();

        System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);
    }


}
