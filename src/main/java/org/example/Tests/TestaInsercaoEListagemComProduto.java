package org.example.Tests;

import org.example.dao.ProdutoDAO;
import org.example.factory.ConnectionFactory;
import org.example.modelo.Produto;

import java.sql.*;
import java.util.List;

public class TestaInsercaoEListagemComProduto {

    public static void main(String[] args) throws SQLException {
        Produto comoda = new Produto("Comoda", "Comoda vertical");

        try(Connection connection = new ConnectionFactory().recuperaConexao()){
            ProdutoDAO produtoDAO = new ProdutoDAO(connection);
            produtoDAO.salvarProduto(comoda);
            List<Produto> produtos = produtoDAO.listar();
            produtos.stream().forEach(lp -> System.out.println(lp));
        }

    }
}
