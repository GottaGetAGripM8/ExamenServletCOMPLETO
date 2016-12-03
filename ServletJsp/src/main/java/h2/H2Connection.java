package h2;

import java.io.File;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;

public class H2Connection {
	
	private static File pathFile = Paths.get(".").toAbsolutePath().normalize().toFile();
    private static String ruta = pathFile.toString() + "/src/main/resources/";
    
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:" + ruta + "DBtest";
	
    private static final String USER = "sa";
    private static final String PASS = "";
	
	public static Connection conn = null;
    public static Statement stmt = null;
    
	public static void main(String[] args) {
		System.out.println(ruta);
	}

	public static String getJdbcDriver() {
		return JDBC_DRIVER;
	}

	public static String getDbUrl() {
		return DB_URL;
	}

	public static String getUser() {
		return USER;
	}

	public static String getPass() {
		return PASS;
	}

}
