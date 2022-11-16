package org.example;

import java.sql.*;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory =new ConnectionFactory();

        Connection connection = connectionFactory.recuperaConexao();
        System.out.println("Fechando conexão! !");

        PreparedStatement statement = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
        statement.execute();

        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()){
            Integer id = resultSet.getInt("ID");
            System.out.println(id);
            String nome = resultSet.getString("NOME");
            System.out.println(nome);
            String descricao = resultSet.getString("DESCRICAO");
            System.out.println(descricao);
        }



        connection.close();


    }
}
