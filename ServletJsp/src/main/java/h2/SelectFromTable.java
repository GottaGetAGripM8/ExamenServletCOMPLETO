
package h2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Language;

public class SelectFromTable {
	
	private static H2Query h2query = new H2Query();
	private static List<Language> listLanguages= new ArrayList<Language>();
	
	private final static String SQL = "SELECT * FROM Idiomas";
	
	public List<Language> SelectTableLanguages() {
		try {
			
			h2query.doSqlQuery(SQL);	
		
			H2Connection.conn = DriverManager.getConnection(H2Connection.getDbUrl(), H2Connection.getUser(), H2Connection.getPass());
			H2Connection.stmt = H2Connection.conn.createStatement();
		
			ResultSet rs = H2Connection.stmt.executeQuery(SQL);
	
			while(rs.next()){
				Language LangInDatabase = new Language();
				
				LangInDatabase.setnameLang(rs.getString(1)); 
				
				LangInDatabase.setnameCountry(rs.getString(2)); 
				
				listLanguages.add(LangInDatabase);
			}
			
			} catch (SQLException se) { 
                se.printStackTrace();
			} finally {
				
				closeH2Connection();
	            closeH2Statement();
	        } 
		
		return listLanguages;
	}
	
	public void closeH2Connection(){
		try {
            if (H2Connection.stmt!=null)
            	H2Connection.conn.close();
        } catch (SQLException se) {
        	se.printStackTrace();
        } 
	}
	
	public void closeH2Statement(){
		try {
            if (H2Connection.conn!= null)
            	H2Connection.conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
	}
	

}