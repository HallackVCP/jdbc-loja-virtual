package org.example.Controller;

import org.example.dao.ProdutoDAO;
import org.example.factory.ConnectionFactory;
import org.example.modelo.Produto;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;



public class ProdutoController {

	private ProdutoDAO produtoDAO;

	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperaConexao();
		this.produtoDAO=new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
	}

	public void salvar(Produto produto) {
		this.produtoDAO.salvarProduto(produto);
	}

	public List<Produto> listar() {
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome,descricao,id);
	}
}
