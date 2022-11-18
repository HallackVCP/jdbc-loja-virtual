package org.example.Controller;

import org.example.dao.CategoriaDAO;
import org.example.factory.ConnectionFactory;
import org.example.modelo.Categoria;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class CategoriaController {

	private CategoriaDAO categoriaDAO;

	public CategoriaController() {
		Connection connection = new ConnectionFactory().recuperaConexao();
		this.categoriaDAO = new CategoriaDAO(connection);
	}

	public List<Categoria> listar() {

		return this.categoriaDAO.listar();
	}
}
