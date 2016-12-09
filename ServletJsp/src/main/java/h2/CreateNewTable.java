package h2;

public class CreateNewTable { 
	
	private static H2Query h2query = new H2Query();
	
	private final static String SQLCOUNTRY = "CREATE TABLE IF NOT EXISTS Paises " + " (nomPais VARCHAR(255), " + " PRIMARY KEY(nomPais))";
	
	private final static String SQLLANG = "CREATE TABLE IF NOT EXISTS Idiomas " + " (nomIdioma VARCHAR(255), " + " nomPais VARCHAR(255), " + " PRIMARY KEY(nomIdioma))";
	
	public void createTablePais() {
		h2query.doSqlQuery(SQLCOUNTRY);
	}

	public void createTableIdioma() {
		h2query.doSqlQuery(SQLLANG);
	} 
	
} 