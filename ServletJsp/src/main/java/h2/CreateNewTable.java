package h2;

public class CreateNewTable { 
	
	private static H2Query h2query = new H2Query();
	
	public static void main(String[] args) {
		createTablePais();
		createTableIdioma();
	}
	public static void createTablePais() {
		
		final String sqlCountry = "CREATE TABLE IF NOT EXISTS Paises " +
					 " (nomPais VARCHAR(255), " +
				     " PRIMARY KEY(nomPais))";

		h2query.doSqlQuery(sqlCountry);
		
		
		
	}

	public static void createTableIdioma() {
		
		final String sqlLang = "CREATE TABLE IF NOT EXISTS Idiomas " +
				 " (nomIdioma VARCHAR(255), " +
			     " nomPais VARCHAR(255), " +
			     " PRIMARY KEY(nomIdioma))";

		h2query.doSqlQuery(sqlLang);
	
	} 
	
} 