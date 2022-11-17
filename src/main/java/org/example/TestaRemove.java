package org.example;

import org.example.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemove {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory =new ConnectionFactory();

        Connection connection = connectionFactory.recuperaConexao();

        PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
        stm.setInt(1,2);

        stm.execute();

        Integer linhasModificadas = stm.getUpdateCount();

        System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);
    }


}
