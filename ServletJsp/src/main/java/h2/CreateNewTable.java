package h2;

public class CreateNewTable { 
	
	private static H2Query h2query = new H2Query();
	
	private final static String sqlCountry = "CREATE TABLE IF NOT EXISTS Paises " + " (nomPais VARCHAR(255), " + " PRIMARY KEY(nomPais))";
	
	private final static String sqlLang = "CREATE TABLE IF NOT EXISTS Idiomas " + " (nomIdioma VARCHAR(255), " + " nomPais VARCHAR(255), " + " PRIMARY KEY(nomIdioma))";
	
	public void main(String[] args) {

	}
	
	public void createTablePais() {
		h2query.doSqlQuery(sqlCountry);
	}

	public void createTableIdioma() {
		h2query.doSqlQuery(sqlLang);
	} 
	
} 