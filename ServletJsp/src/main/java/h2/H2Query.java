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
            try {
                if (H2Connection.stmt!=null)
                	H2Connection.conn.close();
            } catch (SQLException se) {
            } 
            try {
                if (H2Connection.conn!= null)
                	H2Connection.conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } 
        } 
        System.out.println("Goodbye!");
    }
}
