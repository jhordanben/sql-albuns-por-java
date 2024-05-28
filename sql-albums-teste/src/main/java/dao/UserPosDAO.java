package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory.Result;
import conexaojdbc3.SingleConnection;
import model.Debut;
import model.Fearless;
import model.Lover;
import model.O1989;
import model.Red;
import model.Reputation;
import model.SpeakNow;

public class UserPosDAO {
	
	public Connection connection;
	
	public UserPosDAO() {
		connection = SingleConnection.getConnection();
		
	}
	
	public void salvar (Lover lover) {
		try {
			
			String sql = "insert into lover (id, nome) values (?, ?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setInt(1, lover.getId());
			insert.setString(2, lover.getNome());
			insert.execute();
			connection.commit(); 
			
		} catch (Exception e) {
			try {
				
				connection.rollback();
				
			} catch (SQLException e1) {
				e.printStackTrace();
				
			}
			e.printStackTrace();
		}
		
	}
		
	/* public List<SpeakNow> listar () throws Exception {
		List<SpeakNow> list = new ArrayList<SpeakNow>();
		
		String sql = "select * from speaknow";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) {
			SpeakNow speaknow = new SpeakNow();
			speaknow.setId(resultado.getInt("id"));
			speaknow.setNome(resultado.getString("nome"));
			
			list.add(speaknow);
		}
		
		return list;
		
	} */
	
	/*public Debut buscar (int id) throws Exception {
		Debut retorno = new Debut();
		
		String sql = "select * from debut where nome " + id;
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) {
			
			retorno.setId(resultado.getInt(id));
			retorno.setNome(resultado.getString("nome"));
			
		}
		
		return retorno;
	} */
	
	public void deletar (int id) {
		
		try {
			
			String sql = "delete from reputation where id = " + id;
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);
			preparedStatement.execute();
			connection.commit();
			
		} catch (Exception e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
				e.printStackTrace();
		}
	}
		
}
