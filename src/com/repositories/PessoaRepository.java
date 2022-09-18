package com.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.entities.Pessoa;
import com.factories.ConnectionFactory;
import com.interfaces.IRepository;

public class PessoaRepository implements IRepository<Pessoa> {
	
	@Override
	public void create(Pessoa obj) throws Exception {

		//abrindo uma conexão com o banco de dados
		Connection connection = ConnectionFactory
		.createConnection();
		//executando um comando SQL no banco de dados
		PreparedStatement statement = connection.prepareStatement
		("INSERT INTO PESSOA(NOME, CPF, EMAIL) VALUES(?, ?, ?)");
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getCpf());
		statement.setString(3, obj.getEmail());
		statement.execute();

		connection.close();
	}
	@Override
	public void update(Pessoa obj) throws Exception {
	// TODO Auto-generated method stub
	}
	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Pessoa> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
