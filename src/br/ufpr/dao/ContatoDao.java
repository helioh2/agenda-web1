package br.ufpr.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import br.ufpr.jdbc.MySqlConnectionFactory;
import br.ufpr.modelo.Contato;

public class ContatoDao {

	// a conexão com o banco de dados
	private Connection connection;

	public ContatoDao() {  //pode ser melhorado com injeção de dependência connection
		this.connection = new MySqlConnectionFactory().getConnection();
	}
	
	
	public void adiciona(Contato contato) {
	    String sql = "insert into contatos " +
	            "(nome,email,endereco,dataNascimento)" +
	            " values (?,?,?,?)";

	    try {
	        // prepared statement para inserção
	        PreparedStatement stmt = connection.prepareStatement(sql);

	        // seta os valores

	        stmt.setString(1,contato.getNome());
	        stmt.setString(2,contato.getEmail());
	        stmt.setString(3,contato.getEndereco());
	        stmt.setDate(4, new Date(
	                contato.getDataNascimento().toEpochSecond()*1000));

	        // executa
	        stmt.execute();
	        stmt.close();
	        
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public List<Contato> getLista() {
		String sql = "select * from contatos";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			List<Contato> contatos = new ArrayList<Contato>();
			
			while (rs.next()) {
				Contato contato = new Contato();
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				contato.setDataNascimento(ZonedDateTime.ofInstant(
						Instant.ofEpochMilli(rs.getDate("dataNascimento").getTime()), 
						ZoneId.systemDefault()) );
				
				contatos.add(contato);
			}
			
			stmt.close();
			return contatos;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
	}
	
	
}
