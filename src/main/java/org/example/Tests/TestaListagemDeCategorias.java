package org.example.Tests;

import org.example.dao.CategoriaDAO;
import org.example.factory.ConnectionFactory;
import org.example.modelo.Categoria;
import org.example.modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemDeCategorias {

    public static void main(String[] args) throws SQLException {

        try(Connection connection = new ConnectionFactory().recuperaConexao()) {
            CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
            List<Categoria> listaDeCategorias = categoriaDAO.listarComProduto();
            listaDeCategorias.stream().forEach(ct -> {
                System.out.println(ct.getNome());
                for(Produto produto : ct.getProdutos()) {
                    System.out.println(ct.getNome() + " - " + produto.getNome());
                }
            });
        }
    }
}