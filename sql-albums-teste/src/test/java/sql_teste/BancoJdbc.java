package sql_teste;

import org.junit.jupiter.api.Test;

import dao.UserPosDAO;
import model.Debut;
import model.Fearless;
import model.Lover;
import model.O1989;
import model.Red;
import model.Reputation;
import model.SpeakNow;

public class BancoJdbc {
	
	@Test
	public void initBanco() {
		
		UserPosDAO userPosDAO = new UserPosDAO();
		Lover lover  = new Lover();
		
		lover.setId(2);
		lover.setNome("false god");
		
		userPosDAO.salvar(lover);
				
	}
	
	 @Test
	public void initDeletar () {
		
		try {
			
			UserPosDAO dao = new UserPosDAO();
			dao.deletar(3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 

} 
