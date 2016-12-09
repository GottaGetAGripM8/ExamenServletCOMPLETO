package h2;

import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Query {
	
    public void doSqlQuery (String sql){
    	
    	try {
            Class.forName(H2Connection.getJdbcDriver());

            H2Connection.conn = DriverManager.getConnection(H2Connection.getDbUrl(), H2Connection.getUser(), H2Connection.getPass());

            H2Connection.stmt = H2Connection.conn.createStatement();

            H2Connection.stmt.executeUpdate(sql);
            
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	
        	closeH2Connection();
            closeH2Statement();
        } 
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
