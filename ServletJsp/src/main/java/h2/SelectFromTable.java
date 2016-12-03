
package h2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Idioma;

public class SelectFromTable {
	
	private static H2Query h2query = new H2Query();
	private static List<Idioma> listLanguages= new ArrayList<Idioma>();
	public List SelectTableIdiomas() {
		try {
			String sql = "SELECT * FROM Idiomas";
		
			h2query.doSqlQuery(sql);	
		
			H2Connection.conn = DriverManager.getConnection(H2Connection.getDbUrl(), H2Connection.getUser(), H2Connection.getPass());
			H2Connection.stmt = H2Connection.conn.createStatement();
		
			ResultSet rs = H2Connection.stmt.executeQuery(sql);
	
			while(rs.next()){
				Idioma idiomaInDatabase = new Idioma();
				
				idiomaInDatabase.setnomIdioma(rs.getString(1)); 
				
				idiomaInDatabase.setnomPais(rs.getString(2)); 
				
				listLanguages.add(idiomaInDatabase);
			}
			
			} catch (SQLException se) {
                se.printStackTrace();
			} finally {
				try {
	                if (H2Connection.stmt!=null)
	                	H2Connection.conn.close();
	            } catch (SQLException se) {
	            } //do nothing
	            try {
	                if (H2Connection.conn!= null)
	                	H2Connection.conn.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	            return listLanguages;
			}
	}

}