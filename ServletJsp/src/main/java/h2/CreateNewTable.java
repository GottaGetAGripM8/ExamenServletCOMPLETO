package h2;

public class CreateNewTable { 
	
	private static H2Query h2query = new H2Query();
	
	public static void main(String[] args) {
		createTablePais();
		createTableIdioma();
	}
	public static void createTablePais() {
		
		String sqlPais = "CREATE TABLE IF NOT EXISTS Paises " +
					 " (nomPais VARCHAR(255), " +
				     " PRIMARY KEY(nomPais))";

		h2query.doSqlQuery(sqlPais);
		
		
		
	}

	public static void createTableIdioma() {
		
		String sqlIdioma = "CREATE TABLE IF NOT EXISTS Idiomas " +
				 " (nomIdioma VARCHAR(255), " +
			     " nomPais VARCHAR(255), " +
			     " PRIMARY KEY(nomIdioma))";

		h2query.doSqlQuery(sqlIdioma);
	
	} 
	
} 