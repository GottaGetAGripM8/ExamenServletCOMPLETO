package h2package;

import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Query {
	
    public void doSqlQuery (String sql){
    	
    	try {
            //Register JDBC driver
            Class.forName(H2Connection.getJdbcDriver());

            //Open a connection
            H2Connection.conn = DriverManager.getConnection(H2Connection.getDbUrl(), H2Connection.getUser(), H2Connection.getPass());

            //Execute a query
            H2Connection.stmt = H2Connection.conn.createStatement();

            H2Connection.stmt.executeUpdate(sql);
            
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
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
            } //end finally try
        } //end try
        System.out.println("Goodbye!");
    }
}
